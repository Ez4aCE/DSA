def solve():
    t=int(input())

    for j in range (t):
        n=int(input())
        lt=list(map(int,input().split()))

        xor=0
        for e in lt:
            xor = xor^e

        if n%2==0:
            print(0 if xor==0 else -1)
        else:
            print(xor)



if __name__=="__main__":
    solve()