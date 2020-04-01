import static java.lang.Integer.parseInt;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter How Many Terms Your Password Needs");
        String Length = myObj.nextLine();
        int Len = parseInt(Length);
        Generator Gen = new Generator(Len);
        System.out.println(Gen.Creator(Gen.Instantiator()));
    }
}