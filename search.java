public class search {



 
    node head;
    
    private int i=0;
    

   
    class node{
        int data;
        node nxt;
        
        node(int data){
            this.data=data;
            this.nxt=null;
            
        }
    }
    
    public int search_element(int data)
    {
         node newnode=new node(data);
         node curnode=head;

         while(curnode.data!=newnode.data)
         {
            curnode=curnode.nxt;
            i++;
         }
      return i;
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
    
    // public void deleteFirst()
    // {
    //    if(head==null)
    //    {
    //        System.out.print("Empty");           
    //    }
    
    //     head=head.nxt;
    // }
    // public void deletelast()
    // {
    //     if(head==null)
    //    {
    //        System.out.print("Empty");           
    //    }



    //    if(head.nxt==null)
    //    {
    //        head=null;
    //        return;
    //    }
       
    //    node secondlast=head;
    //    node lastnode=head.nxt;
    //    while(lastnode.nxt!=null)
    //    {
    //        lastnode=lastnode.nxt;
    //        secondlast=secondlast.nxt;
    //    }
       
    //    secondlast.nxt=null;
       
        
        
    // }
    
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
    
    
    
	public static void main(String[] args) {
	    
         search l1=new search();
	    l1.addFirst(3);
	    l1.addFirst(2);
	    l1.addFirst(8);
	    l1.addFirst(3);
        l1.addFirst(7);
        l1.addFirst(5);
        l1.addFirst(1);
        
	    System.out.print("LinkedList in java: ");
	    l1.printlist();
        System.out.println("Your element position in linkedlist is: "+l1.search_element(5));
	    
	    //l1.deleteFirst();
	    // System.out.print("Delete First element: ");
	    // l1.printlist();
	    
	    // //l1.deletelast();
	    // System.out.print("Delete last element: ");
	    // l1.printlist();
        

        
	    


	    
	    
	    
	    
	    
	}
}
    

