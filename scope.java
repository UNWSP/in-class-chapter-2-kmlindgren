
public class scope {

	static final int CONSTANT = 7;
	static int statvar = 8;
	public int pubvar = 9;
	
	public static void main(String[] args) {
		System.out.println("The constant variable is " + CONSTANT);
		System.out.println("The static variable is " + statvar);
		statvar = 100;
		System.out.println("The static variable is " + statvar);
		{
			int pubvar = 120;
			System.out.println("The public variable is " + pubvar);
		}
	}

}
