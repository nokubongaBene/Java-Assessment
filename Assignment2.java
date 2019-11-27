import java.io.*;
//Wrapper classes
class Boolean{
	int num1;
	int num2;
	
	public Boolean(){
		num1 =5;
		num2 = 8;
	}
	
	public boolean BooleanRe(){
		if(num1 > num2)
			return true;
		else
			return false;
	}
}
class Integer{
	int number = 34, number2= 44;
	int sum;
	int product;
	
	public Integer(){
		sum = 0;
		product = 0;
	}
	
	public int Sum(){
		sum = number + number2;
		return sum;
	}
	public int Product(){
		product = number * number2;
		return product;
		
	}
}
class Double{
	public double balance;
	public double deposit;
	public double withdraw;
	
	public Double(){
		balance = 1000;
		deposit = 0;
		withdraw = 0;
	}
	public double balance(){
		return balance = 1000;
	}
	public double deposit(double dAmt){
		if(dAmt>0)
			balance +=dAmt;
		return balance;
	}
	public double withdraw(double wAmount){
		if(wAmount > balance)
			System.out.println("The amount to be withdrawn is too large.");
		else
			balance -=wAmount;
		
		return balance;
	}
}
public class Assignment2 {

	public static void main(String[] args) {
		// Primitive variables
		char alph = 'd';
		byte num = 112;
		short num2 = 30810;
		int num3 = 213165;
		long num4 = 700;
		float moola =(float)7844.8;
		double money = 1234158.99;
		boolean inOut = true;
		
		//Casting primitive
		money = num;
		moola = num3;
		num4 =(long)money;
		num3 =(int)moola;
		money= num4;
		moola=(float)money;
		money = num2;
		money = num;
		alph = ' ';
		
		//displaying
		System.out.println("Casting from byte "+ num + " to double "+ money);
		
		System.out.println("Casting from float " + moola + " to integer " + num3);
		
		System.out.println("Casting from long " + num4 + " to double "+money);
		
		System.out.println("Casting from integer " + num3 + " to float " + moola);
		
		System.out.println("Casting from double "+ money + " to long "+ num4);
		
		System.out.println("Casting from float "+ moola +" to double "+ money);
		
		System.out.println("Casting from double " + money + " to short " + num2);
		
		System.out.println("Casting from double "+ money+ " to byte "+ num);
		
		
		//Wrapping classes
		Boolean bool = new Boolean();
		System.out.println(bool.BooleanRe());
		
		Integer numbers = new Integer();
		int sum = numbers.Sum();
		System.out.println("The sum of the two numbers is: "+ sum);
		int product = numbers.Product();
		System.out.println("The product of the two numbers is: "+product);
		
		Double doubleup = new Double();
		 double withdraw = 158.0;
		double deposit = 200.00;
		
		System.out.println("The current balance after depositing is :R"+
		doubleup.deposit(deposit));
		 System.out.println("The current balance after withdrawal is:R"+doubleup.withdraw(withdraw));

	}

}
