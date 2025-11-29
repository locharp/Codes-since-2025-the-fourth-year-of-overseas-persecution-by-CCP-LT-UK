class Solution
{

    func
    minOperations
    (
        nums: Array < Int64 >
        , k: Int64
    )
    : Int64
    {
        nums.iterator().fold( 0, { x, y => x + y } ) % k
    }
    
}
