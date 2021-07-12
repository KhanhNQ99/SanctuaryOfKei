public class Execute {
    public void Sovle(int i){
        int sum =0;
        long n ;
        while(i!=0){
            n = i%10;
            sum+=n;
            i/=10;
        }
        System.out.println(sum);
    }
}
