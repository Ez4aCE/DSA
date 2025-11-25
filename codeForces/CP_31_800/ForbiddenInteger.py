def solve():
    tests=int(input())
    for i in range(tests):
        num , k , x = map(int,input().split())
        if x!=1:
            print("YES")
            lt=[1]*num
            print(num)
            print(*lt)
        elif (num%2!=0 and k==2 and x==1) or (k==1 and x==1):
            print("NO")
        else:
            if(num%2==0):

                print("YES")
                lt=[2]*(num//2)
                print(len(lt))
                print(*lt)
            else:
                print("YES")
                num-=3
                lt=[2]*(num//2)
                lt.append(3)
                print(len(lt))
                print(*lt)




            

if __name__ == "__main__":
    solve()