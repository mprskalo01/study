def jabuke(n, k, s):
    for x in range(1, s):
        prijatelj_daje = x
        ukupno_jabuka = x
        for prijatelj in range(1, n):
            prijatelj_daje += k
            ukupno_jabuka += prijatelj_daje
        if ukupno_jabuka == s:
            return x
        
print(jabuke(4, 7, 442))