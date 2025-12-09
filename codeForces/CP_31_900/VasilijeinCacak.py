def solve():
    t=int(input())

    for i in range(t):
        n,k,x = map(int, input().split())
        smallestSum = (k*(k+1))//2
        largestSum = (n*(n+1))//2 - ((n-k)*(n-k+1))//2
        if(x>=smallestSum and x<=largestSum):
            print("Yes")
        else:
            print("No")



if __name__=="__main__":
    solve()