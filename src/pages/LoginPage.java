package pages;

public class LoginPage {
	
	public void enterUserName() {
		System.out.println("in public method");		
	}
	
	protected void enterPassword() {
		System.out.println("in protected method");
	}
	
	private void tet() {
		System.out.println("in private method");
	}
	
	void display() {
		System.out.println("in default method");
	}

}
