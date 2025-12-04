def gcd(a, b):
    if b == 0:
        return a
    else:
        return gcd(b, a % b)
def solve():
    t=int(input())

    for j in range(t):
        n=int(input())
        lt=list(map(int,input().split()))
        
        yes=False
        for i in range(n):
            
            for k in range(i+1,n):
                if(gcd(lt[i],lt[k])<=2):
                    yes=True
                    break
            if yes:
                break
        if yes:
            print("Yes")
        else:
            print("No")



if __name__=="__main__":
    solve()