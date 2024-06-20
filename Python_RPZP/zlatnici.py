def zlatnici(mase, m):
    mase.sort()
    ukupna_masa = 0
    uzeto_zlatnika = 0
    for masa in mase:
        if ukupna_masa + masa <= m:
            ukupna_masa += masa
            uzeto_zlatnika += 1
        else:
            break
    return uzeto_zlatnika

# uneses argumente u poziv funkcije i tjt
print(zlatnici([1,3,4,5,6,2],15))