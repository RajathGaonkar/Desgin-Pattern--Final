public class Picture extends TShirtdecorator
{
	public Picture(TShirt decoratedTShirt)
	{
		super(decoratedTShirt);
	}
	
	@Override
	public void makeTShirt() {
		decoratedTShirt.makeTShirt();
		setPicture(decoratedTShirt);
	}
	
	private void setPicture(TShirt decoratedTShirt){
		System.out.println("Cost for adding a picture is Rs.50");
		System.out.println("Picture has been added");
	}
	
	public double getCost() {
		 return 50;
		
	}
	
}		
		
