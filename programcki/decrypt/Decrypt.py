def main():
    f = open("cypher.txt")
    vsebina = f.read();
    vsebina = vsebina.strip().split(" ")
    print(vsebina)
    beseda2pojavitev = dict()
    for beseda in vsebina:
        if beseda in beseda2pojavitev:
            beseda2pojavitev[beseda] += 1
        else:
            beseda2pojavitev[beseda] = 1
    f.close()
    print(beseda2pojavitev)

main()