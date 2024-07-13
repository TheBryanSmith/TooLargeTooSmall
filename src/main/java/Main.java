import java.util.Random;
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random randomNumber = new Random();
        int numberToUse = randomNumber.nextInt(10) + 1;
        System.out.println("pick a number between 1 and 10");
        int input = 0;
        int numberOGueses = 0;
        while (input != numberToUse ) {
             input = scanner.nextInt();
            if (input < numberToUse) {
                System.out.println("Too Small TRY AGAIN! :( ");
                numberOGueses++;
            } else if (input == numberToUse) {
                numberOGueses++;
                System.out.println("Congratulations you guessed the number: " + numberToUse + " Correctly!!! :) it took you: " + numberOGueses + " tries!!!");

            } else{
                System.out.println("Too Large Try Again! :( ");
                numberOGueses++;

            }


        }

    }
}
