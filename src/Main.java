import java.util.Random;
import java.util.Scanner;

 class Game {

     Scanner input = new Scanner(System.in);

    public int number;
    public int numberOfGuesses;
     public int inputNumber;
     public Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);

    }
     int takeUserInput(){
         System.out.println("Enter Your Number:");
         return inputNumber =  input.nextInt();
     }

     boolean isCorrectNumber(){
         numberOfGuesses++;
         if (inputNumber==number){
             System.out.printf("Yes you guessed it right, it was %d\nYou guessed it in %d attempts", number, numberOfGuesses);
             return true;
         }
         else if(inputNumber<number){
             System.out.println("Too low...");
         }
         else if(inputNumber>number){
             System.out.println("Too high...");
         }
         return false;
     }
    int numberOfGuesses(int numberOfGuesses){
        numberOfGuesses++;
        return numberOfGuesses;

    }
}

public class Main {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b= false;
        while(!b){
            g.takeUserInput();
            b = g.isCorrectNumber();
        }

    }
}