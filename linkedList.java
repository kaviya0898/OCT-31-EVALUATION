package DataStructure;

public class linkedList {
  node head;
  int[] array= new int[6];
  int index=0;
  class node
  {
	  int data;
	  node next;
	  node(int val)
	  {
		  data=val;
		  next=null;
	  }
  }
  linkedList()
  {
	  head=null;
  }
  public void insert(int val)
  {
	  node newNode=new node(val);
	  if(head==null)
	  {
		  head=newNode;
	  }
	  else
	  {
		  newNode.next=head;
		  head=newNode;
	  }
  }
  public void display()
  {
	  node temp=head;
	  while(temp!=null)
	  {
		  System.out.print(temp.data+" ");
		  temp=temp.next;
	  }
  }
  
 
	public void display2() {
 while(head!=null)
 {
		int max =head.data;
		 node temp = head;
	while(temp!=null) 
	{
		int one = temp.data;
		if(one>max) {
			max=Math.max(max, one);
			break;
		}
		temp=temp.next;
	}
	if(max==head.data) 
	{
		array[index++]=0;
	}
	else
	{
	array[index++]=max;
	}
	head=head.next;
	}
	for(int i =0;i<array.length;i++) {
		System.out.print(array[i]+" ");

}
	}
}


