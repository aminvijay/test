package com.test.node;

public class VijLinkedList {
	
	public static void main(String[] args) {
		VijLinkedList lList = new VijLinkedList();
		
		lList.addNode("a");
		lList.addNode("b");
		lList.addNode("c");
		lList.addNode("d");
		lList.addNode("e");
		
		System.out.println("lList - print linkedlist: " + lList);
		
		 System.out.println("lList.size() - print linkedlist size: " + lList.getSize());
		 
		 System.out.println("lList.get(3) - get 3rd element: " + lList.getData(3));
		 
		 System.out.println("lList.remove(2) - remove 2nd element: " + lList.removeNode(2));
		 
		 
	        System.out.println("lList.get(3) - get 3rd element: " + lList.getData(3));
	        System.out.println("lList.size() - print linkedlist size: " + lList.getSize());
	        System.out.println("lList - print linkedlist: " + lList);	
	        
	        lList.addFirst("aa");
	        System.out.println("lList - print linkedlist: " + lList);
	        lList.addFirst("bb");
	        System.out.println("lList - print linkedlist: " + lList);
	        
	        lList.addLast("cc");
	        System.out.println("lList - print linkedlist: " + lList);
	}

	
	private Node head;
	private int count;
	
	public VijLinkedList(){
		head = new Node(null);
		count = 0;
	}
	
	public void addLast(Object data){
		Node tmp = new Node(data, null);
		Node current = head;
		
		while(current.getNext() != null){
			current = current.getNext();
		}
		current.setNext(tmp);
		count++;
	}
	
	public void addFirst(Object data){
		Node tmp = new Node(data, null);
		Node current = head;		
		tmp.setNext( current.getNext());
		current.setNext(tmp);
		count++;
		
	}
	public void addNode(Object data){
		//System.out.println(" in addNode count " + count);
		//create last node
		Node tmp = new Node(data, null);
		//get first/empty node as current (0 position node)
		Node current = head;
		
		//when while condition true, last node is current node and we will add empty/newly created node there
		while(current.getNext() != null){
			current = current.getNext();
		}
		
		current.setNext(tmp);
		count++;
	}
	
	public void addNode(Object data, int index){
		
		
		//if(! ( index <0 || index > count)){			
		//}

		Node tmp = new Node(data, null);
		Node current = head;
		
		for(int i = 1 ; i < index && current.getNext() != null; i++){
			current = current.getNext();
		}
		
		tmp.setNext(current.getNext());
		current.setNext(tmp);;
		count++;		
	}
	
	public Object getData(int index){
		
		//if(index < 0 || count < 0){
		if(index < 0 ){
			return null;
		}
		
		Node current = head.getNext();
		for(int i = 1; i < index; i++){
			if(current.getNext() == null){
				return null;				
			}
			
			current = current.getNext();
		}
		return current.getData();
	}
	
	public boolean removeNode(int index){
		
		//System.out.println(" in removeNode count " + count);
		if(index < 1 || index > count){
			return false;
		}
		
		Node current = head;
		for(int i =1; i < index; i++){
			if(current.getNext() == null){
				return false;
			}
			current = current.getNext();			
		}
		
		current.setNext(current.getNext().getNext());
		count--;
		return true;
	}
	
	public int getSize() {
		return count;
	}
	
	
	public String toString1() {
        Node crunchifyCurrent = head.getNext();
        String output = "";
        while (crunchifyCurrent != null) {
            output += "[" + crunchifyCurrent.getData().toString() + "]";
            crunchifyCurrent = crunchifyCurrent.getNext();
        }
        return output;
    }
	
	public String toString() {
		
		Node current = head.getNext();
		StringBuilder sb = new StringBuilder();
		while(current != null){
			sb.append("[" + current.getData().toString()+"]");
			current = current.getNext();
		}
		return sb.toString();
	}

}
