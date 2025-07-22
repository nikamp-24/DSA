public class MergeSort {


        public void mergeSort(int[] arr, int left, int right) {
            if (left < right) {

                int mid = left + (right - left) / 2;

                mergeSort(arr, left, mid);
                mergeSort(arr, mid + 1, right);

                merge(arr, left, mid, right);
            }
        }


        private void merge(int[] arr, int left, int mid, int right) {
            // Sizes of two subarrays
            int n1 = mid - left + 1;
            int n2 = right - mid;

            // Create temp arrays
            int[] L = new int[n1];
            int[] R = new int[n2];

            // Copy data to temp arrays
            for (int i = 0; i < n1; ++i)
                L[i] = arr[left + i];
            for (int j = 0; j < n2; ++j)
                R[j] = arr[mid + 1 + j];

            // Merge the temp arrays

            int i = 0, j = 0;
            int k = left;
            while (i < n1 && j < n2) {
                if (L[i] <= R[j]) {
                    arr[k++] = L[i++];
                } else {
                    arr[k++] = R[j++];
                }
            }

            // Copy remaining elements of L[] if any
            while (i < n1) {
                arr[k++] = L[i++];
            }

            // Copy remaining elements of R[] if any
            while (j < n2) {
                arr[k++] = R[j++];
            }
        }

        public static void main(String[] args) {
            int[] arr = { 38, 27, 43, 3, 9, 82, 10 };

            MergeSort sorter = new MergeSort();
            sorter.mergeSort(arr, 0, arr.length - 1);

            System.out.println("Sorted array:");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }

}
