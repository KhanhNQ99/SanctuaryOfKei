import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        int n;
        System.out.println("Perfect number? ");
        do {
            System.out.print("Input n: ");
            nhap = new Scanner(System.in);
            n = nhap.nextInt();
            Execute ex = new Execute();
            ex.Sovle(n);
        }while(n >0);
    }
}
