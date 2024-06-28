public class MyClassTest {
	public static void main(String[] args) {
		MyClass obj1 = new MyClass(35);
		MyClass obj2 = new MyClass();

		System.out.println("After initilization...");
		System.out.println("obj1 -> " + obj1);
		System.out.println("obj2 -> " + obj2);

		System.out.println("\nEXPERIMENT 1: ");
		for (int i = 0; i < 3; i++) {
			System.out.printf("\nIteration %d...\n", i);
			obj1.incMyValue();
			MyClass.incOurValue();
			System.out.println("obj1 -> " + obj1);

			obj2.incMyValue();
			MyClass.incOurValue();
			System.out.println("obj2 -> " + obj2);
		}
		MyClass.incOurValue();
		System.out.println("After experiment 1, our value is "
				+ MyClass.getOurValue());

		System.out.println("\nEXPERIMENT 2: ");
		for (int i = 0; i < 3; i++) {
			System.out.printf("\nIteration %d...\n", i);
			obj1.incMyValue();
			MyClass.incOurValue();

			obj2.incMyValue();
			MyClass.incOurValue();

			System.out.println("obj1 -> " + obj1);
			System.out.println("obj2 -> " + obj2);
		}
		MyClass.incOurValue();
		System.out.println("After experiment 2, our value is "
				+ MyClass.getOurValue());
	}
}