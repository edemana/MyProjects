
public class MyClass {
	
	private int myValue;
	private static int ourValue;

	public MyClass(){
		myValue = 0;
	}

	public MyClass(int value){
		myValue = value;
	}

	public int getMyValue(){
		return myValue;
	}

	public static int getOurValue(){
		return ourValue;
	}

	public void incMyValue(){
		myValue++;
	}

	public static void incOurValue(){
		ourValue++;
	}

	public String toString(){
		return ("Mine: " + myValue + ". Ours: " + ourValue);
	}
}