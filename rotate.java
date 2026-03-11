class rotate {
    public boolean check(int[] nums) {
        int drop=0;
        for(int i=0;i<nums.length;i++)
        {   if(i==nums.length-1)
        continue;
            if(nums[i]>nums[i+1])
            {drop++;}
        }
        if((nums[0]>=nums[nums.length-1]&&drop==1)||drop==0)
       { return true;}
        else {return false;}
    }
}