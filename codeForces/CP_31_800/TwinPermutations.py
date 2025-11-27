def solve():
    tests=int(input())
    for k in range(tests):
        length=int(input())
        lt=list(map(int,input().split()))
        res=list()
        for i in lt:
            res.append(length+1-i)

        print(*res)


if __name__ == "__main__":
    
    solve()