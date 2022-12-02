package nestedloop;

public class Demo extends Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  new Example() {
		  
		  @Override void showExample() { // TODO Auto-generated method stub
		  System.out.println("Hello");
		  
		  } }.showExample();
		 

//		Example ex=new Demo();

//		ex.showExample();
	}

//	@Override
//	void showExample() {
//		// TODO Auto-generated method stub
//		System.out.println("Hello");
//	}

}
