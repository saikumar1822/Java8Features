package stream;
class sample{
	sample(){
		System.out.println("sample class constructor is executinggg");
	}
}
interface Interf{
	public sample get();
}

public class ConstructorReference {
	public  static void main(String ...strings) {
		Interf i=sample::new ;
		sample s=i.get();
		sample s1=i.get();
	}

}
