class Solution
{
    
    func
    fizzBuzz
    (
        n: Int64
    )
    : ArrayList < String >
    {
        let ans: ArrayList < String > = ArrayList( n )
        
        
        for
        (
            i
            in
            1..=n
        )
        {
            
            if
            (
               i % 3 == 0
            )
            {
                 
                 if
                 (
                     i % 5 == 0
                 )
                 {
                     ans.add( "FizzBuzz" )
                 }
                 else
                 {
                     ans.add( "Fizz" )
                 }
                 
            }
            else
            {
                
                if
                (
                    i % 5 == 0
                )
                {
                    ans.add( "Buzz" )
                }
                else
                {
                    ans.add( i.toString() )
                }
                
            }
            
        }
        
        
        ans
    }
    
}
