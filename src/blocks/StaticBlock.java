package blocks;

public class StaticBlock {

	// static block
	static {
		System.out.println("in static block");
	}

	// Instance Block
	{
		System.out.println("Instance Block");
	}

	public void message() {
		System.out.println("Hi");
	}

	public StaticBlock(int i) {
		System.out.println("in constructor=" + i);
	}

	public static void main(String[] args) {
		StaticBlock obj1=new  StaticBlock(1);
		obj1.message();
		System.out.println("**********************");
		StaticBlock obj2=new StaticBlock(2);
		obj2.message();
		System.out.println("**********************");
		StaticBlock obj3=new StaticBlock(3);
		obj3.message();
		System.out.println("**********************");
		StaticBlock obj4=new StaticBlock(4);
		obj4.message();
	}

}
