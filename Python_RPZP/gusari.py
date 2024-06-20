def gusari(n):
    prvi = n // 4
    n -= n // 4

    drugi = n // 4
    n -= n // 4

    treci = n // 4
    n -= n // 4

    cetvrti = n // 4
    n -= n // 4

    return [prvi, drugi, treci, cetvrti]

#uneses argumente kad pozoves funkciju tjt
print(gusari(16))