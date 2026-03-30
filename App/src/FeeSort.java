import java.util.*;

class Transaction {
    String id; double fee; String ts;
    Transaction(String i,double f,String t){id=i;fee=f;ts=t;}
}

public class FeeSort {
    public static void main(String[] args) {
        List<Transaction> list = new ArrayList<>();
        list.add(new Transaction("id1",10.5,"10:00"));
        list.add(new Transaction("id2",25.0,"09:30"));
        list.add(new Transaction("id3",5.0,"10:15"));

        // Bubble Sort
        for (int i=0;i<list.size()-1;i++)
            for (int j=0;j<list.size()-i-1;j++)
                if (list.get(j).fee > list.get(j+1).fee)
                    Collections.swap(list,j,j+1);

        for (Transaction t : list)
            System.out.println(t.id + ":" + t.fee);
    }
}