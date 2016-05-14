import java.util.*;
class User
{
	public static void main(String[] args)
	{
	   int input1,input2,input3;
	   int i,j,k; 
	   
	   Scanner in=new Scanner(System.in);
	   TShirtfactory t=new TShirtfactory();
	   
	   TShirt tshirt1=t.getTShirt("VT-SHIRT");
	   TShirt tshirt3 = new Picture(new VTShirt());
	   TShirt tshirt4 = new Background(new VTShirt());
	   TShirt tshirt5 = new Text(new VTShirt());
	   
	   TShirt tshirt2 = t.getTShirt("COLLART-SHIRT");
	   TShirt tshirt6 = new Picture(new CollarTShirt());
	   TShirt tshirt7 = new Background(new CollarTShirt());
	   TShirt tshirt8 = new Text(new CollarTShirt());
	  	double cos=0;
	  	 double cost=0;
	 do{
	   System.out.println("Which kind of T-SHirt do you want\n");
	   System.out.println("For V T-shirt press 1\n");
	   System.out.println("For Collar T-Shirt press 2\n");
	   System.out.println("Press any other key to exit\n");
	   input1=in.nextInt();
	  
	   double cost1=0;
	   
	   double cost2=0;
	   
	   if(input1==1)
	   {
	   		   
	   		 tshirt1.makeTShirt();
	   		 cost= tshirt1.getCost();
	   		 do{

	   		 System.out.println("Do you wish to customize your T-Shirt?\n");
	   		 System.out.println("For adding a picture press 1\n");
	   		 System.out.println("For adding a background color press 2\n");
	   		 System.out.println("For printing a text press 3\n");
	   		 System.out.println("Press any other key if you do not want customize\n");
	   		 input2=in.nextInt();
	   		
	   		 if(input2==1)
	   		 {
	   		 	tshirt3.makeTShirt();
	   		 	cost1=tshirt3.getCost();
	   		 }
	   		 else if(input2==2)
	   		 {
	   		 	tshirt4.makeTShirt();
	   		 	cost1=tshirt4.getCost();
	   		 }
	   		 else if(input2==3)
	   		 {
	   		 	tshirt5.makeTShirt();
	   		 	cost1=tshirt5.getCost();
	   		 }
	   		 else
	   		 {
	   		 	System.out.println("Asking once again\n");
	   		 }			
	   		 cost+=cost1;
	   		 System.out.println("If you want to do further customize, then press 1\n");
	   		
	   		 i=in.nextInt();
	   		 }while(i==1);
	   }	 
	   else if(input1==2)
	   {
	   		tshirt2.makeTShirt();
	  		cos=tshirt2.getCost();
	  		do
	  		{
	  	     System.out.println("Do you wish to customize your T-Shirt\n?");
	   		 System.out.println("For adding a picture press 1\n");
	   		 System.out.println("For adding a background color press 2\n");
	   		 System.out.println("For printing a text press 3\n");
	   		 System.out.println("Press any other key if you do not want customize\n");
	   		 input2=in.nextInt();
	   		 if(input2==1)
	   		 {
	   		 	tshirt6.makeTShirt();
	   		 	cost2=tshirt6.getCost();
	   		 }
	   		 else if(input2==2)
	   		 {
	   		 	tshirt7.makeTShirt();
	   		 	cost2=tshirt7.getCost();
	   		 }
	   		 else if(input2==3)
	   		 {
	   		 	tshirt8.makeTShirt();
	   		 	cost2=tshirt8.getCost();
	   		 }
	   		 else
	   		 {
				System.out.println("Asking once again\n");
	   		 }	
	   		 cos=cos+cost2;
	   		  System.out.println("If you want to do further customize, then press 1\n");
	   		 j=in.nextInt();
	   		 }while(j==1);		
	   }
	   else
	   {
	   		System.out.println("Asking once again\n");
	   	}
	  System.out.println("If you wish to buy more T-Shirt then press 1\n");
	  k=in.nextInt();
	  }while(k==1);
	  double c=cos+cost;
	  System.out.println("Thanks for buying the T-Shirt\n");
	  System.out.println("Final prize is Rs."+c);
	}   		
}
