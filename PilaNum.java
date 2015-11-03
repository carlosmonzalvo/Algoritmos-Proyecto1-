class PilaNum{
	//ATRIBUTOS
	private int []pila;
	private int tope;

	//CONTRUCTORES

	public PilaNum(int max){ 
	// en el constructor dimensionamos el arreglo pila
		pila = new int[max];
		tope = -1;
	}

	//METODOS
	public boolean validaEspacio(){
		if (tope + 1 < pila.length)
			return true;
		
		else
			return false;
	}

	public void push(int dato){
		tope++;
		pila[tope] = dato;
	}

	public boolean validaVacio(){
		if (tope == -1)
			return true;
		else
			return false;
	}

	public int pop(){
		tope--;
		return pila[tope+1];
	}

	public void listar(){
		int i;
		for(i=tope; i>=0; i--)
			System.out.println(pila[i]);
	}
	
	public int valorTope(){
		return (pila[tope]);
	}
	public int tope(){
		return tope;
	}

}