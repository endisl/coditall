def are_rotations(str1: str, str2: str):
    if len(str1) == 0 or len(str2) == 0 or str1 is None or str2 is None:
        raise ValueError("Invalid arguments")

    pointer1 = 0
    pointer2 = str2.find(str1[0])

    if pointer2 == -1 or len(str1) != len(str2):
        return False

    for i in range(len(str1)):
        if str1[pointer1] != str2[pointer2]:
            return False
        pointer1 += 1
        pointer2 += 1

        if pointer2 == len(str2):
            pointer2 = 0

    return True


result = are_rotations('ABCDE', 'CDEAB')
print(result)
