package abstractconcept;

public class Test {
	
	public static void main(String[] args) {

		Browser browser;
				
		String browserName="chrome";
		
		if (browserName=="chrome") {
			browser= new ChromeBrowser();
			browser.openBrowser();
			
		} else {
			browser= new Edgebrowser();
			browser.openBrowser();
		}
		
		browser.search("google");
	}

}
