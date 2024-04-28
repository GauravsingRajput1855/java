package Shopping;

public class Mango extends Fruit {
	public Mango(String name,String colour,double weight,boolean fresh)
	{
		super("mango",colour,weight,fresh);
	}
	public String taste() {
		return "sweet";
	}
	public void juice() {
		System.out.println("juice made with "+getname()+"colour is "+getcolour()+"weight is "+getweight());
	}

}
