def solve():
    t=int(input())

    for i in range(t):
        a,b,n = map(int,input().split())
        lt=list(map(int,input().split()))

        timer = b

        for e in lt:
            timer+=min(e,a-1)

        print(timer)



if __name__=="__main__":
    solve()