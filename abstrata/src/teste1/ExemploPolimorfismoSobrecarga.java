package teste1;

public class ExemploPolimorfismoSobrecarga 
{
	public static int soma(int a, int b)
	{
		return a+b;
	}
	
	public static double soma(double a, double b)
	{
		return a+b;
	}
	
	public static void main (String args)
	{
		int resultadoInt = soma(5,6);
		double resultadoDou = soma(4.3,2.1);
		
		System.out.println(resultadoInt);
		System.out.println(resultadoDou);
	}
}
