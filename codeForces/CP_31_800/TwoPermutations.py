def solve():
    t= int(input())
    for i in range(t):
        n,a,b=map(int,input().split())
        if(a+b+2<=n) or (a==n and b==n):
            print("YES")
        else:
            print("NO")


if __name__=="__main__":
    solve()