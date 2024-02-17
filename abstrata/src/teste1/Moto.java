package teste1;

public class Moto extends Veiculo
{
	public Moto(String modelo)
	{
		super(modelo);
	}
	
	@Override
	void acelerar()
	{
		System.out.println(modelo + " acelerou a moto.");
	}
}
