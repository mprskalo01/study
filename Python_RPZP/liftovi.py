def liftovi(putovanja):
    mali, veliki = 0, 0
    presao = 0
    for kat, smjer in putovanja:
        if smjer == "d":
            polaziste = kat
            odrediste = 0
        elif smjer == "g":
            polaziste = 0
            odrediste = kat
        udaljenost_malog = abs(mali - polaziste)
        udaljenost_velikog = abs(veliki - polaziste)

        if udaljenost_malog <= udaljenost_velikog:
            presao += udaljenost_malog + kat
            mali = odrediste
        else:
            presao += udaljenost_velikog + kat
            veliki = odrediste

    return presao
print(liftovi([(5, "d"), (6, "g"), (3, "g"), (4, "g")]))