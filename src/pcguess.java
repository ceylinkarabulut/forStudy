import java.util.Scanner;
public class pcguess{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int min = 1, max = 100;
        int guess;
        String response;
        System.out.println("Think of a number between 1 and 100. The computer will try to guess it.");
        do{
            guess = (min + max) / 2;
            System.out.println("Computer's guess: " + guess);
            System.out.print("Is it higher (h), lower (l), or correct (c)? ");
            response = scanner.nextLine();
            if (response.equals("h")){
                min = guess + 1;
            }
            else if (response.equals("l")){
                max = guess - 1;
            }
        }
        while (!response.equals("c"));
        System.out.println("The computer guessed your number: " + guess);
    }
}
