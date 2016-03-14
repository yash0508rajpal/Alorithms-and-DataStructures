package DataStructure;

public class LinkList {
	private Node start;
	private Node end;
	public int size;
	
	
	public LinkList(){
		this.size = 0;
		this.start = null;
		this.end = null;
		
	}
	
	public void insertAtBegining(int data){
		Node nptr = new Node(data,null);
		size++;
		if(start == null){
			start = nptr;
			end = start;
		}
		else{
			nptr.setLink(start);
			start = nptr;
		}
	
	}
	
	public void insertAtEnd(int data){
		Node nptr = new Node(data,null);
		size++;
		if(start == null){
			start = nptr;
			end = start;
		}
		else{
			end.setLink(nptr);
			end = nptr;
		}
	}
	
	public int sizeOfLinkList(){
		return  size;
	}
	
	public void insertAtPostion(int data,int pos){
		Node nptr = new Node(data,null);
		size++;
		Node ptr = start;
		pos = pos -1;
		for(int i= 1;i <size;i++){
			
			if(i == pos){
				Node temp = ptr.getLink();
				nptr.setLink(temp);
				ptr.setLink(nptr);
				break;
			}
			ptr = ptr.getLink();
		
		}
	}
	
	public void deleteAtPosition(int pos){
		
		if(pos == 1){
			start = start.getLink();
			size--;
			return;
		}
		if(pos == size){
			Node s = start;
			Node t = start;
			while(s!=end){
				t = s;
				s = s.getLink();
			}
			end = t;
			t.setLink(null);
			size--;
			return;
		}
		Node ptr = start;
		pos = pos -1;
		for(int i=1;i < size-1;i++){
			if(i == pos){
				Node temp = ptr.getLink();
				temp = temp.getLink();
				ptr.setLink(temp);
				break;
			}
			ptr = ptr.getLink();
		}
		size--;
	}
	
	public void display(){
		if(size == 0){
			System.out.println("Empty");
			return;
		}
		
		if(start.getLink() == null){
			System.out.println(start.getData());
			return;
		}
		Node ptr = start;
		
		while(ptr.getLink()!= null){
			System.out.print(ptr.getData() + "->");
			ptr = ptr.getLink();
		}
		System.out.println(ptr.getData());
	}
}

