package SearchAlgorithm;

public class IntegerLinearSearch {
    public static void main(String[] args) {
        int arr[] = {20,500,42,48,459,854,4,5,296,5,9};
        int find = 48;
        int temp=0;

        for(int i=0;i< arr.length;i++) {
            if(arr[i]==find) {
                System.out.println("Element Found At "+i+" Index");
                temp= temp+1;
            }
        } if(temp == 0) {
            System.out.println("Element not Found");
        }

    }
}
