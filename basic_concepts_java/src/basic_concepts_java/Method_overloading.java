package basic_concepts_java;

public class Method_overloading {

	public static void main(String[] args) {
		
		    // Standard main method, serves as the entry point
		    
		        System.out.println("Standard main method");
		        for (String arg : args) {
		            System.out.println("Argument: " + arg);
		        }
		    }

		    // Overloaded main method with different parameters
		    public static void main(int x) {
		        System.out.println("Overloaded main method with int parameter: " + x);
		    }

		    // Another overloaded main method
		    public static void main(String arg) {
		        System.out.println("Overloaded main method with String parameter: " + arg);
		    }
		


	}


