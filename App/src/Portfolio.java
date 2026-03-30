class Asset {
    String name; double ret;
    Asset(String n,double r){name=n;ret=r;}
}

public class Portfolio {
    public static void main(String[] args) {
        Asset[] a = {
                new Asset("AAPL",12),
                new Asset("TSLA",8),
                new Asset("GOOG",15)
        };

        // Bubble Sort ASC
        for(int i=0;i<a.length-1;i++)
            for(int j=0;j<a.length-i-1;j++)
                if(a[j].ret > a[j+1].ret){
                    Asset t=a[j]; a[j]=a[j+1]; a[j+1]=t;
                }

        for(Asset x:a)
            System.out.println(x.name+":"+x.ret);
    }
}