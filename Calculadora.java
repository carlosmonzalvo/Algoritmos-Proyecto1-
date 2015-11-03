class Calculadora{
	//Metodos
	public static Cerebro calc;
	public static String operacion;

	//Codigo
	public static void main(String[] args) {

		operacion = Teclado.LeeCadena("Dame la operacion a efectuar...");
		calc = new Cerebro(operacion);
		calc.configur();

		//Listar las pilas
		calc.numero.listar();
		calc.operador.listar();
		System.out.println();
		System.out.println(calc.operar());
	}
}