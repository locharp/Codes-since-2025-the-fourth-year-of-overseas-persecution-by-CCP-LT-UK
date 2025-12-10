<?php




class Solution
{

    /**
     * @param Integer $n
     * @return Integer
     */
    function countTriples
    (
        $n
    )
    {
        $ans = 0;

        for
        (
            $c = 5
            ; $c <= $n
            ; $c ++
        )
        {
            $cc = $c * $c;
            $ccHalf = $cc / 2;
            
            
            for
            (
                $a = 2
                    , $aa = 4
                ; $aa <= $ccHalf
                ; $a ++
                    , $aa = $a * $a
            )
            {
                $bb = sqrt( $cc - $aa );

                if
                (
                    floor( $bb ) == $bb
                )
                {
                    $ans += 2;
                }
                
            }

            
        }
        

        return $ans;
    }
    
}




?>
