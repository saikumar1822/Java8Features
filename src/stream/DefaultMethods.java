package stream;
interface Interface{
	public void m1();
	public void m2();
	default void m3() {
	}
}
class test implements Interface{
	
	public void m3() {
		System.out.println("defaclt method");
	}

	@Override
	public void m1() {
		
	}
	@Override
	public void m2() {
		
	}
	
}
class test1 implements Interface{

	@Override
	public void m1() {
		
	}
	@Override
	public void m2() {
		
	}
	
}
class test2 implements Interface{

	@Override
	public void m1() {
		
	}
	@Override
	public void m2() {
		
	}
	
}
public class DefaultMethods {
	public static void main(String ... args) {
		test test1=new test();
		test1.m3();
	}

}
