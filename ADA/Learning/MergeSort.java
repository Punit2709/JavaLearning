public c
lass MergeSort {
   
    public static void merge(int[] arr, int s, int mid, int e){
        int merged[] = new int[e - s + 1];
        int idx1 = s;
        int idx2 = mid + 1;
        int x = 0;

        while(idx1 <= mid && idx2 <= e){
            if(arr[idx1] <= arr[idx2])
                merged[x++] = arr[idx1++];
            else
                merged[x++] = arr[idx2++];
        }

        while(idx1 <= mid)
            merged[x++] = arr[idx1++];
        
        while(idx2 <= e)
            merged[x++] = arr[idx2++];
        
        for(int i  = 0, j= s; i < merged.length; i++, j++)
            arr[j] = merged[i];
    }

    public static void mergeSort(int[] arr, int s, int e){
        if( s >= e)
            return;
        else{
            int mid = (s + e)/2;
            mergeSort(arr, s, mid);
            mergeSort(arr, mid + 1, e);
            merge(arr, s, mid, e);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 8, 9, 5, 4, 10, 6};
        mergeSort(arr, 0, 6);
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

