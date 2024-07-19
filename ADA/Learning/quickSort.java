public class quickSort {
    
    public static void swap(int[] arr, int a, int b){
       int temp = arr[a];
       arr[a] = arr[b];
       arr[b] = temp;
    }

    public static void quicksort(int[] arr, int lb, int ub){
        if (lb < ub) {
            int pivotIndex = partition(arr, lb, ub);
            quicksort(arr, lb, pivotIndex - 1);
            quicksort(arr, pivotIndex + 1, ub);
        }
    }

    public static int partition(int[] arr, int lb, int ub) {
        int pivot = arr[lb];
        int left = lb + 1;
        int right = ub;

        boolean done = false;
        while (!done) {
            while (left <= right && arr[left] <= pivot) {
                left++;
            }
            while (arr[right] >= pivot && right >= left) {
                right--;
            }
            if (right < left) {
                done = true;
            } else {
                swap(arr, left, right);
            }
        }
        swap(arr, lb, right);
        return right;
    }

    public static void main(String[] args) {
        int[] array = {1, 8, 6, 7, 3, 5};
        quicksort(array, 0, array.length - 1);
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
