package singleLinkedListAddition;


public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list=new LinkedList();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		LinkedList list1=new LinkedList();
		list1.insert(9);
		list1.insert(9);
		list1.insert(9);
		list1.insert(9);
		LinkedList result=list.add(list1);
		result.show();
	}

}
