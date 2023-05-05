class FormulaError(Exception):
    pass

try:
    exp = '2+3'
    if(len(exp)!=3):
        raise FormulaError("Length is not valid")
    op = exp[1]
    li = exp.split(op)
    li[0] = float(li[0])
    li[1] = float(li[1])
    if(op != '+' and op != '-'):
        raise FormulaError("Invalid oprand")
except FormulaError as f:
    print(f)
except ValueError as v:
    print(v)
else:
    if(op == '+'):
        print(li[0] + li[1])
    else:
        print(li[0] - li[1])



