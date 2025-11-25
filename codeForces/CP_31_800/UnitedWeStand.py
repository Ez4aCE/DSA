def solve():
    tests = int(input())
    for j in range(tests):
        length = int(input())
        lt = list(map(int,input().split()))
        high = max(lt)
        b = list()
        c=list()
        for num in lt:
            if high==num :
                c.append(num)
            else :
                b.append(num)
        if len(b)!=0 and len(c)!=0:
            print(len(b),len(c))
            print(*b)
            print(*c)
        else:
            print(-1)

if __name__ == "__main__":
    solve()