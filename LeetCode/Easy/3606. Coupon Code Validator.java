class Solution
{
    
    public
    List < String >
    validateCoupons
    (
        String[] code
        , String[] businessLine
        , boolean[] isActive
    )
    {
        ArrayList < String > listE = new ArrayList <> ();
        ArrayList < String > listG = new ArrayList <> ();
        ArrayList < String > listP = new ArrayList <> ();
        ArrayList < String > listR = new ArrayList <> ();


        for
        (
            int i = 0
            ; i < code.length
            ; i ++
        )
        {

            if
            (
                !isActive[i]
            )
            {
                continue;
            }


            switch
            (
                businessLine[i]
            )
            {
                
                
                case "electronics":
                    
                    if
                    (
                        isValid( code[i] )
                    )
                    {
                        listE.add( code[i] );
                    }

                    break;


                case "grocery":
                    
                    if
                    (
                        isValid( code[i] )
                    )
                    {
                        listG.add( code[i] );
                    }

                    break;


                case "pharmacy":
                    
                    if
                    (
                        isValid( code[i] )
                    )
                    {
                        listP.add( code[i] );
                    }

                    break;


                case "restaurant":
                    
                    if
                    (
                        isValid( code[i] )
                    )
                    {
                        listR.add( code[i] );
                    }

                    break;

                    
            }

            
        }


        Collections.sort( listE );
        Collections.sort( listG );
        Collections.sort( listP );
        Collections.sort( listR );
        listE.addAll( listG );
        listE.addAll( listP );
        listE.addAll( listR );


        return listE;
    }





    boolean
    isValid
    (
        String s
    )
    {

        if
        (
            s.equals( "" )
        )
        {
            return false;
        }
        

        for
        (
            char c
            : s.toCharArray()
        )
        {

            if
            (
                
                (
                    c < 'a'
                    || c > 'z'
                )
                &&
                (
                    c < 'A'
                    || c > 'Z'
                )
                &&
                (
                    c < '0'
                    || c > '9'
                )
                &&
                c != '_'
            )
            {
                return false;
            }
            
        }


        return true;
    }
    
}©leetcode
