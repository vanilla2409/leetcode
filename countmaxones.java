class countmaxones {
    public int findMaxConsecutiveOnes(int[] nums) {
        int[] count=new int[nums.length];
        for(int i=0;i<count.length;i++)
        {
            count[i]=0;
        }        int j=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {count[j]=0;
            j++;}
            else
            count[j]++;
        }
        int max=0;
        for( j=1;j<count.length;j++)
        {
            if(count[j]>count[max])
            max=j
        }
        return count[max];
    }
}