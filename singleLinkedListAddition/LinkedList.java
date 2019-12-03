package singleLinkedListAddition;

public class LinkedList {
	
	Node head;
	
			void insert(int data)
			{
				Node n=new Node();
				n.data=data;
				if(head==null) {
					
					n.next=null;
					head=n;
					
				}
				else {
					
					Node temp=head;
					while(temp.next!=null) {
						
						temp=temp.next;
						
					}
					temp.next=n;
					n.next=null;
					
					
				}
				
				
				
			}
			void show() {
				Node temp=head;
				while(temp.next!=null) {
					System.out.print(temp.data+"-->");
					temp=temp.next;
					
				}
				System.out.print(temp.data);
		
				
			}
			void reverse() {
				Node temp1=head.next;
				Node temp=head;
				while(temp1.next!=null){
					
					head.next=temp1.next;
					temp1.next=temp;
					temp=temp1;
					temp1=head.next;
					
				}
				head.next=null;
				temp1.next=temp;
				head=temp1;
				
				
			}
			LinkedList add(LinkedList list) {
				LinkedList resultList=new LinkedList();
				int randomdata=0;
				this.reverse();
				list.reverse();
				int carry=0;
				Node temp=this.head;
				Node temp1=list.head;
				while(temp.next!=null) {
					randomdata=temp.data+temp1.data+carry;
					carry=randomdata/10;
					resultList.insert(randomdata%10);
					temp=temp.next;
					temp1=temp1.next;
					
				}
				randomdata=temp.data+temp1.data+carry;
				carry=randomdata/10;
				resultList.insert(randomdata%10);
				if(carry!=0) {
					resultList.insert(carry);
				
				}
				resultList.reverse();
				
				
				return resultList;
				
				
				
				
				
			}
	
	
	
}
