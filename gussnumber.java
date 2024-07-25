import java.util.Random;
import java.util.Scanner;


public class  gussnumber {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        Random roam = new Random();
        int Randomnumber = roam.nextInt(100)+1;

        System.out.println(
            " \n \n \n \n ===============================================================================================================================================================\n As You Know That It Is A Guess The Number Game. Here The No Is Generated Between (1-100). You Have Only 7 Chnance To Win The Game. Hint Are Also Provided After Every Attempt.\n================================================================================================================================================================\n ");

        int count=0;

        for(int i=1; i<=7; i++){
            System.out.print("\n  Enter Your Number Between (1-100) : ");
            int YourGuess = sc.nextInt();

            count++;

        if( YourGuess > 100){

            System.out.println("Bro Your Input Is Invalid 😅 😅  Please Enter Between The Given Range 😅 😅 \n  Your One Chance Also Gone Play Carefully \n \n ");

            continue; 

        } 
        else if(YourGuess == Randomnumber){

            System.out.println(
                " \n \n Congo Bro 🥳🥳 You Won 🥳🥳 \n________________________________________________________________________________________________________________________________________________ \n \nTotal Attempts Taken By you : " + count + " \n ______________________________________________________________________________________________________________________________________________\n");
            
            break;
        }
        else if(YourGuess < Randomnumber){

            System.out.println("!!!! Bro The Number You Guess Is Too Low !!!!");
        }
        else {
            
            System.out.println("!!!! Bro THe Number You Guess Is Too High !!!!");
        }

        if(count == 7){
            System.out.println("\n***********************************************************************************************************************************************\nBro 😭😭😭😭 You Lost Your All Chnaces 😭😭😭😭  \n  🫡🫡🫡🫡 The Actual Number is : " + Randomnumber + " 🫡\n *********************************************************************************************************************************************** ");
        }
    }
}
}