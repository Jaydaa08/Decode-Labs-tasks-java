import java.util.Scanner;
import java.util.Random;

public class Decode_Labs_Java_P1 {
    public static void main(String[] args) {   
        Scanner input = new Scanner(System.in);
        Random random = new Random();
     
       int randomNo = random.nextInt(100) + 1 ;
       int userGuess = 0;
       int attempts =0;
       int maxAttempts = 5 ;
       
        System.out.println("--- Number guessing game ---");
        System.out.println("You have 5 attempts.");
        System.out.println("Enter your guess of a number between 1 and 100 :");
     
     for(int i = 1 ; i < maxAttempts ; i++){
       while(userGuess != randomNo){
           userGuess = input.nextInt();
           attempts++;
           maxAttempts--;
           
            if(userGuess < 1 || userGuess > 100){
        System.out.println("Invalid input. Enter a number between 1 and 100 :");
        break;
    }

      if(maxAttempts == 0){
    break;
    }

       if(userGuess < randomNo ){
           System.out.println("The number is higher than "+ userGuess + ". Try again.");
           System.out.println("You have "+ maxAttempts + " attempts left.");
           System.out.println("Enter another guess :");
       }
       else if(userGuess > randomNo){
           System.out.println("The number is lower than "+ userGuess + ". Try again.");
            System.out.println("You have "+ maxAttempts + " attempts left.");
            System.out.println("Enter another guess :");
       }
       else{
           System.out.println("You win !!");
       }
      }
       
    }
     System.out.println("The number was : " + randomNo + " .");
      System.out.println("You used "+ attempts + " attempts.");
      
           
    
}
}
