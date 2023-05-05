class Solution {
    public static void main(String[] args) {
        int [] a = {1,1,2,3,3,3,2,4,4,5};
        int ans = singleNumber(a);
        System.out.println("\nAnswer is : " + ans);
    }

    public static int singleNumber(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n;i++){
            for(int j = 1; j < n - i; j++){
                if(nums[j-1] > nums[j]){
                    int temp = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        for(int l = 0; l < n;l++ ){
            System.out.print(nums[l] + ",");
        }
        int k;
        for(k = 0; k < n-1; k+=2){
            System.out.println("\nnums[k] : " + nums[k]);
            System.out.println("\nnums[k+1] : " + nums[k+1]);

            if(nums[k] != nums[k+1]){
                return nums[k];
            }
        }
        return nums[k];
    }
}