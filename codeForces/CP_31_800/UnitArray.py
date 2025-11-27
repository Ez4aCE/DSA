def solve():
    tests= int(input())

    for i in range(tests):
        length=int(input())
        lt=list(map(int,input().split()))
        countPos=0;
        countNeg=0;
        for i in lt:
            if i<0:
                countNeg+=1
            else:
                countPos+=1
    
        flips=0
        while(countPos<countNeg or countNeg%2!=0):
            flips+=1
            countNeg-=1
            countPos+=1
        print(flips)

if __name__=="__main__":
    solve()