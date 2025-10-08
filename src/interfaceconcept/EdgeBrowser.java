package interfaceconcept;

public class EdgeBrowser implements Browser{

	@Override
	public void open() {
		System.out.println("Open Edge Brawser");
	}

	@Override
	public void search(String search) {
		System.out.println("Seareching "+search+" in edge brawser");
	}

}
