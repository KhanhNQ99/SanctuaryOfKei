public class Execute {
    public void Sovle(int n){
        int snt = 0;
        for(int i=1; i<n; i++)
        {
            if(n%i==0)
            {
                snt +=i;
            }
        }
        if(snt == n)
        {
            System.out.println(snt + " is perfect!!!\n" );
        }
        else
        {
            System.out.println(n + " is not perfect\n");
        }
    }
}
