/*
 * Nathaniel Burnish
 * 9/18/2018
 * Project to create a link list and delete every value greater than the average
 * Node.java
 * LinkedList.java
 */
public class LinkedList {
	Node head;
	
	public static void main (String [] arg)
	{
		double[] arr = {100.0,  10.0,  15.0,  20.0,  200.0,  30.0,  40.0,  300.0 };
        double avg;
        LinkedList list = new LinkedList (arr);
        
        System.out.println("Starting List: " + list.toString());
        avg = list.average(list);
        list = list.delete(avg);
        System.out.println("Ending List: " + list.toString());

	}
	
	public LinkedList(double data[])
	{
		head = null;
		for(int i = 0; i < data.length; i++)
		{
			head = new Node(data[i], head);
		}
	}

	public LinkedList delete(double datum)
	{
		if (head == null)
		{
			//System.out.println("I'm in the first if");
			return this;
		}
		
		if (head.data > datum)
		{
			//System.out.println("I entered the second if");
			head = head.next;
			
		}
		
		//System.out.println("I exited the loop");
		Node p, q;
		p = head.next;
		q = head;
		for (p = head.next, q = head; p != null; p = p.next, q = q.next)
		{
			//System.out.println("Now im back in the loop");
			if (p.data > datum)
			{
				//System.out.println("Now im in the if loop");
				q.next = p.next;
				
			}
		}
		//System.out.println("About to do final return");
		return this;
	}
	
	public double average(LinkedList list)
	{
		if (head == null)
		{
			return -1;
		}
		
		Node q;
		double count = 0;
		double sum = 0;
		
		for (q = head; q != null; q = q.next)
		{
			sum += q.data;
			count++;
		}
		double average = sum / count;
		System.out.printf("Average: %.2f \n", average);
		return average;
		
	}
	
	public String toString()
	{
		String str = "";
		for (Node p = head; p != null; p = p.next)
		{
			str += p.toString();
		}
		return str;
	}
}
