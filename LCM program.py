a = int(input("Enter first no : \n"))
b = int(input("Enter second no: \n"))
maxnum = max(a, b)
while (True):
    if (maxnum % a == 0 and maxnum % b == 0):
        break
    else:
        maxnum = maxnum + b
print(f"The LCM of {a} and {b} is {maxnum}")
