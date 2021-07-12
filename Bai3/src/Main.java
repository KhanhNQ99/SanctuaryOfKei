import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        int n;
        System.out.println("Wanna convert decimal to hex? ");
        try{
            do{

                System.out.print("Input n: ");
                n = nhap.nextInt();
                if(n>0) {
                    Execute ex = new Execute();
                    ex.Sovle(n);
                }
                else {
                    System.out.println("Self destruct activated");
                    System.out.println("Boooooooooom!!!!!!");
                    return;
                }
            }while(n>0);
        }catch (Exception e){
            System.out.println("Self destruct activated");
            System.out.println("Boooooooooom!!!!!!");
            return;
        }
    }
}
