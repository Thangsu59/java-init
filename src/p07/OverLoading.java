package p07;

public class OverLoading {

	public void test() {
		System.out.println("test() 호출");
		
	}
	public void test(byte b) {
		System.out.println("test(byte b) 호출");
	}
	public void test(short sh) {
		System.out.println("test(short sh) 호출");
	}
	
	public void test(int num) {
		System.out.println("test(int num) 호출");
	}
	public void test(long l) {
		System.out.println("test(long l) 호출");
	}
	public void test(String str) {
		System.out.println("test(String str) 호출");
	}
	public void test(char ch) {
		System.out.println("test(char ch) 호출");
	}
	public void test(float ft) {
		System.out.println("test(float ft) 호출");
	}
	public void test(double db) {
		System.out.println("test(double db) 호출");
	}
	public void test(boolean boo) {
		System.out.println("test(boolean boo) 호출");
	}

	public static void main(String[] args) {
		OverLoading o1=new OverLoading();
		o1.test("2");
		o1.test(1);
		o1.test(2.2);
		o1.test("c");
		o1.test('c');
		o1.test(true);
		o1.test(1.1F);
		o1.test((short)1);
		o1.test((long)1);

	}

}
