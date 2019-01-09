import sys
from firstUnique import first_unique as fu


def main(argv):
    if len(argv) == 1 :
        print("no argument")
        return

    arr = argv[1:]
    for str in arr:
        first = fu(str)
        print("first unique character in %s : " % str)
        if first:
            print(first)
        else:
            print("None")


if __name__ == "__main__":
    main(sys.argv)
