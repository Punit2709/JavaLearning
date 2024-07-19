
public class linearSearch{
    
    public static int lsearch(int[] arr, int key, int i){
        if(i >= arr.length)
            return -1;
        else if (arr[i] == key)
            return i;
        else
            return lsearch(arr, key, i+1);
    }
    public static void main(String[] args) {
        int[] arr = {5, 6, 8, 7, 9};
        System.out.println(lsearch(arr, 9, 0));
    }
}
