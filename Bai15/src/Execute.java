public class Execute {
    public boolean checkSNT(int n) {
        if (n <= 2) {
            return true;
        } else {
            for (int i = 2; i <n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public void Sovle(int n) {
        for (int i = 2; i <= n; i++) {
            while(checkSNT(i) && (n % i == 0))
            {
                System.out.print(i);
                n/=i;
                if(i<=n) System.out.printf(" x ");
            }
        }
    }
}
