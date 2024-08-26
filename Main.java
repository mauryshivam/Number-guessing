
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myNumber = (int)(Math.random()*100);
        int userNumber=0;
        do{

           System.out.println("Guess a Number Between 1 to 100 : ");
           userNumber=sc.nextInt();
           if (userNumber==myNumber) {
            System.out.println("You guess the Right Number");
            break;
           }
           else if (userNumber>myNumber) 
           {
           System.out.println("Your Number is greater than My Number"); 
           }
           else{
             System.out.println("Your Number is smaller then My Number");

           }

        }

        while(userNumber>=0);{
            System.out.println("My Number is: ");
            System.out.println(myNumber);

        }
    }   
}
