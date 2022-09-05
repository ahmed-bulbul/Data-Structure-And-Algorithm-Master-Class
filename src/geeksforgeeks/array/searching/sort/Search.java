package geeksforgeeks.array.searching.sort;

public class Search {

    public static void main(String[] args)
    {
        int arr[] = { 1,2,3,4,5,6,7,8,9,10 };
        int n, key;
        n = arr.length - 1;
        key = 10;

        System.out.println("Index: " + binarySearch(arr, 0, n, key));
    }

    public static int binarySearch(int arr[], int low, int high, int key){

        if(high<low)
            return -1;

        for(int i=low;i<=high;i++){
            int mid = low + (high - low) / 2;
            System.out.println("low "+low);
            System.out.println("high "+high);
            System.out.println("mid "+mid);

            System.out.println("\n");

            if(key==arr[mid]){
                return mid;
            }
            if(key<arr[mid]){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return -1;


    }

    public static int binarySearchByRecursion(int arr[], int low, int high, int key){
        if(high<low)
            return -1;
        int mid=(low+high)/2;
        if(arr[mid]==key)
            return mid;
        if(arr[mid]>key)
            return binarySearchByRecursion(arr,low,(mid-1),key);
        return binarySearchByRecursion(arr,(mid+1),high,key);

    }
}
