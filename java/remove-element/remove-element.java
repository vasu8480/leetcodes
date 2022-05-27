class Solution {
    public int removeElement(int[] nums, int val) {
        
    int j=0;
      for(int q :nums)
      {
          if(q!=val)
          {
              nums[j]=q;
              j++;
          }
      }
        return j;  
    }
}
