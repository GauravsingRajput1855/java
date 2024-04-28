package Shopping;

public class Fruit {
	private String name;
	private String colour;
	private double weight;
	private boolean fresh;
	
	public Fruit(String name,String colour,double weight ,boolean fresh) {
		this.name=name;
		this.colour=colour;
		this.weight=weight;
		this.fresh=fresh;
	}
	
	public String getname() {
		return name;
	}
	
	public void setname(String name) {
		this.name=name;
	}
	
	public String getcolour() {
		return colour;
	}
	
	public void setcolour(String colour) {
		this.colour=colour;
	}
	
	public double getweight() {
		return weight;
	}
	
	public void setweight(double weight) {
		this.weight=weight;
	}
	
	public boolean getfresh() {
		return fresh;
	}
	public void setfrest(boolean fresh) {
		this.fresh=fresh;
	}
	public String taste()
	{
		return "there is no taste";
	}
	public String toString() {
		return "name "+ name+" colour "+colour+" weight "+weight+" is fresh "+fresh;
	}
//	public void showdetails()
//	{
//		System.out.println("name is "+getname());
//		System.out.println("colour is "+getweight());
//		System.out.println("weight is "+getfresh());
//	}

}
