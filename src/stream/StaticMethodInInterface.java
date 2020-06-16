package stream;

interface method{
	public static void test() {
		System.out.println("interface static method");
	}
}
public class StaticMethodInInterface implements method {
	public static void main(String ...strings ) {
		method.test();
	}

}
