class PilaOper{
	//ATRIBUTOS
	private char []pila;
	private int tope;

	//CONTRUCTORES

	public PilaOper(int max){ 
	// en el constructor dimensionamos el arreglo pila
		pila = new char[max];
		tope = -1;
	}

	//METODOS
	public boolean validaEspacio(){
		if (tope + 1 < pila.length)
			return true;
		
		else
			return false;
	}

	public void push(char dato){
		tope++;
		pila[tope] = dato;
	}

	public boolean validaVacio(){
		if (tope == -1)
			return true;
		else
			return false;
	}

	public char pop(){
		tope--;
		return pila[tope+1];
	}

	public void listar(){
		int i;
		for(i=tope; i>=0; i--)
			System.out.println(pila[i]);
	}
	
	public char valorTope(){
		return (pila[tope]);
	}
	public int tope(){
		return tope;
	}
}
