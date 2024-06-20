def cedeovi(player, slusanje):
    for cd in slusanje:
        i = player.index(cd)
        
        player[-1], player[i] = player[i], player[-1]
    return player[:-1]

#Ovde su malo kompliciraniji argumenti ali imas koje
#trebas unijet zadano u zadatku
print(cedeovi(["SEVERINA","ROZGA","MAGAZIN","JACQUES"],["ROZGA"]))