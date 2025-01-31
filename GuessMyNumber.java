import java.util.Random;
 import java.util.Scanner;
 public class GuessMyNumber{
    public static void main(String[] args) {
        Random random=new Random();
        int numberToGuess=random.nextInt(100)+1;
        int numberOfTries=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("welcome to GuessMyNumber!");
        System.out.println("i'm thinking of a number between 1 and 100.");
        System.out.println("Try to guess it:");
        while (true) { 
            System.out.println("enter your guess:");
            int guess=scanner.nextInt();
            numberOfTries++;
            if(guess<numberToGuess){
                System.out.println("Too low!Try again.");
            }else if(guess>numberToGuess){
                System.out.println("Too high!Try again.");
            }else{
                System.out.println("congratulations!you found the number in"+numberOfTries+"tries.");
                break;
            }
        }
    }
 }
