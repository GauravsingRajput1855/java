package Shopping;

public class utality {
	public static void displayname(Fruit[]Basket,int count) 
	{
		for(int i=0;i<count;i++)
		{
			System.out.println("name ="+Basket[i].getname());
		}
		
	}
	public static void displaydetails(Fruit[]Basket,int count) 
	{
		for(int i=0;i<count;i++)
		{
			System.out.println(Basket[i].toString());
		}
	}

}
