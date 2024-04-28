package Shopping;

public class Apple extends Fruit {
	public Apple(String name,String colour,double weight,boolean fresh) {
		super("apple",colour,weight,fresh);
	}
	public String taste() {
		return "sweet";
	}
	public void pulp()
	{
		System.out.println("pulp made with the "+getname()+"colour is "+getcolour()+"weight is "+getweight());
	}

}
