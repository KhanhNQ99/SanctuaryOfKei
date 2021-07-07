import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        int n ;
        try {
            do {
                System.out.println("From bi to oc");
                System.out.println("\nInput numbers for answer/ others to exit");
                System.out.printf("Input :  ");
                n = nhap.nextInt();
                int bnum;
                bnum =  Integer.parseInt(String.valueOf(n), 2);
                if(n>0){
                    Execute ex = new Execute();
                    ex.Sovle(bnum);}
            } while (n > 0);
        }catch(Exception e ){
            System.out.println("Exiting!!");
        }
    }
}
