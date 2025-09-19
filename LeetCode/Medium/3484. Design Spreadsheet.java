class Spreadsheet
{
    HashMap < String, Integer > ss;



    
    public
    Spreadsheet
    (
        int rows
    )
    {
        ss = new HashMap <> ();
    }


    
    
    public
    void
    setCell
    (
        String cell
        , int value
    )
    {
        ss.put( cell,  value );
    }


    
    
    public
    void
    resetCell
    (
        String cell
    )
    {
        ss.remove( cell );
    }
    

        
    
    public
    int
    getValue
    (
        String formula
    )
    {
        String[] s = formula.substring( 1 ).split( "\\+" );


        return get( s[0] ) + get( s[1] );
    }




    int
    get
    (
        String s
    )
    {

        if
        (
            Character.isUpperCase( s.charAt( 0 ) )
        )
        {
            return ss.getOrDefault( s, 0 );
        }
        else
        {
            return Integer.valueOf( s );
        }

    }
    
}

/**
 * Your Spreadsheet object will be instantiated and called as such:
 * Spreadsheet obj = new Spreadsheet(rows);
 * obj.setCell(cell,value);
 * obj.resetCell(cell);
 * int param_3 = obj.getValue(formula);
 */
