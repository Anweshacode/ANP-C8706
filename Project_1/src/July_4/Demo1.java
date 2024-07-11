package July_4;

public class Demo1 {
	public double deposit(double amount) {
		return amount;	
		}
		
		public double deposit(double amount,double intrest) {
			System.out.println("Deposit:" + amount);
			return amount * (intrest/ 100);	
		}
		
		public static void main(String[] args) {
			Demo1 b =new Demo1();
			
			System.out.println("Fixed Deposit:" + b.deposit(1000));
			System.out.println("Depositing amount with intrest:" + b.deposit(4000,8));
		}
}
