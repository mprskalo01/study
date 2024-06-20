def zabava(dolasci_odlasci):
    dogadjaji = []
    for a, b in dolasci_odlasci:
        dogadjaji.append((a, 0))
        dogadjaji.append((b, 1))
    maks = 0
    ljudi = 0
    for d in sorted(dogadjaji):
        if d[1] == 0: # dolazak
            ljudi += 1
            maks = max(maks, ljudi)
        if d[1] == 1: # odlazak
            ljudi -= 1
    return maks

#uneses zadane argumente u funkciju i ispises
print(zabava([(1, 3), (2, 3), (3, 4), (5, 7)]))