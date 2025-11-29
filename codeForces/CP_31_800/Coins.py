def solve():
    tests=int(input())
    for i in range(tests):
        lt = list(map(int,input().split()))
        n=lt[0]
        k=lt[1]
        if(n==k):
            print("YES")
        elif(k%2==0 and n%2!=0):
            print("NO")
        else:
            print("YES")



if __name__=="__main__":
    solve()