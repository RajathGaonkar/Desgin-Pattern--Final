public abstract class TShirtdecorator implements TShirt
{
	protected TShirt decoratedTShirt;

	public TShirtdecorator(TShirt decoratedTShirt)
	{
		this.decoratedTShirt=decoratedTShirt;
	}	
	
	public double getCost()
	{
		return decoratedTShirt.getCost();
		
}		
}
