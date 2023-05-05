def increment(n):
    try:
        return n + 1
    except:
        raise MemoryError("This is not allowed")

a = increment("sdfg")
print(a)