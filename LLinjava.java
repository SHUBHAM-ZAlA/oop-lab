
public class LLinjava
{


    node head;
    private int size;

   LLinjava()
   {
       this.size=0;
   }
    
    class node{
        int data;
        node nxt;
        
        node(int data){
            this.data=data;
            this.nxt=null;
            size++;
        }
    }
    
    
    
    public void addFirst(int data)
    {
       node new_node=new node(data);
       
       
       if(head==null)
       {
           head=new_node;
           return;
       }
       
       new_node.nxt=head; 
       head=new_node;
    }
    
    
    public void addLast(int data)
    {
        node new_node=new node(data);
       
       if(head==null)
       {
           new_node=head;
           return;
       }
       node curnode=head;
       
       while(curnode.nxt!=null)
       {
           curnode=curnode.nxt;
       }
       
       curnode.nxt=new_node;
    }
    
    public void deleteFirst()
    {
       if(head==null)
       {
           System.out.print("Empty");           
       }
       size--;
        head=head.nxt;
    }
    public void deletelast()
    {
        if(head==null)
       {
           System.out.print("Empty");           
       }
       
       size--;
       if(head.nxt==null)
       {
           head=null;
           return;
       }
       
       node secondlast=head;
       node lastnode=secondlast.nxt;
       while(lastnode.nxt!=null)
       {
           lastnode=lastnode.nxt;
           secondlast=secondlast.nxt;
       }
       
       secondlast.nxt=null;       
    }


    public void inverseiterate()
    {
        if(head==null || head.nxt==null)
        {
            return;
        }
        node prevnode=head;
        node curnode=head.nxt;
        while(curnode!=null)
        {
           node nextnode=curnode.nxt;
           curnode.nxt=prevnode;
           

          prevnode=curnode;
          curnode=nextnode;

        }
        head.nxt=null;
        head=prevnode;

    }
    
    public node inverserecursive(node head)
    {
        if(head==null || head.nxt==null)
        {
          return head;
        }
        
        node newhead=inverserecursive(head.nxt);
        head.nxt.nxt=head;
        head.nxt=null;
        
        return newhead;
        
        
    }
    
    public void printlist()
    {
         if(head==null)
         {
             System.out.print("Empty");
             return;
         }
         node curnode=head;
       
       while(curnode!=null)
       {
              System.out.print(curnode.data+"-> ");
           curnode=curnode.nxt;
       }
       
     System.out.print("NULL\n");
       
     
    }
   public int getsize()
   {
       return size;
   }
    
    
	public static void main(String[] args) {
	    
	    LLinjava l1=new LLinjava();
	    l1.addFirst(5);
	    l1.addFirst(7);
	    l1.addFirst(9);
	    l1.addLast(3);
	    System.out.print("LinkedList in java: ");
	    l1.printlist();
	    System.out.println("Your linkedlist size is: "+l1.getsize());
	    l1.deleteFirst();
	    System.out.print("Delete First element: ");
	    l1.printlist();
	    
	    l1.deletelast();
	    System.out.print("Delete last element: ");
	    l1.printlist();
       
        l1.inverseiterate();
        System.out.print("Your reverse linkedlist(iterate) is: ");
        l1.printlist();
        
        l1.head= l1.inverserecursive(l1.head);
        System.out.print("Your reverse linkedlist(recursive) is: ");
        l1.printlist(); 
        	    
	}
}