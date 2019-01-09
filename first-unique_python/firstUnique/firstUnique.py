

def first_unique(str):
    for pos in range(len(str)):
        if is_unique(pos, str):
            return str[pos]
    return None


def is_unique(pos, str):
    gen = [i for i in range(len(str)) if i != pos]
    for p in gen:
        if str[p] == str[pos]:
            return False
    return True
