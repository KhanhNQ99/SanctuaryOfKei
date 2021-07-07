import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        int n;
        try {
            do {
                System.out.printf("Input number from 0-100: ");
                n = nhap.nextInt();
                Execute ex = new Execute();
                ex.Sovle(n);
            } while (n>0||n<100);
        }catch (Exception e){
            System.out.println("Booom!!!");
        }
    }
}
