package july_11;

public class ExceptionOnConcept {
public static void main(String[] args) {
	//excepyion  -- kuch kiya jaa sakta hai unko solve 
	//error
	// those exceptions jo likhte time pata chal jaaye (compile time exception)
	//aur jo run karne ke baad aati hai unhe runtime exception.
	int a=45;
	int b= 0;
	try {int data=a/b;}
	catch(ArithmeticException e)
	{System.out.println();}
	int data=a/b;

	System.out.println(data);
}
}
