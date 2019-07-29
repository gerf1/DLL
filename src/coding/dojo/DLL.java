package coding.dojo;

public class DLL {
    public Node head;
    public Node tail;
    
    public DLL() {
        this.head = null;
        this.tail = null;
    }
    
    // the push method will add a new node to the end of the list
    public void push(Node newNode) {
        // if there is no head in the list, aka, an empty list, we set the newNode to be the head and tail of the list
        if(this.head == null) {
            this.head = newNode;
            this.tail = newNode;
            return;
        }
        

        Node lastNode = this.tail;
        lastNode.next = newNode;
        newNode.previous = lastNode;
        this.tail = newNode;
    }
    
    public Node pop() {
    	Node prevNode = null; 
    	
    	prevNode = this.tail;
    	this.tail = null; 
    	System.out.println(prevNode.value);
    	return prevNode;
    }
    
    public boolean contains(Integer value) {
    	Node current = this.head;
    	
    	while(current !=null) {
    		if(current.value == value) {
    			return true;
    		}
    		current = current.next;
    	}
    	
    	return false;	
    }
    
    public int size() {
    	int count = 0;
    	Node current = this.head;
    	while(current !=null) {
    		count++;
    		current = current.next;
    	}
    	return count;
    }
    
    public void printValuesBackward() {
    	Node current = this.tail;
    	
    	while(current != null) {
    		System.out.println(current.value);
    		current = current.previous;
    	}
    }
    
    public void printValuesForward() {
        // find the first node, aka head.
        Node current = this.head;
        
        // while the current node exists...
        while(current != null) {
            // print it's valuecopy
            System.out.println(current.value);
            // and move on to it's next node.
            current = current.next;
        }
    
    }
   }
