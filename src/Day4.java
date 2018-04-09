
public class Day4 {

	
	static int  age;
	
	
	
	public static void main(String... args) {
		
        String result = "";
        if (age < 13) {
            result = "You are young.";
        }
        else if (age >= 13 && age < 18) {
            result = "You are a teenager.";
        }
        else {
                result = "You are old.";
        }
		
	}
	
}
