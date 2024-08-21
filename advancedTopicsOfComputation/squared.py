def main():
    value = input('Input a number: ')

    isEmpty = len(value) == 0
    
    if isEmpty:
        raise Exception("Oh damn it, this is empty you dumb")
    
    valueAsInteger = int(value)

    squaredValue = valueAsInteger**2

    print("Squared of " + str(squaredValue) + ' is equals: ' + str(squaredValue))

try:
    main()
except Exception as error:
    print(error)