import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        int n;
        System.out.println("Wanna convert binary to decimal? ");
        try{
            do{
                System.out.print("Input n: ");
                n = nhap.nextInt();
                int bnum;
                bnum =  Integer.parseInt(String.valueOf(n), 2);
                if(n>0){
                    Execute ex = new Execute();
                    ex.Sovle(bnum);}
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
