package Shopping;
import java.util.*;
public class Bynow {
	public static void main(String[]args) {
		System.out.println("Welcome To the bynow store");
		System.out.println("Ebter the size of the basket");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		Fruit Basket[]=new Fruit[size];
		int itemcount=0;
		int ch;
		do {
			System.out.println("please enter your choice ");
			System.out.println("press 1 - to add mango");
			System.out.println("press 2 - to add orange");
			System.out.println("press 3 - to add apple");
			System.out.println("press 4 - for display details ");
			System.out.println("press 5 - special method");
			System.out.println("press 6 - exiting.....");
			
			ch=sc.nextInt();
			switch(ch) {
			case 1:
			{
				if(itemcount<size) 
				{
//					System.out.println("enter the name of fruit ");
//					String name=sc.nextLine();
					System.out.println("enter the colour of fruit");
					String colour= sc.nextLine();
					System.out.println("enter weight of fruit");
					double weight=sc.nextDouble();
					System.out.println("tell me fruit is fresh or not");
					Boolean fresh= sc.nextBoolean();
					if(fresh) 
					{
						Apple a=new Apple("apple", colour, weight, fresh);
						Basket[itemcount]=a;
						itemcount++;	
					}
					else
					{
						System.out.println(" full ho gaya bhai basket kitta bharanga ");
					}
					
				}
				break ;
			}
				
			
			case 2:
			{
				if(itemcount<size)
				{
//					System.out.println("enter the name of fruit ");
//					String name=sc.nextLine();
					System.out.println("enter the colour of fruit");
					String colour= sc.nextLine();
					System.out.println("enter weight of fruit");
					double weight=sc.nextDouble();
					System.out.println("tell me fruit is fresh or not");
					Boolean fresh= sc.nextBoolean();
					if(fresh) 
					{
						Orange o=new Orange("orange", colour, weight, fresh);
						Basket[itemcount]=o;
						itemcount++;
						
					}
					else
					{
						System.out.println("full ho gaya bhai basket kitta bharanga ");
					}
					
				}
				break;
			}
			
			case 3:
			{
				if(itemcount<size)
				{
//					System.out.println("enter the name of fruit ");
//					String name=sc.nextLine();
					System.out.println("enter the colour of fruit");
					String colour= sc.nextLine();
					System.out.println("enter weight of fruit");
					double weight=sc.nextDouble();
					System.out.println("tell me fruit is fresh or not");
					Boolean fresh= sc.nextBoolean();
					if(fresh) 
					{
						Mango m=new Mango("mango", colour, weight, fresh);
						Basket[itemcount]=m;
						itemcount++;
						
					}
					else
					{
						System.out.println("full ho gaya bhai basket kitta bharanga ");
					}
					
				}
				break;
			}
			case 4:
			{
				System.out.println(" dekh le bhai ky lia tune ");
				utality.displayname(Basket, itemcount);
				utality.displaydetails(Basket, itemcount);
				
			}
			break;
			
			case 5:
			{
				boolean flag=false;
				while(!flag) 
				{
					System.out.println("\n Choose your choice 1.juice");
					System.out.println("2 juice");
					System.out.println("3 pulp");
					int ch2 =sc.nextInt();
					int count = 0;
					switch(ch2)
					{
					case 1:
					{
						for(int a = 0;a< count;a++) 
						{
							if (Basket[a]instanceof Mango)
							{
								Mango m=(Mango) Basket[a];
								m.juice();
							}
							
						}
					}
					break;
					case 2:
						{
							for(int a=0;a<count;a++)
							{
								if(Basket[a]instanceof Orange)
								{
									Orange o=(Orange) Basket[a];
									o.jusice();
								}
							}
						
						}
						break;
					case 3:
						{
							for(int a=0;a<count;a++)
							{
								if(Basket[a]instanceof Apple)
								{
									Apple ap=(Apple) Basket[a];
									ap.pulp();
									
								}
							}
						
						}
						break;
					case 4:
					{
						flag=true;
						break;
					}
					case 6:
					{
						System.out.println("khatam tata by by ");
					}
						
						
					
			}
					
		}
				
	}
			
				
			
}
	}while(ch!=6);
	
  }
}