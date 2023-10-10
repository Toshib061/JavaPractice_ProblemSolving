package final_keyword;

public class University {
	final String name = "AUST";
	static final int fees;
	
	static {
		fees = 37000;
	}
	
	void display() {
		System.out.println(name);
		System.out.println(fees);
	}

}
