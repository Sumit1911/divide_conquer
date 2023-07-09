public class majorityCountDAC {
    public static int countInRange(int nums[], int num, int lo, int hi) {
        int count = 0;
        for(int i=lo; i<=hi; i++) {
            if(nums[i] == num) {
                count++;
            }
        }
        return count;
    }
    
    public static int majorityElementRec(int nums[], int lo, int hi) {
        if(lo==hi) {
            return nums[lo];
        }

        int mid = lo + (hi-lo)/2;
        int left = majorityElementRec(nums, lo, mid);
        int right = majorityElementRec(nums, mid+1, hi);

        if(left == right) {
            return left;
        }

        int leftCount = countInRange(nums, left, lo, hi);
        int rightCount = countInRange(nums, right, lo, hi);

        return leftCount>rightCount? left: right;

    }

    public static int majorityElement(int nums[]) {
        return majorityElementRec(nums, 0, nums.length-1);
    }
    public static void main(String args[]) {
        int nums[] = {3, 2, 3};
        System.out.println(majorityElement(nums));
    }
}