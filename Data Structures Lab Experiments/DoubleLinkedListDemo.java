import java.util.Scanner;
class MyNode{
	MyNode prev;
	int data;
	MyNode next;
}
class MyLinkedList{
	Scanner s = new Scanner(System.in);
	MyNode head,last;
	MyLinkedList(){
		head = null;
		last=null;
	}
	void create(int n){
		MyNode temp;
		for(int i=0;i<n;i++){
			temp = new MyNode();
			System.out.println("enter data : ");
			temp.data = s.nextInt();
			temp.next = null;
			if(head == null){
				head=last=temp;
				head.prev = null;
			}
			else{
				last.next = temp;
				temp.prev = last;
				last = temp;
			}
		}
	}
	void insertB(){
		MyNode temp = new MyNode();
		System.out.println("enter data : ");
		temp.data = s.nextInt();
		temp.prev = null;
		temp.next = head;
		head.prev = temp;
		head = temp;
	}
	void insertP(int p){
		MyNode temp = new MyNode();
		MyNode temp1;
		int i;
		System.out.println("enter data : ");
		temp.data = s.nextInt();
		for(i=0,temp1=head;i<p-1;temp1=temp1.next,i++);
		temp.next = temp1.next;
		temp.prev = temp1;
		temp1.next.prev = temp;
		temp1.next = temp;
	}
	void insertE(){
		MyNode temp = new MyNode();
		MyNode temp1;
		System.out.println("enter data: ");
		temp.data = s.nextInt();
		temp.next = null;
		for(temp1=head;temp1.next!=null;temp1=temp1.next);
		temp.prev = temp1;
		temp1.next = temp;
		last = temp;
	}
	void deleteB(){
		MyNode temp;
		temp = head;
		head = temp.next;
		head.prev = null;
		temp = null;
	}
	void deleteP(int p){
		MyNode temp,temp1;
		int i;
		for(temp = head,i=0;i<p-1;i++,temp = temp.next);
		temp1 = temp.next;
		temp.next = temp1.next;
		temp1.next.prev = temp;
		temp1 = null;
	}
	void deleteE(){
		MyNode temp,temp1;
		for(temp=head;temp.next!=null;temp = temp.next);
		temp1 = temp.prev;
		temp1.next = null;
		temp = null;
		last = temp1;
	}
	void displayF(){
		MyNode temp;
		for(temp = head;temp!=null;temp = temp.next)
			System.out.print(temp.data+"-->");
		System.out.println("null");
	}
	void displayB(){
		MyNode temp;
		for(temp = last;temp!=null;temp=temp.prev)
			System.out.print(temp.data+"-->");
		System.out.println("null");
	}
}

class DoubleLinkedListDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		MyLinkedList l = new MyLinkedList();
		System.out.println("enter the size of the list: ");
		l.create(sc.nextInt());
		while(true){
		System.out.println("enter the choice of operations:\n1.insert at begin \n 2.insert at any position \n 3.insert at end \n4.delete at begin\n5.delete at any pos \n6. delete at end \n7. displayF() \n8.displayB()");
		int ch = sc.nextInt();
		switch(ch){
			case 1: l.insertB();
				break;
			case 2: System.out.println("enter the position of the list to be inserted: ");
				l.insertP(sc.nextInt());
				break;
			case 3:l.insertE();
				break;
			case 4:l.deleteB();
				break;
			case 5: System.out.println("enter the position of the list which is to be deleted: ");
				l.deleteP(sc.nextInt());
				break;
			case 6:l.deleteE();
				break;
			case 7: l.displayF();
				break;
			case 8:l.displayB();
				break;
			default: return;
		}
		}
		
	}	
}