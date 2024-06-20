def razlika(niz):
    niz.sort()
    najmanja_razlika = float("inf")
    for i in range(len(niz) - 1):
        razlika = niz[i + 1] - niz[i]
        if razlika < najmanja_razlika:
            najmanja_razlika = razlika
            trazeni_brojevi = (niz[i], niz[i + 1])
    return trazeni_brojevi

#uneses argumente
print(razlika([6, -9, 24, -12, 19, -15, 8, 15, -5]))