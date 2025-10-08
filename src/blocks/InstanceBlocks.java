package blocks;

public class InstanceBlocks {
		
	//Instance Block
	{	
		System.out.println("Instance Block");
	}
	
	public void message() {
		System.out.println("Hi");
	}
	
	public InstanceBlocks(int i) {
		System.out.println("in constructor="+i);
	}
	
	public static void main(String[] args) {
		
		InstanceBlocks obj1= new InstanceBlocks(1);
		obj1.message();
		InstanceBlocks obj2=new InstanceBlocks(2);
		obj2.message();
		InstanceBlocks obj3=new InstanceBlocks(3);
		obj3.message();
		InstanceBlocks obj4=new InstanceBlocks(4);
		obj4.message();
	}

}
