def solve():
    tests=int(input())

    for i in range(tests):
        length=int(input())
        lt=list(map(int,input().split()))

        maxBlank=0;
        currBlank=0;
        for e in lt:
            if e==0:
                currBlank+=1
            else:
                currBlank=0
            maxBlank=max(currBlank,maxBlank)
        print(maxBlank)


if __name__=="__main__":
    solve()

