//Rashaad Ratliff-Brown
public class LinkedListQueue {
	private Customer first, last;
	int TotalNumberOfCustomers = 0;
	
	public LinkedListQueue() 
	{
		first = last = null;
	}
	
	public boolean isEmpty()
	{
		return first == null;
	}

	public void enqueue (Customer c)
	{
		//Add Customer c to the end of the queue
		//if the queue is empty, first should reference the new object
		if(isEmpty())
		{
			first = c;
		} else {
			last.setNext(c);
		}
		
		//end should always reference the new object 
		last = c;
		TotalNumberOfCustomers++;
	}
	
	public Customer dequeue ()
	{
		//remove and return the first Customer in the queue
		if (isEmpty())
		{
			System.out.println("The queue is already empty.");
			return null;
		}
		
		//store a temp reference to the object we want to remove
		Customer temp = first;
		
		//set first to reference the current first object's next reference
		first = first.getNext();
		
		//if the queue is now empty, set the last to null
		if (isEmpty())
		{
			last = null;
		}

		return temp;
	}
	
	public Customer atFront() 
	{
		if (isEmpty()) 
		{
			return null;
		}

		return first;

	}
	
	public int getTotalNumberOfCustomers() 
	{
		return TotalNumberOfCustomers;
	}
}
