package exceptionhandling;

public class HandleExceptionusingThrows {

	public static void main(String[] args) throws ClassNotFoundException {		
		HandleExceptionusingThrows obj= new HandleExceptionusingThrows();
		obj.test();
	}

	public void test() throws ClassNotFoundException{
		Class.forName("");
	}

}
