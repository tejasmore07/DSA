package SortAlgorithm;

public class IntegerBubbleSort {
    public static void main(String[] args) {
        int arr[]={25,68,10,56,80,100,5,1,92};
        int temp;

        for(int i=0;i<arr.length;i++) {
            boolean flag =true;
            for(int j=0;j<arr.length-1-i;j++) {
                if(arr[j] > arr[j+1]) {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag = false;
                }
            }
            if(flag==true){
                break;
            }
        }
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

}
