import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        int n;
        try {
            do {
                System.out.printf("Input: ");
                n = nhap.nextInt();
                if(n>0){
                    Execute ex = new Execute();
                    ex.Sovle(n);
                }
            }while (n > 0);
            }catch(Exception e ){
                System.out.println("Exiting!!");
        }
    }
}
