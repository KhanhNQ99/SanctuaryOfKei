import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String n;
        Scanner nhap = new Scanner(System.in);
        System.out.print("Input: ");
        n = nhap.nextLine();
        Execute ex = new Execute();
        ex.Sovle(n);
    }
}
