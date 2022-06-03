package SortAlgorithm;

public class IntegerSelectionSort {
    public static void main(String[] args) {
        int arr[]= {7,56,59,87,42,10,36,98,45};
        int temp;

        for(int i=0;i<arr.length;i++) {
            int min = i;
            for(int j=i+1;j<arr.length;j++) {
                if(arr[j] < arr[min]) {
                    min =j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min]= temp;
        }
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
