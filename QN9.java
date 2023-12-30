package workshop03;

public class QN9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arr[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o'};
		int count = 0;
		for (char ch:arr) {
			if(ch=='a' ||ch== 'e' || ch=='i' ||ch== 'o' || ch=='u') {
				count++;	
			}
		}
		System.out.println(count);
		
	}

}
