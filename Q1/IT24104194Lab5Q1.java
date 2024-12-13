import java.util.Scanner;
public class IT24104194Lab5Q1{
	public static void main(String[] args){

		
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the first number :");
		int num1=input.nextInt();
		System.out.print("Enter the second number :");
		int num2=input.nextInt();
		System.out.print("Enter the third number :");
		int num3=input.nextInt();
	//print numbers
		System.out.println("User entered numbers"+num1+" "+num2+" "+num3);

	//find smallest number
		int smallNum=num1;
		if(smallNum>num2){
		  smallNum=num2;
		}
		if(smallNum>num3){
		  smallNum=num3;
		}
		System.out.println("The smallest number is : "+smallNum);
	//find largest number
		int largeNum=num1;
		if(largeNum<num2){
		 largeNum=num2;
		}
		if(largeNum<num3){
		  largeNum=num3;
		}
		System.out.println("The largest number is : "+largeNum);
	}

}