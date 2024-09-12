import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int exerciseNumber;

        System.out.println("--- Input the needed exercise ---");
        System.out.println("1. weight validator");
        System.out.println("2. quantity of products");
        System.out.println("3. between 50 and 100");
        System.out.println("4. Login exercise");
        System.out.println("5. Relative humidity");
        System.out.println("6. person and eleitoral");
        System.out.println("---------------------------------");

        System.out.print("What is your choice: ");
        exerciseNumber = scanner.nextInt();

        Main choice = new Main();

        switch (exerciseNumber) {
            case 1:
                System.out.println("Exercise 1");
                choice.firstOneExercise();
                break;
            case 2:
                System.out.println("Exercise 2");
                choice.secondOneExercise();
                break;
            case 3:
                System.out.println("Exercise 3");
                choice.thirdOneExercise();
                break;
            case 4:
                System.out.println("Exercise 4");
                choice.fourthOneExercise();
                break;
            case 5:
                System.out.println("Exercise 5");
                choice.fifthOneExercise();
                break;
            case 6:
                System.out.println("Exercise 6");
                choice.sixthOneExercise();
                break;
        }

        scanner.close();
    }

    public void firstOneExercise() {
        Scanner scanner = new Scanner(System.in);

        int weight, age;

        System.out.print("Input your weight: ");
        weight = scanner.nextInt();

        System.out.print("Input your age: ");
        age = scanner.nextInt();

        boolean hasMoreThen18 = age > 18;
        boolean hasMoreThen70OfWeight = weight > 70;

        if (hasMoreThen18 && hasMoreThen70OfWeight) {
            System.out.println("Above normal");
        } else {
            System.out.println("Normal weight to the age");
        }

        scanner.close();
    }

    public void secondOneExercise() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("The quantity of product 1: ");
        double quantityProduct1 = scanner.nextDouble();

        System.out.print("The quantity of product 2: ");
        double quantityProduct2 = scanner.nextDouble();

        if (quantityProduct1 > 10 || quantityProduct2 > 10) {
            System.out.println("It's necessary two boxes to pack that");
        }

    }

    public void thirdOneExercise() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the value: ");
        double value = scanner.nextDouble();

        boolean itsBetween50and100 = value >= 50 && value <= 100;

        if (itsBetween50and100) {
            System.out.println("This value is between");
        } else {
            System.out.println("This value doesn't belogin to this interval");
        }

    }

    public void fourthOneExercise() {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Input your login: ");
        String login = scanner.next();

        System.out.printf("Input your password: ");
        String password = scanner.next();

        boolean theLoginIsOk = login == "admin" && password == "1234";

        if (theLoginIsOk) {
            System.out.println("Permission allowed");
        } else {
            System.out.println("Permission denied");
        }

    }

    public void fifthOneExercise() {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Input the value of the relative humidity of the air: ");
        double relativeHumidityOfAir = scanner.nextDouble();

        System.out.printf("Input the value of the temperature: ");
        double temperature = scanner.nextDouble();

        boolean relativeHumidityOfAirIsBetween20and30 = relativeHumidityOfAir >= 20 && relativeHumidityOfAir <= 30;

        boolean temperatureIsBetween30and40 = temperature >= 30 && temperature <= 40;

        if (relativeHumidityOfAirIsBetween20and30 && temperatureIsBetween30and40) {
            System.out.println("Params of climate and nivels unsuportable for human");
        }

        if (temperatureIsBetween30and40 && relativeHumidityOfAir > 30) {
            System.out.println("Params of climate and nivels suportable for human");
        }
    }

    public void sixthOneExercise() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What your age: ");
        double age = scanner.nextDouble();

        if (age < 16) {
            System.out.print("Not voter");
        } else if (age > 18 && age < 65) {
            System.out.println("mandatory voter");
        } else if (age >= 16 && age <= 18 || age >= 65) {
            System.out.println("optional voter");
        }
    }
}