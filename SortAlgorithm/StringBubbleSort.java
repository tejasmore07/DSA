package SortAlgorithm;

public class StringBubbleSort {
    public static void main(String[] args) {
        String arr[] = {"tejas","mihir","rohit","prasad","zakir","prasanna","abhijeet"};
        String temp;

        for(int i=0;i<arr.length;i++) {
            boolean flag = true;
            for(int j=0;j<arr.length-1-i;j++) {
                if(arr[j].compareTo(arr[j+1])>0){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = false;
                }
            }
            if(flag==true) {
                break;
            }
        }
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
