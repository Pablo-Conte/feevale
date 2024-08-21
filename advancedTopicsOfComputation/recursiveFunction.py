def countdown(countNumber):
    if countNumber == 0:
        print("Fire!")
    else:
        print(countNumber)
        countdown(countNumber - 1)

countdown(10)