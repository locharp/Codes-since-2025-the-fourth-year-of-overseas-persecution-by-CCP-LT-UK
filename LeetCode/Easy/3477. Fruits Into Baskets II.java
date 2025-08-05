class Solution
{

    public
    int
    numOfUnplacedFruits
    (
        int[] fruits
        , int[] baskets
    )
    {
        int ans = 0;
        int k = 1;
        

        for
        (
            int fruit
            : fruits
        )
        {
            k = 1;


            for
            (
                int i = 0
                ; i < fruits.length
                ; i ++
            )
            {

                if
                (
                    fruit <= baskets[i]
                )
                {
                    k = 0;
                    baskets[i] = 0;

                    break;
                }

            }


            ans += k;
        }


        return ans;
    }

}
