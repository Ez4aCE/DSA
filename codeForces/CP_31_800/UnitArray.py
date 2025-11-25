def solve():
    tests= int(input())

    for i in range(tests):
        length=int(input())
        lt=list(map(int,input().split()))
        sum=0;
        for e in lt:
            sum+=e
        sum=abs(sum)
        if sum%2==0:
            print(sum//2)
        else:
            print(sum//2)

if __name__=="__main__":
    solve()