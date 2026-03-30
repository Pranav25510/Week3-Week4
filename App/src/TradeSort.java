public class TradeSort {
    public static void main(String[] args) {
        int[] a = {500,100,300};

        mergeSort(a,0,a.length-1);

        for(int x:a) System.out.print(x+" ");
    }

    static void mergeSort(int[] a,int l,int r){
        if(l>=r)return;
        int m=(l+r)/2;
        mergeSort(a,l,m);
        mergeSort(a,m+1,r);
        merge(a,l,m,r);
    }

    static void merge(int[] a,int l,int m,int r){
        int[] t=new int[r-l+1];
        int i=l,j=m+1,k=0;
        while(i<=m && j<=r)
            t[k++]=a[i]<a[j]?a[i++]:a[j++];
        while(i<=m)t[k++]=a[i++];
        while(j<=r)t[k++]=a[j++];
        System.arraycopy(t,0,a,l,t.length);
    }
}