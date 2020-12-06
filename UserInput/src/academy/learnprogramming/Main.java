package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

     //   String numberAsString = "2018.125";
      //  System.out.println("numberAsString= " + numberAsString);
     //   int number = Integer.parseInt(numberAsString);
     //   System.out.println("number = " + number);

      //  numberAsString += 1; // this will give a string 20181
      //  number += 1;         // this gives our 2019 number

      //  double number2 = Double.parseDouble(numberAsString);
      //  System.out.println("number = " + number2);

        Scanner scanner = new Scanner(System.in);  // new since Scanner not static

        System.out.println("Enter your year of birth");
        boolean hasNextInt = scanner.hasNextInt(); // won't pull the data, just check it
        if(hasNextInt) {
            int yearOfBirth = scanner.nextInt();

            scanner.nextLine(); // handle the <enter> next line char

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();

            if(yearOfBirth > 1930 && yearOfBirth < 2000) {
                System.out.println("Your name is " + name + "  birth year: " + yearOfBirth);
            } else {
                System.out.println("Incorrect range");
            }
        } else {
            System.out.println("Year of birth has to be number");
        }

        int minValue = Integer.MIN_VALUE;
        int maxValue = Integer.MAX_VALUE;
        scanner.close(); // get into practice of closing instances when no longer needed








    }
}
