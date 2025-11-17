class Solution
{

    func
    isPowerOfThree
    (
        n: Int64
    )
    : Bool
    {
        
        if
        (
            n < 1
        )
        {
            return false
        }

        var o: Int64 = 1


        for
        (
            n > o
        )
        {
            o *= 3
        }


        n == o
    }

}
