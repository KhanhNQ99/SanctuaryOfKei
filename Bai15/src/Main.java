import java.util.Scanner;

public class Main {
    public static int nhap(){
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("28 = 2 x 2 x 7 || Num = Prime x Prime:");
        System.out.print("Input: <=== ");
        n = input.nextInt();
        return n;
    }

    public static void main(String[] args) {
        int n = nhap();
        System.out.print("===> Output: "+n+" = ");
        Execute ex = new Execute();
        ex.Sovle(n);
    }
}
