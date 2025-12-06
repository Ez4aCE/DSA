def solve():
    t=int(input())

    for j in range(t):
        n,k=map(int,input().split())
        
        s=input()
        d=dict()
        for e in s:
            d[e]=d.get(e,0)+1

        odds=0
        for e in d:
            if d[e]%2!=0:
                odds+=1

        m=odds-k

        if(m<2):
            print("Yes")

        else:
            print("No")



    


if __name__=="__main__":
    solve()