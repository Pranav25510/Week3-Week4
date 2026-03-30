public class Risk {
    public static void main(String[] args) {
        int[] a = {10,25,50,100};
        int x = 30;

        int floor = -1, ceil = -1;
        int l=0,r=a.length-1;

        while(l<=r){
            int m=(l+r)/2;
            if(a[m]<=x){ floor=a[m]; l=m+1; }
            else r=m-1;
        }

        l=0; r=a.length-1;
        while(l<=r){
            int m=(l+r)/2;
            if(a[m]>=x){ ceil=a[m]; r=m-1; }
            else l=m+1;
        }

        System.out.println("Floor: "+floor);
        System.out.println("Ceil: "+ceil);
    }
}