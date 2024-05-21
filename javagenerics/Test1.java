package javagenerics;

class GenericClass<T>{
	private T data;

	public GenericClass(T data) {
		super();
		this.data = data;
	}
	
	public T getData(){
		return this.data;
	}
}
public class Test1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericClass<Integer> intObj = new GenericClass<>(50);
		System.out.println(intObj.getData());
		
		GenericClass<String> stringObj = new GenericClass<>("welcome to Java");
		System.out.println(stringObj.getData());
	}

}
