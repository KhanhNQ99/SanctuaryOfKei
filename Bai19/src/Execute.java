public class Execute {
    public int Sovle(int a[], int n, int i){
        int count = 0;
        for(int j=0; j<n; j++) {
            if(a[j] == i) count++;
        }
        return count;
    }
}
