package isEvenNumber;

public class Main {

	public static void main(String[] args) {
		
		isEvenNumber(3);
		isEvenNumber(2);
	}
	
		public static boolean isEvenNumber(int number) {
		
		if (number %2 > 0) {
			System.out.println("Not even" +number);
		
			return false;
			
		}else
			System.out.println("Even" +number);
			return true;
		
		
	

}
}