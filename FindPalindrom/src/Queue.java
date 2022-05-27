
public class Queue {
	Node front;
	Node rear;
	int counter;
	int size;
	public Queue(int size) {
		this.size = size;
		front=null;
		rear=null;
		counter=0;
	}
	
	
	public void enQueue(char ch)
	{
		if(isFull())
		{
			 System.out.println("The Queue is Full!");
		}
		else
		{
			Node element=new Node(ch);
			if(isEmpty())
			{
				front=element;
				rear=element;
			}
			else
			{
				rear.next=element;
				rear=element;
			}
			counter++;
		}
	}
	
	public char deQueue()
	{
		if(isEmpty())
		{
			System.out.println("The queue is Empty!");
			return '+';
		}
		else
		{
			char ch=front.ch;
			front=front.next;
			counter--;
			return ch;
		}
	}
	
	public boolean isEmpty()
	{
		return counter==0;
	}
	
	public boolean isFull()
	{
		return counter==size;
	}
}
