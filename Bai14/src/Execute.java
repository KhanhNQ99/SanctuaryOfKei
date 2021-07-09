public class Execute {
    public int UCLN(int a, int b){
        while(a!=b)
        {
            if(a>b) a = a - b;
            else b = b - a;
        }
        return a;
    }

    public int BCNN(int a, int b){
        int ucln = UCLN(a, b);
        return a*b/ucln;
    }
}

