import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        char n;
        System.out.println("Wanna convert num to Ascii? ");
        try{
                System.out.print("Input n: ");
                n = nhap.next().charAt(0);
                Execute ex = new Execute();
                ex.Sovle(n);
        }catch (Exception e){
            System.out.println("Self destruct activated");
            System.out.println("Boooooooooom!!!!!!");
            return;
        }
    }
}

