package interfaceconcept;

public class ChromeBrowser implements Browser{

	@Override
	public void open() {
		System.out.println("Open Chrome Brawser");
	}

	@Override
	public void search(String search) {
		System.out.println("Seareching "+search+" in chrome brawser");
	}
}
