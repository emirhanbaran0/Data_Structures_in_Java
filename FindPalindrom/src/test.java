import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		//Polindrom Word: The words which from the beginning and end reading is same.
		//example: RACECAR
		String word; 
		int lenght;
		Scanner scan=new Scanner(System.in);
		Queue queue=new Queue(150);
		StackStructure stack=new StackStructure(150);
		System.out.println("Enter the Word: ");
		word=scan.nextLine();
		lenght=word.length();
		
		char[] letters=word.toCharArray();
		
		for(int i=0;i<lenght;i++)
		{
			stack.push(letters[i]);
			queue.enQueue(letters[i]);
		}
		boolean result=true;
		while(!stack.isEmpty())
		{
			if(stack.pop()!=queue.deQueue())
			{
				result=false;
				break;
			}
				
		}
		if(result==true)
		{
			System.out.println("The word "+word+" is a Polindrom word!!");
		}
		else
		{
			System.out.println("The word "+word+" is not a Polindrom word.");
		}
	}

}
