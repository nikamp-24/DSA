public class linearBinary {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4};
        int target = 4;
        int result1 = linearSearch(nums, target);
        int result2 = binarySearch(nums, target, 0, nums.length-1);

        if (result1 != -1){
            System.out.println("Element found at index " + result1);
        }else {
            System.out.println("Elements does not found");
        }
    }

    public static int linearSearch(int[] nums, int target) {
        int steps = 0;
        for (int i = 0; i < nums.length; i++){
            steps++;
            if (target == nums[i]){
                System.out.println("The number of steps taken by linear: " + steps);
              return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] nums, int target, int left, int right) {
//        int steps = 0;
//        int left = 0;
//        int right = nums.length -1;

//        binary search with the help of recursion
        if (left <= right){

            int mid = (left+right)/2;

            if (nums[mid] == target)
                 return mid;
            else if (nums[mid] > target)
                return binarySearch(nums, target,left, right);
            else
                return  binarySearch(nums, target,left, right);

        }

//       while (left <= right){
//           steps++;
//           int mid = (left + right) / 2;
//
//           if (nums[mid] == target){
//               System.out.println("The number of steps taken by binary: " + steps);
//               return mid;
//           } else if (nums[mid] > target) {
//               right = mid - 1;
//           }else {
//               left = mid+1;
//           }
//       }

        return -1;
    }
}
