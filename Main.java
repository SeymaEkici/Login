import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        String userName, passcode;

        System.out.println("Please enter your user name: ");
        userName = scan.nextLine();

        System.out.println("Please enter your passcode: ");
        passcode = scan.nextLine();

        if (userName.equals("seyma") && passcode.equals("1234")){
            System.out.println("Congrats! You may login :)");
        }else {
            System.out.println("You've been trying the wrong credentials!");
        }
    }
}
