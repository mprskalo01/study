def smotra(n):
    best = (1, n)
    for r in range(2, n):
        if n % r == 0:
            s = n // r
            if s >= r and best[1] - best[0] > s - r:
                best = (r, s)
    return best

print(smotra(200))

# Pronalazak dimenzija pravokutnika činimo ispitivanjem svih
# mogućnosti, tj. svih mogućih rastava N = R × S.
# • U pomoćnoj varijabli best pratimo "dosad" najbolje dimenzije
# (R, S), tj. one koje imaju najmanju dotad pronađenu razliku S - R.
# • Dovoljno je isprobati sve mogućnosti za broj redova, jer broj stupaca
# lako računamo iz broja redova.
# – za svaki mogući broj redova R provjeravamo je li N djeljiv s R i,
# – ako jest, računamo broj stupaca S i razliku S - R.
# – ako je ta razlika manja od trenutačno najmanje razlike, ažuriramo dosad
# najbolje dimenzije u varijabli best