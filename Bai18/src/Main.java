import java.util.Scanner;

public class Main {
    public static int nhap(){
        Scanner nhap = new Scanner(System.in);
        int n;
        n = nhap.nextInt();
        return n;
    }

    public static void main(String[] args) {
        int n;
        System.out.printf("Input n: ");
        n = nhap();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            System.out.print("Input a["+(i+1)+"]: ");
            arr[i] = nhap();
        }
        Execute ex = new Execute();
        System.out.printf("Once in arr is: ");
        for(int i=0; i<n; i++){
            int dem = ex.Sovle(arr,n,arr[i]);
            if(dem==1)
                System.out.print(arr[i]);
        }
    }
}
