public class SelectionSort {
    public static void main(String[] args) {
        int nums[] = {2, 4, 8, 6, 3, 5, 9};

        System.out.println("Before Sorting...");
        for (int n : nums) {
            System.out.print(n + " ");
        }
        System.out.println();

        int minIndex = -1;
        int size = nums.length;

        for (int i = 0; i < size-1; i++) {
            minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (nums[j] < nums[minIndex] ){
                    minIndex = j;
                }
            }

            int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;

            System.out.println();
            for (int n : nums) {
                System.out.print(n + " ");
            }
        }

        System.out.println();
        System.out.println("After Sorting...");
        for (int n : nums) {
            System.out.print(n + " ");
        }
    }
}

