public class InsertionSort {
    public static void main(String[] args) {

                int nums[] = {2, 4, 8, 6, 3, 5, 9};

                System.out.println("Before Sorting...");
                for (int n : nums){
                    System.out.print(n + " ");
                }
                System.out.println();
        System.out.println();


                for (int i =1; i< nums.length; i++){

                    int key = nums[i];
                    int j = i - 1;

                    while (j>=0 && nums[j] > key){
                        nums[j+1] = nums[j] ;
                        j--;
                        for (int n : nums){
                            System.out.print(n + " ");
                        }
                        System.out.println();
                    }
                    nums[j+1] = key;


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

