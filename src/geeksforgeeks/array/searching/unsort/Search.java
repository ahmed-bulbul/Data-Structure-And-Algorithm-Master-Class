package geeksforgeeks.array.searching.unsort;

//https://www.youtube.com/watch?time_continue=185&v=vSOkxXxIXZE&feature=emb_logo

public class Search {

    public static void main(String[] args) {

        int arr[] = {12, 34, 10, 6, 40};
        int n = arr.length;
        // Using a last element as search element
        int key = 40;
        int position = findElement(arr, n, key);
        if(position!=-1){
            System.out.println("Found at position : " + (position + 1));
        }else{
            System.out.println("Not Found");
        }
    }

   /* Search Operation
    In an unsorted array, the search operation can be performed by linear traversal
    from the first element to the last element.

    Time Complexity: O(n)
    Auxiliary Space: O(1)
    */

    public static int findElement(int arr[], int n, int key){
        for (int i=0;i<n;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
}
