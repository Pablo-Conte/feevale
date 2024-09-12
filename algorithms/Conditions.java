import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int exerciseNumber;

        System.out.println("--- Input the needed exercise ---");
        System.out.println("1. Velocity message");
        System.out.println("2. Speeding ticket");
        System.out.println("3. beans weight");
        System.out.println("4. Student notes");
        System.out.println("5. Elevator");
        System.out.println("6. Tickets");
        System.out.println("7. G1 Challenge One");
        System.out.println("8. G2 Challenge Two");
        System.out.println("9. G3 Challenge Three");
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
            case 7:
                System.out.println("Challenge 1");
                choice.challengeOne();
                break;
            case 8:
                System.out.println("Challenge 2");
                choice.challengeTwo();
                break;
            case 9: 
                System.out.println("Challenge 3");
                choice.challengeThree();
                break;
        }

        scanner.close();
    }

    public void firstOneExercise() {
        Scanner scanner = new Scanner(System.in);

        int velocidade;

        System.out.print("Digite a velocidade do automóvel em km/h:");

        velocidade = scanner.nextInt();

        if (velocidade <= 80) {
            System.out.println("Velocidade Normal");
        } else {
            System.out.println("Velocidade acima do permitido");
        }

        scanner.close();
    }

    public void secondOneExercise() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("The maximum speed allowed: ");
        double maximumSpeed = scanner.nextDouble();

        System.out.println("The speed of the car: ");
        double veiculeSpeed = scanner.nextDouble();

        if (veiculeSpeed > maximumSpeed) {
            System.out.println("Speed of the veicule passed the maximum");
        } else {
            System.out.println("Speed of the veicule is normal");
        }
    }

    public void thirdOneExercise() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the weight of a package of beans in KG: ");
        double beansPackageWeigth = scanner.nextDouble();

        if (beansPackageWeigth > 1) {
            System.out.println("Weight above of the expected");
        }

        if (beansPackageWeigth < 1) {
            System.out.println("Weight is normal");
        }
    }

    public void fourthOneExercise() {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Input the first one score: ");
        double firstOneScore = scanner.nextDouble();

        System.out.printf("Input the second one score: ");
        double secondOneScore = scanner.nextDouble();

        System.out.printf("Input the third one score: ");
        double thirdOneScore = scanner.nextDouble();

        double averageScore = (firstOneScore + secondOneScore + thirdOneScore) / 3;

        if (averageScore >= 7) {
            System.out.println("Aprooved!");
        } else if (averageScore <= 5) {
            System.out.println("Failed");
        } else {
            System.out.println("Studendt in recovery");
        }
    }

    public void fifthOneExercise() {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Input the weight of the first person: ");
        double firstPerson = scanner.nextDouble();

        System.out.printf("Input the weight of the second person: ");
        double secondPerson = scanner.nextDouble();

        System.out.printf("Input the weight of the third person: ");
        double thirdPerson = scanner.nextDouble();

        System.out.printf("Input the weight of the forth person: ");
        double forthPerson = scanner.nextDouble();

        double sumOfThePersons = firstPerson + secondPerson + thirdPerson + forthPerson;

        if (sumOfThePersons > 100) {
            System.out.println("Elevator is fullfilled");
        } else {
            System.out.println("Elevator is open to use");
        }

    }

    public void sixthOneExercise() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number of persons: ");
        double numberOfPersons = scanner.nextDouble();

        if (numberOfPersons >= 5) {
            System.out.print("The value of the ticket is R$80");
            double total = numberOfPersons * 80;
            System.out.printf("The total value is %.1f", total);
        } else {
            System.out.print("The value of the ticket is R$100");
            double total = numberOfPersons * 100;
            System.out.printf("The total value is %.1f", total);
        }
    }

    public void challengeOne() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cotation of Dolar ($): ");
        double dolarCotationInReal = scanner.nextDouble();

        System.out.print("How many dollars do you have? ");
        double quantityOfDolar = scanner.nextDouble();

        double dolarConvertedToReal = dolarCotationInReal * quantityOfDolar;

        System.out.printf("$%.2f in R$ are: R$%.2f", quantityOfDolar, dolarConvertedToReal);
    }

    public void challengeTwo() {
        Scanner scanner = new Scanner(System.in);

        double fee = 0.007;

        System.out.print("How much money will you deposite? ");
        double depositedMoney = scanner.nextDouble();

        double totalFee = depositedMoney * fee;

        double moneyMinusFee = depositedMoney - totalFee;

        System.out.printf("The amount of fee are: %.2f\n", totalFee);
        System.out.printf("The amount of money deposited are: %.2f", moneyMinusFee);
    }
    
    public void challengeThree() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the cost price of the product: ");
        double costPrice = scanner.nextDouble();

        System.out.print("Input the profit percentual of the product: ");
        double profitPercentual = scanner.nextDouble();

        double percentualInNotation = profitPercentual / 100;
        
        double sellPrice = costPrice + (costPrice*percentualInNotation);

        System.out.printf("The Price of the product are: %.2f", sellPrice);

    }

    public void challengeFour() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input your name: ");
        String nameOfTheSeller = scanner.next();

        System.out.print("Input your salary");
        double profitPercentual = scanner.nextDouble();


    }
}