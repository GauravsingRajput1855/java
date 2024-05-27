package dependent;

import dependency.Transport;

public class ATMImpl implements ATM {
	private long cash;//mandatory
	private Transport myTransport;// = new SoapTransport();//optional
//contructor base di 15.6
	public ATMImpl(Transport t123) {
		this.myTransport=t123;
		System.out.println("in cnstr of " + getClass() + " " + myTransport);//not null
	}
//---------------------------------------------
	public ATMImpl(long cash) {
		this.cash=cash;
		System.out.println("in cnstr of " + getClass() + " " + myTransport);
	}

	@Override
	public void deposit(double amt) {
		System.out.println("depositing " + amt);
		byte[] data = ("depositing " + amt).getBytes();
		myTransport.informBank(data);

	}

	@Override
	public void withdraw(double amt) {
		System.out.println("withdrawing " + amt);
		byte[] data = ("withdrawing " + amt).getBytes();
		myTransport.informBank(data);
	}
	// setter based D.I
	//--------------------------------------------------------
//
//	public void setMyTransport(Transport myTransport) {
//		this.myTransport = myTransport;
//		System.out.println("in setter - " + myTransport);		
//	} 
//****************************************************************
	// custom init method
	public void anyInit() {
		System.out.println("in init " + myTransport);
	}

	// custom destroy method
	public void anyDestroy() {
		System.out.println("in destroy " + myTransport);
	}
	//------------------------------------------------------------

//	
//	public void setMyTransport(Transport myTransport) {
//		this.myTransport = myTransport;
//	}
//---------------------------------------------------------
	//factory method least recommended 
//	public static ATMImpl myFactoryMethod(Transport t12){
//		System.out.println("in factory method ");
//		return new ATMImpl(t12);
//		
//	}
	
	

	

}
