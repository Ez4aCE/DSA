def solve():
    tests=int(input())

    for i in range(tests):
        length=int(input())
        s=input()
        l=0
        r=length-1

        while(l<r and s[l]!=s[r]):
            l+=1
            r-=1
        print(r-l+1)

if __name__=="__main__":
    solve()