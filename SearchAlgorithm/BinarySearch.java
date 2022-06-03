package SearchAlgorithm;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {10,25,35,46,58,69,80,99,101};
        int lower = 0;
        int higher = arr.length-1;
        int mid = (lower+higher)/2;
        int find = 99;

        while (lower<=higher) {
            if(arr[mid] == find) {
                System.out.println("Your Element Are Found At " + mid + " Index");
                break;
            } else if(arr[mid]<find) {
                lower=mid+1;
            } else {
                higher=mid-1;
            }
            mid = (lower+higher)/2;
        }
        if(lower>higher) {
            System.out.println("Element Not Found");
        }
    }
}