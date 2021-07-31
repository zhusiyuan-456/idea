import java.util.Scanner;

public class Problem623 {
    public static void Count() throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print(
                "Enter a string  " );
        String string = input.nextLine();
        if (!isOnlyLetters(string))throw new Exception("Must only contain numbers!");

        System.out.println("Enter the character you want to search");

        String str = input.nextLine();
        char ch=str.charAt(0);


        System.out.println(
                "The number of occurrences of \"" + ch + "\" in \'" + string + "\" is: " +
                        count(string, ch));

    }

    public static int count(String str, char a)throws Exception {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (a == str.charAt(i))
                count++;
        }
        return count;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("this program will find the number of" +
                "occurrences of a specified character in a string");
        int yes=1;
        try {
            while (yes == 1) {
                Count();
                Scanner s = new Scanner(System.in);
                System.out.println("do you want to try again? enter 1 to continue enter 0 to exit ");
                yes = s.nextInt();
                if (yes == 0) break;
            }
        }catch (Exception E){
            System.out.println("Invalid Input! Please input letters only!");
        }

    }
    private static boolean isOnlyLetters(String string){
        for (int i = 0; i < string.length(); i++) {
            if (!Character.isLetter(string.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    }

