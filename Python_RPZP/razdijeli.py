def razdijeli(n):
    ukupno = 0
    for a in range(1, n + 1):
        for b in range(1, n + 1):
            for c in range(1, n + 1):
                if a <= b <= c and a + b + c == n:
                    ukupno += 1
    return ukupno

print(razdijeli(150))