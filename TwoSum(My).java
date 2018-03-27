class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len;
        int big = -1;
        int low = 0;
        int high = 1;
        int m = 0;
        int j = 0;
        int[] eResult = new int[2];
        int[] oResult = new int[2];
        for(int i : eResult)
            i = 0;
        for(int i : oResult)
            i = 0;
        len = nums.length;
        int[] aNums = new int[len];
        for(int n : aNums)
            n = big;
        if(target % 2 == 0)
        {
            for(int i = 0; i < len; i++)
            {
                if(nums[i] == target/2 )
                {
                    eResult[m] = i;
                    m++;
                    if(m > 1)break;
                }
                else if(nums[i] < target/2)
                    aNums[i] = low;
                else if(nums[i] > target/2 )
                    aNums[i] = high;
            }
            if(m > 1) return eResult;
            for(int i = 0; i < len; i++)
            {
                if(aNums[i] != big)
                {
                    for(j = i + 1 ; j < len; j++)
                        if(aNums[j] == high - aNums[i])
                            if(nums[i] + nums[j] == target)
                            {
                                eResult[0] = i;
                                eResult[1] = j;
                                return eResult;
                            }
                }
            }
        }
        else
        {
            for(int i = 0; i < len; i++)
            {
                if(nums[i] < target/2)
                    aNums[i] = low;
                else if(nums[i] > target/2 )
                    aNums[i] = high;
            }
            for(int i = 0; i < len; i++)
            {
                if(aNums[i] != big)
                {
                    for(j = i + 1 ; j < len; j++)
                        if(aNums[j] == high - aNums[i])
                            if(nums[i] + nums[j] == target)
                            {
                                oResult[0] = i;
                                oResult[1] = j;
                                return oResult;
                            }
                }
            }
        }
        int[] error = new int[2];
        for(int i : error)
            i = 0;
        return error;
    }
}