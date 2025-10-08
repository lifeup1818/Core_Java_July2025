package abstractconcept;

public class StartsBikes {
	
	public static void main(String[] args) {		
		//start FZ bike
		Bike fzBike= new FZ();
		fzBike.run();   //  start FZ bike
		int fzBikeSpeed=fzBike.speed(100);
		System.out.println("FZ Speed="+fzBikeSpeed);		
		
		//start Honda bike
		Bike hondaBike= new Honda();
		hondaBike.run();// start Honda bike
		int hondaBikeSpeed=hondaBike.speed(120);
		System.out.println("Honda Speed="+hondaBikeSpeed);
		
		
	}

}
