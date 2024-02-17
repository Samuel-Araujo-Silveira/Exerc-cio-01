package teste1;

public abstract class Veiculo //SEGURANÇA
{
	String modelo;
	
	public Veiculo(String modelo)
	{
		this.modelo= modelo;	
	}
	
	abstract void acelerar();
	
	void parar()
	{
		System.out.println(modelo + "parou.");
	}
}
