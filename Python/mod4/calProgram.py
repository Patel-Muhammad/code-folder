class FormulaError(Exception):
    pass

try:
    n = input("Enter expression:")
    l1 = list(n)
    print(l1)
    if(len(l1) > 3):
        raise FormulaError("Formula error - Input contains more than 3 characters!")
except FormulaError as f:
    print(f)

try:
    l1[0] = float(l1[0])
    l1[2] = float(l1[2])
except ValueError as e:
    print(e)

try:
    if(l1[1] != '+' and l1[1] != '-'):
        raise FormulaError("Formula error - Operation Invalid")
except FormulaError as f:
    print(f)

if (l1[1] == '+'):
    print(l1[0] + l1[2])
else:
    print(l1[0] - l1[2])

