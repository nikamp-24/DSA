public class BubbleSort {
    public static void main(String[] args) {
        int nums[] = {2, 4, 8, 6, 3, 5, 9};

        System.out.println("Before Sorting...");
        for (int n : nums){
            System.out.print(n + " ");
        }
        System.out.println();

        int size = nums.length - 1;
        int temp = 0;
        for (int i =0; i < size; i++){
            for (int j =0; j < size- 1; j++){
                 if (nums[j] > nums[j+1]){
                     temp = nums[j];
                     nums[j] = nums[j+1];
                     nums[j+1] = temp;
                 }

            }

            for (int n : nums){
                System.out.print(n + " ");
            }
            System.out.println();
        }

        System.out.println("After Sorting...");
        for (int n : nums){
            System.out.print(n + " ");
        }
    }
}
