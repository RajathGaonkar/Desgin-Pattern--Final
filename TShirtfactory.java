public class TShirtfactory
{
	 public TShirt getTShirt(String shirt){
      if(shirt == null)
      {
         return null;
      }		
      if(shirt.equalsIgnoreCase("VT-SHIRT"))
      {
         return new VTShirt();
         
      } 
      else if(shirt.equalsIgnoreCase("COLLART-SHIRT"))
      {
         return new CollarTShirt();
         
      }
      return null;
   }
}
