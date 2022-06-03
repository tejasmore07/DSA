package SearchAlgorithm;

public class StringLinearSearch {
    public static void main(String[] args) {
        String arr[] ={"tejas","prasanna","rohit","mihir","prasad"};
        String find = "mihir";

        for(int i=0;i< arr.length;i++) {
            if(arr[i].equals(find)) {
                System.out.println("Element Found At "+i+" Index");
                return;
            }
        }
        System.out.println("Element not Found");
    }
}
