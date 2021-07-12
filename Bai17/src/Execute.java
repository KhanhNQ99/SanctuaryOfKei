public class Execute {
    public void Sovle(int n){
        int[] fi = new int[n+1];
        fi[0] = 0;
        fi[1] = 1;
        for(int i=2; i<=n; i++) {
            fi[i] = fi[i-1] + fi[i-2];
        }
        System.out.println("Output Fibonancii of "+n+" is: f["+n+"]= "+fi[n]);
    }
}

