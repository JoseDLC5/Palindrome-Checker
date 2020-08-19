package stacks;


public class Stack<E> implements StackInt<E> {
	
	private static class Node<F>{
		private F data;
		private Node<F> next;
		// Constructor
		
		public Node(F data, Node<F> next) {
			super();
			this.data = data;
			this.next = next;
		}
		public Node(F data) {
			super();
			this.data = data;
		}
	}
	
	//data fields
	private Node<E> top;
	private int size;
	
	//Constructor
	public Stack() {
		top = null;
		size = 0;
	}
	
	//Methods
	
	public E push(E obj) {
		top = new Node<E>(obj, top);
		size++;
		return obj;
	}
	
	public E peek() {
		if(top == null) {;
		throw new IllegalStateException("Stack is empty");
		}
		else
		{
			return top.data;
		}
	}
	
	public E pop() {
		if(top == null) {
			throw new IllegalStateException("Empty List");
		}
		Node<E> ans = top;
		top = top.next;
		size--;
		return ans.data;
	}
	
	public boolean empty() {
		return top.equals(null);	
	}
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		Node<E> current = top;
		s.append("[");
		while (current.next!=null) {
			s.append(current.data.toString()+",");
			current = current.next;
		}
		s.append(current.data.toString());
		s.append("]");
		return s.toString();
	}
	
	public static void main(String args[]) {
	}
}
