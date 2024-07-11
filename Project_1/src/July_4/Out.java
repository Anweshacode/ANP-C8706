package July_4;

public class Out {
public static void main(String[] args) {
	Employee E=new FullTimeEmployee();
	System.out.println(E.calculateSalary(1000));
	
	Employee k=new PartTimeEmployee();
	System.out.println(k.calculateSalary(56));
}
}
