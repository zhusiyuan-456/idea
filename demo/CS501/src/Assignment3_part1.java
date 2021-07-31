import java.util.ArrayList;
import java.util.Scanner;
/*
This program will prompt user to find factors of a integer and display prime numbers between 2 and 1,200'. Then store
prime numbers within 1000 to an array, test if a number is prime  by searching the array;
 */
public class Assignment3_part1 {


    public static void main(String[] args) {
        System.out.println("enter a number to find factors");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        factor(num);
        final int NUMBER_OF_PRIMES_PER_LINE = 8; // Display 8 per line
        int count = 0;
        int number = 2;

        System.out.println("The prime numbers(first 50) between [2,1,200] are \n");


        while (number <= 1200) {
            // Assume the number is prime
            boolean isPrime = true; // Is the current number prime?

            // Test if number is prime
            for (int divisor = 2; divisor <= number / 2; divisor++) {
                if (number % divisor == 0) { // If true, number is not prime
                    isPrime = false; // Set isPrime to false
                    break;
                }
            }

            if (isPrime) {
                count++;
                if (count <= 50)
                    System.out.printf("%5d", number);
                if (count % NUMBER_OF_PRIMES_PER_LINE == 0 && count <= 51) {
                    System.out.println();
                }
            }
            number++;
        }

        System.out.println('\n');
        ArrayList<Integer> arr=new ArrayList<>();
        count = 0;
        for (int i = 2; i < 10001; i++) {
            if (isPrime(i)) {
                arr.add(i);
                count++;
            }
        }
        System.out.println("Total number of prime numbers from 1-10000 is " + count);
        LoopTest(arr);

    }

    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) { // If true, number is not prime
                return false; // number is not a prime
            }
        }
        return true; // number is prime
    }
    public static void factor(int num){
        int factor = 2;
        System.out.println("factors : ");
        while (factor <= num) {
            if (num % factor == 0) {
                System.out.println(+factor + " ");
                num /= factor;
            } else {
                factor++;
            }
        }
    }
    public static void LoopTest(ArrayList arr){

       while(true){

           System.out.println("Enter a number(less than 1000) to see if it's  a prime number");
           Scanner input = new Scanner(System.in);
           int num=input.nextInt();
           if (num>1000){
               System.out.println("more than 1000!");
           }
            if (arr.contains(num) ){
                System.out.println("Wow it's a prime number");
            }else {
                System.out.println("It's not a prime number");
                factor(num);
            }
           System.out.println("Do you want to run again? Enter 1 to continue or 0 to stop ");
            input=new Scanner(System.in);
            num=input.nextInt();
            if (num==0){
                break;
            }

        }
    }
}

