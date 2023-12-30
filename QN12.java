package workshop03;

public class QN12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] stringArray = {"Hello", " ", "World", "!", " ", "Welcome", " ", "to", " ", "Java"};
		StringBuilder concatenatedString = new StringBuilder();
		for (String str : stringArray) {
		     concatenatedString.append(str); 
		  }

		System.out.println("Concatenated String: " + concatenatedString.toString());
		    }

	}
