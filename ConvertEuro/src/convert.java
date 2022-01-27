import java.util.Scanner;
public class convert {

	public static void main(String[] args) {
		double Total  =0.0;
		double StartAmount;
		double EndAmount ;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Start Amount Dollars: ");
		
		 StartAmount = scan.nextDouble();
		 
		System.out.println("Enter Euro Amount: " );
		
		EndAmount = scan.nextDouble();
		
       calc( Total,  StartAmount,  EndAmount);
	}
       public static double calc(double Total, double StartAmount, double EndAmount) {
    	   
    	double   Total1 =  StartAmount / EndAmount;
    	System.out.println("The Rate is "  +Total1);
    	return Total1;
    	   
       }
       
       
}
