def solve():
    t=int(input())
    for j in range(t):
        n=int(input())
        lt=list(map(int,input().split()))
        score=0
        for i in range(0,n-1):
            if lt[i]%2==0 and lt[i+1]%2==0:
                score+=1
            elif lt[i]%2!=0 and lt[i+1]%2!=0:
                score+=1

        print(score)



if __name__=="__main__":
    solve()