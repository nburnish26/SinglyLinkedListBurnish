/*
 * Nathaniel Burnish
 * 9/18/2018
 * Project to create a link list and delete every value greater than the average
 * Node.java
 * LinkedList.java
 */
public class Node {

	double data;
	Node next;
	
	public Node() 
	{
		this(-1, null);
	}
	
	public Node(double data)
	{
		this(data, null);
	}
	
	public Node(double data, Node next)
	{
		this.data = data;
		this.next = next;
	}
	
	public String toString()
	{
		String str = "";
		str += data + " ";
		return str;
	}
}
