class Solution
{

    public
    long
    maxSubarrays
    (
        int n
        , int[][] conflictingPairs
    )
    {
        int[] arr1 = new int[n + 1];
        int[] arr2 = new int[n + 1];


        for
        (
            int[] conflictingPair
            : conflictingPairs
        )
        {

            if
            (
                conflictingPair[0] < conflictingPair[1]
            )
            {

                if
                (
                    conflictingPair[0] > arr1[conflictingPair[1]]
                )
                {
                    arr2[conflictingPair[1]] = arr1[conflictingPair[1]];
                    arr1[conflictingPair[1]] = conflictingPair[0];
                }
                else if
                (
                    conflictingPair[0] > arr2[conflictingPair[1]]
                )
                {
                    arr2[conflictingPair[1]] = conflictingPair[0];
                }

            }
            else if
            (
                conflictingPair[1] > arr1[conflictingPair[0]]
            )
            {
                arr2[conflictingPair[0]] = arr1[conflictingPair[0]];
                arr1[conflictingPair[0]] = conflictingPair[1];
            }
            else if
            (
                conflictingPair[1] > arr2[conflictingPair[0]]
            )
            {
                arr2[conflictingPair[0]] = conflictingPair[1];
            }

        }


        long ans = 0;
        int[] j = new int[2];
        long p = 0;
        long q = 0;


        for
        (
            int i = 1
            ; i <= n
            ; i ++
        )
        {

            if
            (
                arr2[i] > j[0]
            )
            {
                j[0] = arr1[i];
                j[1] = arr2[i];
            }
            else if
            (
                arr1[i] > j[0]
            )
            {
                j[1] = j[0];
                j[0] = arr1[i];
            }
            else if
            (
                arr1[i] > j[1]
            )
            {
                j[1] = arr1[i];
            }

            if
            (
                arr1[i] >= j[0]
            )
            {
                p = Math.max( p, q );
                q = j[0] - j[1];
            }
            else
            {
                q += j[0] - j[1];
            }

            ans += i - j[0];
        }


        return ans + Math.max( p, q );
    }

}
