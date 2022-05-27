
public class StackStructure {

	Node top;
	int size;
	int counter;
	public StackStructure(int size) {
		counter=0;
		this.size = size;
		top=null;
	}
	
	public void push(char ch)
	{
		if(isFull())
		{
			System.out.println("The Stack is Full!");
		}
		else
		{
			Node element=new Node(ch);
			if(isEmpty())
			{
				top=element;
			}
			else
			{
				element.next=top;
				top=element;
			}
			counter++;
			
		}
	}
	
	public char pop()
	{
		if(isEmpty())
		{
			System.out.println("The Stack is Empty!");
			return '-';
		}
		else
		{
			char ch=top.ch;
			top=top.next;
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
