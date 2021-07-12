import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        int n;
        System.out.println("Wanna see smt cool??             ");
        System.out.println("=================================");
        System.out.println("|  ===> Input 1 for it          |");
        System.out.println("|           Else to exit <===   |");
        System.out.println("=================================");
        try{
            n = nhap.nextInt();
            do {
                System.out.println("Wrong answer <===");
                System.out.print("===> Retype: ");
            }while((n = nhap.nextInt())!=1);
            if (n == 1) {
                Execute ex = new Execute();
                ex.Xuat();
            } else{
                return;
            }
        }catch (Exception e){
            System.out.println("Self destruct activated");
            System.out.println("Boooooooooom!!!!!!");
            return;
        }
    }
}
