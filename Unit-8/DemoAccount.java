import chn.util.*;

public class DemoAccount{

    private static ConsoleIO console;
    public static void main(){
        console = new ConsoleIO();
        CheckingAccount demo = new CheckingAccount();
        boolean demoMade = false;
        while (!demoMade){
            System.out.println("Please enter the starting balance --->");
            int balance = console.readInt();
            try {
                if (balance < 0){
                    throw new Exception("Error CheckingAccount: negative initial balance");
                } else {
                    demo = new CheckingAccount(balance);
                    demoMade = true;
                    System.out.println("Account open with balance of " + balance);
                }
            } catch(Exception e) {
                System.out.println(e.getMessage());
            }
        }
        boolean depositMade = false;
        while(!depositMade) {
            System.out.println("Please enter amount to deposit --->");
            int depositAmount = console.readInt();
            try {
                if(depositAmount < 0) {
                    throw new Exception("Error deposit: negative amount");
                } else {
                    depositMade = true;
                    demo.deposit(depositAmount);
                    System.out.print("Deposit made. Current account balance = ");
                    System.out.println(demo.getBalance());
                }
            } catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        boolean withdrawMade = false;
        while(!withdrawMade) {
            System.out.println("Please Enter amount to withdraw --->");
            int withdrawalAmount = console.readInt();
            try {
                if(withdrawalAmount < 0 || withdrawalAmount > demo.getBalance()) {
                    throw new Exception("Error withdraw: Illegal amount");
                } else {
                    withdrawMade = true;
                    demo.withdraw(withdrawalAmount);
                    System.out.print("Withdrawal made. Current account balance = ");
                    System.out.println(demo.getBalance());
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Thank you for using ErrorFreeChecking...goodbye!");
    }
}
