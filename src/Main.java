import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean loop = true;

        //saving the input from your keyboard input.
        int input = 0;

        //base values of one week
        int daysPerWeek = 7;
        int hoursPerWeek = 168;
        int minutesPerWeek = 10080;
        int secondsPerWeek = 604800;

        while(loop == true){
            //creating the scanner obj to get the value from your keyboard.
            Scanner value = new Scanner(System.in);

            System.out.print("Enter number of weeks: ");
            input = value.nextInt();

            if(input <= 0){
                System.out.println("Error, please input a value greater than 0");
                continue;
            }
            else{
                loop = false;
            }
        }

            System.out.println((daysPerWeek * input) + " days.");
            System.out.println((hoursPerWeek * input) + " hours.");
            System.out.println((minutesPerWeek * input) + " minutes.");
            System.out.println((secondsPerWeek * input) + " seconds.");

    }
}