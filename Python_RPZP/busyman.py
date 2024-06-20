def busyman(poslovi):
    def zadnji(posao):
        return posao[1]
    poslovi = sorted(poslovi, key=zadnji)
    obavljeno = 0
    slobodan_od = 0
    for pocetak, kraj in poslovi:
        if pocetak >= slobodan_od:
            obavljeno += 1
            slobodan_od = kraj
    return obavljeno

# Samo pozoves funkciju i uneses primjer i ispises
print(busyman([(1, 7), (5, 8), (7, 8), (1, 8)]))