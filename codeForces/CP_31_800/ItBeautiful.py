def solve():
    t=int(input())
    for i in range(t):
        n=int(input())
        lt=list(map(int,input().split()))
        

        mx=max(lt)
        mi=min(lt)

        if mx!=mi:
            print("YES")
            if(lt[len(lt)-1]==lt[1]):
                lt[0],lt[1]=lt[1],lt[0]
            
            lt[0],lt[len(lt)-1]=lt[len(lt)-1],lt[0]
            print(*lt)
        else:
            print("NO")
        




if __name__ =="__main__":
    solve()