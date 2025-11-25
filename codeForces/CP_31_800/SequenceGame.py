def solve():
    tests=int(input())
    for i in range (tests):
        length=int(input())
        arr = list(map(int, input().split()))
        res=list()
        res.append(arr[0])
        for j in range (1,len(arr)):
            res.append(arr[j])
            if arr[j]<arr[j-1]:
                res.append(arr[j])

        print(len(res))
        print(*res)



if __name__ == "__main__":
    solve()