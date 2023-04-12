public class Deletenodes {

    class node{
        int data;
        node nxt;
        
        node(int data){
            this.data=data;
            this.nxt=null;
        
        }
    }
    node head; 



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
   public void delete()
   {
        if(head==null)
        {
            System.out.print("Empty");
        }

        if(head.data>25)
       {
           head=head.nxt;           
       }
        node secondLast=head;
        node Lastnode=head.nxt;
        
       while(Lastnode!=null)
       {
           if(Lastnode.data>25)
           {
             secondLast.nxt=Lastnode.nxt;
             Lastnode=secondLast.nxt;
           }
          else{
           Lastnode=Lastnode.nxt;
          secondLast=secondLast.nxt;
          }

       }

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
              System.out.print(curnode.data+" ");
           curnode=curnode.nxt;
       }    
    }
   

    public static void main(String[] args) {
	    
	    Deletenodes l1=new Deletenodes();

        l1.addFirst(1);

        for(int i=2;i<=50;i++)
        {
            l1.addLast(i);
        }
        System.out.print("Your linked list: ");
        l1.printlist();
         System.out.print("\n");
        l1.delete();
        System.out.print("Your new linked list : ");
        l1.printlist();
	
    
        }
}
