package javafeatures;

@FunctionalInterface
interface Square{
	int calculate(int x);
}
public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		Square s = (int x) -> x *x;
		int res = s.calculate(a);
		System.out.println(res);
	}

}
