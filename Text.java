import java.util.*;
public class Text extends TShirtdecorator
{
	public Text(TShirt decoratedTShirt)
	{
		super(decoratedTShirt);
	}
	
	Scanner in=new Scanner(System.in);
	@Override
	public void makeTShirt() {
		decoratedTShirt.makeTShirt();
		setText(decoratedTShirt);
	}
	
	private void setText(TShirt decoratedTShirt){
		System.out.println("Enter the text to be added");
		String name=in.next();
		System.out.println("Text has been changed to "+name);
		System.out.println("Price for adding a text is Rs.100");
	}
	
	public double getCost() {
		 return 100;
		
	}
	
}		
		
