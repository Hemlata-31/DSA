class Solution {
    public int thirdMax(int[] nums) {
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        for(int num : nums){
            if(num==first || num==second || num==third){
                continue;
            }

            if(num > first){ //swap num with third
                third = second;
                second = first;
                first = num;
            }

            else if(num > second){
                third = second;
                second = num;
            }

            else if(num > third){
                third = num;
            }
        }

        if(third == Long.MIN_VALUE){ //if 3 distinct numbers doesn't exists we return the largest number
            return (int) first;
        }

        return (int) third;
    }
}