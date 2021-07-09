import java.util.Scanner;

public class Main {
    public static int nhap(){
        try {
            Scanner nhap = new Scanner(System.in);
            int n;
            n = nhap.nextInt();
            return n;
        }catch (Exception e){
            System.out.println("Kaboom!!!!");
            return 0;
        }
    }

    public static void main(String[] args) {
        try{
        int n;
        System.out.printf("Input n: ");
        n = nhap();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            System.out.print("Input a["+(i+1)+"]: ");
            arr[i] = nhap();
        }
        Execute ex = new Execute();
        for(int i=0; i<n; i++){
            int dem = ex.Sovle(arr,i,arr[i]);
            if(dem==0)
            {
                System.out.println(arr[i]+" comes out: "+ex.Sovle(arr,n,arr[i])+" times");
            }
        }
    }catch (Exception e){
            System.out.println("Kaboom!!!");
        }
    }
}
