package teste1;

public class TesteClasseAbstrata 
{
	public static void main(String[] args) 
	{
		//Veiculo veiculo = new Veiculo("Veiculo"); NÃO É POSSÍVEL INSTANCIAR UMA CLASSE ABSTRATA
		
		Carro carro = new Carro("Carro X");
		Moto moto = new Moto("Moto Y");

		carro.acelerar();
		carro.parar();

		moto.acelerar();
		moto.parar();
	}
}
	
