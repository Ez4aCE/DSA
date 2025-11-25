def solve():
    tests = int(input())
    for i in range(tests):
        length=int(input())
        lt = list(map(int,input().split()))
        if sum(lt)%2==0:
            print("YES")
        else:
            print('NO')
if  __name__ == "__main__":
    solve() 