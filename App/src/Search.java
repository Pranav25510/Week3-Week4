public class Search {
    public static void main(String[] args) {
        String[] arr = {"accA","accB","accC"};

        String target = "accB";

        // Linear Search
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals(target)){
                System.out.println("Found at index "+i);
                break;
            }
        }
    }
}