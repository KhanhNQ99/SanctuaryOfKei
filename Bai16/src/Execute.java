public class Execute {
    public void Sovle(int n){
        int num = 0;
        String nt = "";
        for(int i=1; i<=n; i++)
        {
            int dem=0;
            for(num = i; num>=1; num--) {
                if (i % num == 0) {
                    dem++;
                }
            }
                if (dem == 2) {
                    nt += i + " ";
                }
            }
        System.out.println("Prime number ===> " + nt);
        }
    }


