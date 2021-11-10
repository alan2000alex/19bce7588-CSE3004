import java.util.Scanner;

class BinarySearch {

    int binarySearch(int arr[], int l, int r, int x) {
        if (r >= l && l < arr.length - 1) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == x)
                return mid;

            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            return binarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }

    public static void main(String args[]) {
        BinarySearch ob = new BinarySearch();
        int arr[] = { 1, 5, 8, 12, 13 };
        int n = arr.length;
        int x[] = { 8, 1, 23, 1, 11 };
        for (int i = 0; i < x.length; i++) {
            int result = ob.binarySearch(arr, 0, n - 1, x[i]);
            System.out.print(result + " ");
        }

    }
}
