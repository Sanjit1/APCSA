import chn.util.*;
public class Change
{
    static ConsoleIO console = new ConsoleIO();
    public static void main(){
        System.out.println("Amount of purchase");
        double purchase = console.readDouble();
        System.out.println("Amount of cash tendered");
        double cashTendered = console.readDouble();
        double temp = cashTendered - purchase;
        System.out.println(temp);
        temp = temp - (int)temp;
        System.out.println(temp);
        int change = (int)(temp*100);
        System.out.println(temp);
        int numOfQs = (change - (change % 25))/25;
        int numOfDs = ((change - numOfQs*25) - ((change - numOfQs*25) % 10))/10;
        int numOfNs = ((change - (numOfDs*10+numOfQs*25)) - ((change - numOfDs*10+numOfQs*25) % 5))/5;
        int numOfPs = ((change - (numOfNs*5+numOfDs*10+numOfQs*25)) - ((change - numOfNs*5+numOfDs*10+numOfQs*25) % 1))/1;
        System.out.println("Change = " + change);
        System.out.println("Quarters = " + numOfQs);
        System.out.println("Dimes = " + numOfDs);
        System.out.println("Nickles = " + numOfNs);
        System.out.println("Pennies = " + numOfPs);
    }
}