class Solution {
    public void moveZeroes(int[] nums) {
        int j=0;
        int[] result=new int[nums.length];
        for(int q :nums)
        {
            if(q!=0)
            {
                result[j]=q;
                j++;
            }
        }
        System.arraycopy( result, 0, nums, 0, nums.length );
    }
}
