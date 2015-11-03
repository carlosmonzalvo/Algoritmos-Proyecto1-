class Cerebro {
  //Atributos
  int max = 50;
  PilaNum numero = new PilaNum(max);
  PilaOper operador = new PilaOper(max);
  String res, data;
  char a = '+', b = '-', c = '*', d = '/', e = '(', f = ')', g = 'ˆ';

  //Contructor
  Cerebro(String dato){
    data = dato;
  }

  /*
  |4|  |+|      a ◊ b    6 - 2 + 4 = 8                          4 6 2
  |2|  |-|               4 + (6 - 2) = 8                        +(- 
  |6|                    <----------
  */
  //Metodos
  int operar(){
    int b = numero.pop();
    String oP;
    if (operador.tope() > 0){ // Checar si hay operaciones pendientes.
      oP = Character.toString(operador.pop());
      if(oP == "("){
        return b;                                                     //)3+(2+2)+5-2
      } else if (oP == ")") {                                         //  3
        oP = Character.toString(operador.pop());                      // +
      }                                                               //b = 2
    } else {                                                          //return =
      return b;                                                       //oP = 
    }                                                                 //cola = ((5 + (2 + (2 + 2))) - 2) 
      switch (oP) {
        case "+":
          return b + operar(); //1  4 + 4 = 8 
        case "-":                               
          return operar() - b; //2  6 - 2 = 4       
        case "*":
          return b * operar();
        case "/":
          return operar() / b;
        default:
          return 0;
          
      } 
  }
  void configur(){
    String aux = "";
    for (int i = 0; i< data.length(); i++) {  //ciclos de comparacion para ver si es un   
      if (esUnOp(data.charAt(i)) == false) {  //numero o caracter y asi seapararlo en 2 pilas
        aux = (aux + data.charAt(i));
      } else{
        if (aux != ""){
          numero.push(Integer.parseInt(aux));
          aux = "";
        }
      }
    }
    if (aux != ""){ //Condicional por si queda algun valor en la variable aux este lo vacia y lo inserta en la pila 
      numero.push(Integer.parseInt(aux));
    }
  }

  boolean esUnOp(char sOp){ // me mandaba error porque segun el compilador los signos son String no Char
    if (sOp == a || sOp == b || sOp == c || sOp == d || sOp == e || sOp == f || sOp == g) {   //Metodo para comparar los operandos
        operador.push(sOp);
      return true;
    } else {
      return false;
    }
  }
}
