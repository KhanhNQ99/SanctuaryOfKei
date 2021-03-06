public class Main {
    public static boolean checkSNT(int n){
        if(n>1){
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0) return false;
            }
            return true;
        }
        else return false;
    }

    public static boolean checkReverse(int n){
        StringBuilder xau= new StringBuilder();
        String str= ""+n;
        xau.append(str);
        String check= ""+xau.reverse();
        if(str.equals(check)) return true;
        else return false;
    }

    public static boolean isSNT(int n){
        while(n!=0){
            if(!checkSNT(n%10)) return false;
            n/= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        int i,count= 0;
        System.out.println("cac so tu 5-7 chu so thoa man dieu kien la: ");
        for(i=10001 ; i<9999999 ; i+=2){
            if(checkSNT(i) && isSNT(i) && checkReverse(i)){
                System.out.println(" "+i); count++;
            }
        }
        System.out.println("\n Co "+count+" so thoa man");
    }

}