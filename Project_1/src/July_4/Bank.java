package July_4;

public abstract class Bank {
// you cant create object of this class
	public abstract void saveCustomer() ; //functionality
	public void showLogo() {
		System.out.println("this is bank logo");
	}
	static void acInAtm() {
		System.out.println("all ac are installed");
	}
	public Bank() {
		this(100);
		System.out.println("yes bank constructor is being called");
	}
	private Bank(int speed) {
		System.out.println("speed of bank is"+ speed);
	}
}










//kya abstract mai constructor hota hai jabki uska object banata nahi hai  

	// yes it do have constructor bcz there would be a child which will extends this asbterct
	//class jese ki (ChildOfBank)  so when you will create a construtor of child class or you will create obj of 
	// child class at that time by default super() key word would be their and it means it is calling
	// parent class constructor so there a cons. must be there in parent classs in this it 
    //proved yes abstract have consrtuctor 
	