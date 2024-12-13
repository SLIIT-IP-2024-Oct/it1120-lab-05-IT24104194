import java.util.Scanner;

public class IT24104194Lab5Q3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	System.out.print("Enter Start Date(1-31) :");
	int startDate=input.nextInt();

	if(startDate>=0&&startDate<=31){
	     System.out.print("Enter End Date(1-31) :");
	     int endDate=input.nextInt();
		if(endDate>=0&&endDate<=31){
			if(endDate>startDate){
			int noDay=endDate-startDate;
			final double roomCharge=480000;
			double discount=0;
			
			if(noDay>=3){
			 discount=10;
			}else if(noDay>=5){
			 discount=20;
			}
			double finalAmount=(noDay*roomCharge)-(noDay*roomCharge*(discount/100));
			
			System.out.println("Room charge per day : "+roomCharge);
			System.out.println("No of Days reserved : "+noDay);
			System.out.println("Total amount tobe paid : "+finalAmount);
			}else{
			System.out.println("Start Date is lower than End Date");
			}
		}else{
		System.out.println("End date is 0-31");
		}
	}else{
	System.out.println("Start date is 0-31");
	}


     
    }
}