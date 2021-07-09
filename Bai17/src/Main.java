import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Fibonacci?");
        try{
            int n;
            do{
                System.out.printf("Input n: ");
                n = nhap.nextInt();
                Execute ex = new Execute();
                ex.Sovle(n);
            }while (n>0);
        }catch (Exception e){
            System.out.println("Self destruct activated");
            System.out.println("Boooooooooom!!!!!!");
            return;
        }
    }
}
