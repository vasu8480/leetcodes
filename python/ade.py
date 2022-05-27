def count(N):
    if N == 0:
        return 1
    a = 0
    t = 1
    while N:
        if N % 2 == 0:
            a += t
        t = t * 2
        N = N // 2
    return a


print(count(5))
