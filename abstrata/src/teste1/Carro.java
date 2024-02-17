package teste1;

public class Carro extends Veiculo
{
	public Carro(String modelo)
	{
		super(modelo);
	}
		
	@Override
	void acelerar()
	{
		System.out.println(modelo + "acelerou o carro.");
	}
			
}
