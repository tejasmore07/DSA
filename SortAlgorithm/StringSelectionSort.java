package SortAlgorithm;

public class StringSelectionSort {
    public static void main(String[] args) {
        String arr[] ={"tejas","atharv","nikhil","prasad","chetan","subodh"};

        for(int i=0;i<arr.length;i++) {
            int min = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j].compareTo(arr[min])<0) {
                    min=j;
                }
            }
            String temp = arr[i];
            arr[i]= arr[min];
            arr[min]= temp;
        }
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
