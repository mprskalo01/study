def f7(poredak):
    N = len(poredak)
    poredak.sort(reverse=True)
    koliko = 1
    for K in range(1, N):
        kopija = poredak[:]
        for j in range(K):
            kopija[j] += j + 1
        if poredak[K] + N >= max(kopija[:K]):
            koliko += 1
    return koliko

print(f7([15, 14, 15, 12, 14]))

# Promotrimo događaje koji mogu biti dolazak ili odlazak sa zabave
# Ako te događaje obrađujemo redom koji su se dogodili od prvog
# dolaska do zadnjeg odlaska, usput možemo pratiti broj ljudi na
# zabavi, znajući točno kako se on mijenjao.
# Sortirat ćemo događaje po vremenu.
# Svaki je događaj opisan vremenom i tipom (dolazak ili odlazak) i
# možemo ga bilježiti kao par (vrijeme, tip) gdje možemo staviti:
# tip = 0 za dolazak
# tip = 1 za odlazak
# Listu parova Python će sortirati po prvom članu (vrijeme), pri čemu
# će u slučaju jednakosti prednost imati manji tip (dolazak)