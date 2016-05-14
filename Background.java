import java.util.*;
public class Background extends TShirtdecorator
{
	public Background(TShirt decoratedTShirt)
	{
		super(decoratedTShirt);
	}
	Scanner in=new Scanner(System.in);
	@Override
	public void makeTShirt() {
		decoratedTShirt.makeTShirt();
		setBackground(decoratedTShirt);
	}
	
	private void setBackground(TShirt decoratedTShirt){
		int input;
		System.out.println("Which color background do you wish");
		System.out.println("Press 1 for red");
		System.out.println("Press 2 for blue");
		System.out.println("Press 3 for black");
		System.out.println("Press 4 for green");
		input=in.nextInt();				
		System.out.println("Background color has been changed ");
		System.out.println("Cost for adding background color is Rs.70");
	}
	
	public double getCost() {
		 return 70;
		
	}
	
}		
		
