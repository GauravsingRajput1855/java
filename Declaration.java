package SortingTech;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Declaration {
	private String name;
	private String email;
	public static SimpleDateFormat sdf;
	static {
		sdf=new SimpleDateFormat("dd-mm-yyyy");
	}
	
	//--------------------------------------------------------------------------------
	public Declaration(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	
	//----------------------------------------------------------------------------------
	
	public Declaration(String string, String string2, SimpleDateFormat date) {
		this.name=string;
		this.email=string2;
		this.sdf=date;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	//--------------------------------------------------------------------------------------
	
	
	
	
	

}
