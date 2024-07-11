package July_4;

public class ChildOfBank extends Bank {

	@Override
	public void saveCustomer() {
		// TODO Auto-generated method stub
		System.out.println("customer is getting saved");
	}
 public ChildOfBank() {
	 super();
	 System.out.println("Sachin is calling child class constructor");
 }
}
