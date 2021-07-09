import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        int a, b;
        System.out.println("Least Common Multiple and Greatest Common Divisor?");
        System.out.println("finding a, b LCM-GCD");
        try{
            System.out.print("Input a: ");
            a = nhap.nextInt();
            System.out.print("Input b: ");
            b = nhap.nextInt();
            Execute ex = new Execute();
            int result = ex.UCLN(a,b);
            System.out.print("LCM of " + a + " and " + b + " is: "+result);
            result = ex.BCNN(a,b);
            System.out.print("\nGCD of " + a + " and " + b + " is: "+result);

        }catch (Exception e){
            System.out.println("Self destruct activated");
            System.out.println("Boooooooooom!!!!!!");
            return;
        }
    }
}
