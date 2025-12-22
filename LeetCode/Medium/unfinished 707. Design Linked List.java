import java.util.AbstractMap.SimpleImmutableEntry;




class MyLinkedList
{
    private final boolean MUTABLE;
    private boolean resizable;
    private int capacity;
    private int size;
    private Node head;
    private Node tail;




    public
    MyLinkedList
    ()
    {
        this.MUTABLE = true;
        this.setResizable( true );
        this.setCapacity( -1 );
        this.size = 0;
        this.SetHead( null );
        this.SetTail( null );
    }




    public
    MyLinkedList
    (
        int capacity
    )
    {
        this.MUTABLE = true;
        this.setResizable( true );
        this.setCapacity( capacity );
        this.size = 0;
        this.SetHead( null );
        this.SetTail( null );
    }




    public
    MyLinkedList
    (
        Node node
    )
    {
        this.MUTABLE = true;
        this.setResizable( true );
        this.setCapacity( -1 );
        SimpleImmutableEntry < Integer, Node > entry = countToTail( node );
        this.size = entry.getKey();
        this.SetHead( node );
        this.SetTail( entry.getValue() );
    }




    public
    MyLinkedList
    (
        int capacity
        , Node node
    )
    {
        this.MUTABLE = true;
        this.setResizable( true );
        this.setCapacity( capacity );
        SimpleImmutableEntry < Integer, Node > entry= getNNode( node );
        this.size = entry.getKey();
        this.SetHead( node );
        this.SetTail( entry.getValue() );
    }




    public
    MyLinkedList
    (
        int capacity
        , Node node
        , boolean resizable
    )
    {
        this.MUTABLE = true;
        this.setResizable( resizable );
        this.capacity = capacity;
        SimpleImmutableEntry < Integer, Node > entry= getNNode( node );
        this.size = entry.getKey();
        this.SetHead( node );
        this.SetTail( entry.getValue() );
    }




    public
    MyLinkedList
    (
        boolean mutable
        , Node head
    )
    {

        if
        (
            head == null
        )
        {
            return null;
        }
        
        SimpleImmutabelEntry < Integer, Node > entry = head.countToTail( head );
        this.head = head;;
        this.size = entry.getKey();
        this.tail = entry.getValue();
        
        if
        (
            mutable
        )
        {
            this.MUTABLE = true;
            this.setResizable( true );
            this.setCapacity = capacity;
        }
        else
        {
            this.capacity = size ;
            this.resizable = false;
            this.MUTABLE = false;
        }
        
    }




    public
    MyLinkedList
    (
        Node node
        , int capacity
    )
    {
        this.MUTABLE = true;
        this.setResizable( true );
        this.setCapacity( capacity );
        this.size = 0;
        this.SetHead( node );
        this.SetTail( node );
    }




    public int
    get
    (
        int index
    )
    {

        if
        (
            index >= this.size
        )
        {
            return
        }
        return -1;
    }




    public
    void
    addAtHeaaddAtHead
    (
        int val
    )
    {

    }




    public
    void
    addAtTail
    (
        int val
    )
    {

    }




    public
    void
    addAtIndeaddAtIndex
    (
        int index
        , int val
    )
    {

    }




    public
    void
    deleteAtIndex
    (
        int index
    )
    {

    }




    int
    getSize
    ()
    {
        return this.size;
    }




    int
    setSize
    (
        int capacity
    )
    {
        this.capacity = capacity;


        return capacity;
    }






}




class Node
{
    private int val;
    private Node next;
    private Node prev;




    public
    Node
    ()
    {
        setVal( 0 );
        SetPrevNode( null );
        SetNextNode( null );
    }




    public
    Node
    (
        int val
    )
    {
        setVal( val );
        SetPrevNode( null );
        SetNextNode( null );
    }




    public
    Node
    (
        Node prev
        , int val
    )
    {
        setVal( val );
        SetPrevNode( prev );
        SetNextNode( null );
    }




    public
    Node
    (
        int val
        , Node next
    )
    {
        setVal( val );
        SetPrevNode( null );
        SetNextNode( next );
    }




    public
    Node
    (
        Node prev
        , Node next
    )
    {
        setVal( 0 );
        SetPrevNode( prev );
        SetNextNode( next );
    }




    public
    Node
    (
        Node prev
        , int val
        , Node next
    )
    {
        setVal( val );
        SetPrevNode( prev );
        SetNextNode( next );
    }




    int
    getVal
    ()
    {
        return this.val;
    }




    int
    setVal
    (
        int val
    )
    {
        this.val = val;


        return val;
    }
    
    
    
    
    boolean
    hasPrev
    ()
    {
        return this.prev != null;
    }




    Node
    getPrevNode
    ()
    {
        return this.prev;
    }




    setPrevNode
    (
        Node prev
    )
    {
        this.prev = prev;


        return prev
    }




    boolean
    hasNext
    ()
    {
        return this.next != null;
    }




    Node
    getNextNode
    ()
    {
        return this.next;
    }




    Node
    setNextNode
    (
        Node next
    )
    {
        this.next = next;


        return next;
    }




    SimpleImmutableEntry < Integer, Node >
    countToTail
    (
        Node node
    )
    {
        
        if
        (
            node == null
        )
        {
            return new SimpleImmutableEntry <> ( 0, null );
        }
        
        int size = 1;


        while
        (
            node.hasNext()
        )
        {
            node = node.getNext()
            size ++;
        }


        return new SimpleImmutableEntry <> ( size, node );
    }




    SimpleImmutableEntry < Integer, Node >
    getNNodes
    (
        Node node
        , int count
    )
    {
        
        if
        (
            node == null
        )
        {
            return new SimpleImmutableEntry <> ( 0, null );;
        }
        
        int size = 1;
        
        
        while
        (
            node.hasNext()
            && size < count
        )
        {
            node = node.getNext();
            size ++;
        }


        return new SimpleImmutableEntry <> ( size, node );
    }

}
/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
