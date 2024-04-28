package Shopping;

public class Orange extends Fruit{
	public Orange(String name,String colour,double weight,boolean fresh) {
		super("orange",colour,weight,fresh);
	}
	public String taste() {
		return "sweet and sour";
	}
	public void jusice() {
		System.out.println("juisce made with"+getname()+"colouris "+getcolour()+"weight is "+getweight());
	}

}
