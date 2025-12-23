import java.util.AbstractMap.SimpleImmutableEntry;




class MyLinkedList
{
    private int capacity;
    private int size;
    private Node head;
    private Node tail;




    public
    MyLinkedList
    ()
    {
        this.setCapacity( -1 );
        this.size = 0;
        this.head = null;
        this.tail = null;
    }




    public
    MyLinkedList
    (
        final int capacity
    )
    {
        this.setCapacity( capacity );
        this.size = 0;
        this.head = null;
        this.tail = null;
    }




    public
    MyLinkedList
    (
        final Node node
    )
    {
        this.setCapacity( -1 );
        final SimpleImmutableEntry < Integer, Node > entry = node.countToTail();
        this.size = entry.getKey();
        this.head = node;
        this.tail = entry.getValue();
    }




    public
    MyLinkedList
    (
        final int capacity
        , final Node node
    )
    {
        this.setCapacity( capacity );
        final SimpleImmutableEntry < Integer, Node > entry= node.getNNodes( capacity );
        this.size = entry.getKey();
        this.head = node;
        this.tail = entry.getValue();
    }




    int
    getCapacity
    ()
    {
        return this.capacity;
    }




    int
    setCapacity
    (
        final int capacity
    )
    {
        this.capacity = capacity;


        return capacity;
    }




    int
    getSize
    ()
    {
        return this.size;
    }




    Node
    getNode
    (
        final int index
    )
    {

        if
        (
            index >= this.getSize()
            || index < 0
        )
        {
            return null;
        }


        Node node = null;

        if
        (
            index > this.getSize() / 2
        )
        {
            int currIndex = this.getSize() - 1;
            node = this.getTail();


            while
            (
                currIndex > index
            )
            {
                node = node.getPrev();

                currIndex --;
            }


        }
        else
        {
            int currIndex = 0;
            node = this.getHead();


            while
            (
                currIndex < index
            )
            {
                node = node.getNext();

                currIndex ++;
            }


        }


        return node;
    }




    Node
    getHead
    ()
    {
        return this.head;
    }




    Node
    removeHead
    ()
    {
        final Node head = this.getHead();

        if
        (
            head != null
        )
        {
            this.size --;

            if
            (
                head.hasNext()
            )
            {
                this.head = head.getNext();
                this.head.setPrev( null );
                head.setNext( null );
            }
            else
            {
                this.head = null;
                this.tail = null;
            }

        }


        return head;
    }




    Node
    getTail
    ()
    {
        return this.tail;
    }




    Node
    removeTail
    ()
    {
        final Node tail = this.getTail();

        if
        (
            tail != null
        )
        {
            this.size --;

            if
            (
                tail.hasPrev()
            )
            {
                this.tail = tail.getPrev();
                this.tail.setNext( null );
                tail.setPrev( null );
            }
            else
            {
                this.head = null;
                this.tail = null;
            }

        }


        return tail;
    }




    Node
    removeAtIndex
    (
        final int index
    )
    {

        if
        (
            index < 0
            || index >= this.getSize()
        )
        {
            return null;
        }
        else if
        (
            index == 0
        )
        {
            return this.removeHead();
        }
        else if
        (
            index == this.getSize() - 1
        )
        {
            return this.removeTail();
        }
        else
        {
            final Node node = this.getNode( index );
            node.getPrev().setNext( node.getNext() );
            node.getNext().setPrev( node.getPrev() );
            node.setPrev( null );
            node.setNext( null );
            this.size --;


            return node;
        }

    }




    public
    int
    get
    (
        final int index
    )
    {
        final Node node =  this.getNode( index );

        if
        (
            node == null
        )
        {
            return -1;
        }
        else
        {
            return node.getVal();
        }

    }





    public
    void
    addAtHead
    (
        final int val
    )
    {

        if
        (
            this.getSize() == this.getCapacity()
        )
        {
            return;
        }
        else if
        (
            this.size == 0
        )
        {
            this.head = new Node( val );
            this.tail = this.getHead();
        }
        else
        {
            this.head.setPrev( new Node( val, this.head ) );
            this.head = this.head.getPrev();
        }

        this.size ++;
    }




    public
    void
    addAtTail
    (
        final int val
    )
    {

        if
        (
            this.getSize() == this.getCapacity()
        )
        {
            return;
        }
        else if
        (
            this.size == 0
        )
        {
            this.head = new Node( val );
            this.tail = this.getHead();
        }
        else
        {
            this.tail.setNext( new Node( this.tail, val ) );
            this.tail = this.tail.getNext();
        }

        this.size ++;
    }




    public
    void
    addAtIndex
    (
        final int index
        , final int val
    )
    {

        if
        (
            this.getSize() == this.getCapacity()
            || index < 0
            || index > this.getSize()
        )
        {
            return;
        }
        else if
        (
            index == 0
        )
        {
            this.addAtHead( val );
        }
        else if
        (
            index == this.getSize()
        )
        {
            this.addAtTail( val );
        }
        else
        {
            final Node node = this.getNode( index );
            final Node newNode = new Node( val, node );

            if
            (
                node.hasPrev()
            )
            {
                node.getPrev().setNext( newNode );
                newNode.setPrev( node.getPrev() );
            }

            node.setPrev( ( newNode ) );
            this.size ++;
        }

    }




    public
    void
    deleteAtIndex
    (
        final int index
    )
    {
        removeAtIndex( index );
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
        this.setVal( 0 );
        this.setPrev( null );
        this.setNext( null );
    }




    public
    Node
    (
        final int val
    )
    {
        this.setVal( val );
        this.setPrev( null );
        this.setNext( null );
    }




    public
    Node
    (
        final Node prev
        , final int val
    )
    {
        this.setVal( val );
        this.setPrev( prev );
        this.setNext( null );
    }




    public
    Node
    (
        final int val
        , final Node next
    )
    {
        this.setVal( val );
        this.setPrev( null );
        this.setNext( next );
    }




    public
    Node
    (
        final Node prev
        , final Node next
    )
    {
        this.setVal( 0 );
        this.setPrev( prev );
        this.setNext( next );
    }




    public
    Node
    (
        final Node prev
        , final int val
        , final Node next
    )
    {
        this.setVal( val );
        this.setPrev( prev );
        this.setNext( next );
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
        final int val
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
    getPrev
    ()
    {
        return this.prev;
    }




    Node
    setPrev
    (
        final Node prev
    )
    {
        this.prev = prev;


        return prev;
    }




    boolean
    hasNext
    ()
    {
        return this.next != null;
    }




    Node
    getNext
    ()
    {
        return this.next;
    }




    Node
    setNext
    (
        Node next
    )
    {
        this.next = next;


        return next;
    }




    SimpleImmutableEntry < Integer, Node >
    countToTail
    ()
    {

        if
        (
            this == null
        )
        {
            return new SimpleImmutableEntry <> ( 0, null );
        }

        int size = 1;
        Node tail = this;

        while
        (
            tail.hasNext()
        )
        {
            tail = tail.getNext();
            size ++;
        }


        return new SimpleImmutableEntry <> ( size, tail );
    }




    SimpleImmutableEntry < Integer, Node >
    getNNodes
    (
        final int count
    )
    {

        if
        (
            this == null
        )
        {
            return new SimpleImmutableEntry <> ( 0, null );
        }

        int size = 1;


        Node tail = this;

        while
        (
            tail.hasNext()
                && size < count
        )
        {
            tail = tail.getNext();
            size ++;
        }


        return new SimpleImmutableEntry <> ( size, tail );
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
