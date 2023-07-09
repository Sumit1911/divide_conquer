public class majorityCountBrute {
    public static int majorityCount(int nums[]) {
        int majority = nums.length/2;
        int count = 0;
        for(int i=0; i<nums.length; i++) {
            for(int j=0; j<nums.length; j++) {
                if(nums[i] == nums[j]) {
                    count++;
                }
            }
            if(count > majority) {
                return nums[i];
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        int nums[] = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityCount(nums));
    }
}
