def solve():
    t=int(input())
    for i in range(t):
        n=int(input())
        score=0
        while(n>9):
            score+=9
            n//=10

        score+=n%10

        print(score)



if __name__=="__main__":
    solve()