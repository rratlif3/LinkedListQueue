//Rashaad Ratliff-Brown
public class Driver {
	
	public static void main(String[] args) 
	{		//create a linked list queue
			LinkedListQueue line = new LinkedListQueue();
			
			//create a customer
			Customer c = null;
			
			//create variable needed variables
			int maxLength = 0, 
				qLength = 0,
				chance = 0,
				minute = 60;
			
		
			//create an iterative simulation
			for (int i = 0; i < minute; i++) 
			{	
				//assign a random number [0,3] to variable chance
				chance  = (int) (Math.random() * 4);
				
				//add new customer with 25% chance of attendance
				if ( chance == 2) 
				{	
					//add customer to the queue and print confirmation message
					line.enqueue(new Customer());
					qLength++;
					System.out.println("New customer added! Queue length is now: " + qLength);
					
					//find the maximum line length during the simulation	
					if (qLength > maxLength) 
					{
						maxLength += qLength;
					}
					
					//empty queue
					if(c == null) 
					{
						
						c = line.atFront();
						System.out.println("Selecting a new customer: ");

					}

				}
				
				if(c != null)
				{
					//decrement the service time
					c.decServiceTime();
				
				
				//remove customer if serviceTime = 0
				if (c.getServiceTime() == 0) 
				{
					line.dequeue();
					System.out.println("Customer serviced and removed from the queue. "
							+ "Queue length is now " + qLength);
				}
				
				c = null;
				
				if (qLength > 0)
				{
					c = line.atFront();
					System.out.println("Selecting a new customer: ");
				}
			
				}
				System.out.println("Minute " +  
				i + ": ---------------------------------------------------");
			}

			System.out.println("Total number of customers serviced: " + line.getTotalNumberOfCustomers() 
				+ "\n" + "Maximum line length during the simulation: " + maxLength);
		
		
		
		
		
		
		
		
		
	}
}
