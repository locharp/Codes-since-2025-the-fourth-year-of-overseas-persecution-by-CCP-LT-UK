class Solution
{
   
    public
    int
    triangleNumber
    (
        int[] nums
    )
    {
        int n = nums.length;
        int m = n - 2;
        int answer = 0;
        Arrays.sort( nums );
       

        for
        (
            int i = 0
            ; i < m
            ; i ++
        )
        {
            int k = i + 2;
            int x = nums[i];


            for
            (
                int j = i + 1
                ; j <= m
                    && nums[i] > 0
                ; j ++
            )
            {
                int y = nums[j];

               
                while
                (
                    k < n
                    && nums[k] < x + y
                )
                {
                    k ++;
                }

                answer += k - j - 1;
            }

           
        }


        return answer;
    }
   
}
