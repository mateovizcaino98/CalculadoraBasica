
public class Calculadora {

	public static void main(String[] args) {
		
	int seleccionador;
	boolean sistemaEncendido = true;
	
	while (sistemaEncendido == true){
		double numero1, numero2, respuesta;
		IO.println("=================");
		IO.println("===Calculadora===");
		IO.println("=================");
		IO.println("1. Suma");
		IO.println("2. Resta");
		IO.println("3. Multiplicación");
		IO.println("4. División");
		IO.println("5. Salir");
		seleccionador = Integer.parseInt(IO.readln("Seleccione su opción: "));
		switch (seleccionador) {
		case 1:
			IO.println("=================");
			IO.println("======Suma=======");
			IO.println("=================");
			numero1 = Double.parseDouble(IO.readln("Ingrese el primer numero: "));
			numero2 = Double.parseDouble(IO.readln("Ingrese el segundo numero: "));
			respuesta = numero1 + numero2;
			IO.println("La respuesta es: " + respuesta);
			break;
			
		case 2:
			IO.println("=================");
			IO.println("======Resta======");
			IO.println("=================");
			numero1 = Double.parseDouble(IO.readln("Ingrese el primer numero: "));
			numero2 = Double.parseDouble(IO.readln("Ingrese el segundo numero: "));
			respuesta = numero1 - numero2;
			IO.println("La respuesta es: " + respuesta);			
			break;
			
		case 3:
			IO.println("=================");
			IO.println("==Multiplicación=");
			IO.println("=================");
			numero1 = Double.parseDouble(IO.readln("Ingrese el primer numero: "));
			numero2 = Double.parseDouble(IO.readln("Ingrese el segundo numero: "));
			respuesta = numero1 * numero2;
			IO.println("La respuesta es: " + respuesta);
			break;
			
		case 4:
			IO.println("=================");
			IO.println("====División=====");
			IO.println("=================");
			numero1 = Double.parseDouble(IO.readln("Ingrese el primer numero: "));
			numero2 = Double.parseDouble(IO.readln("Ingrese el segundo numero: "));
			if (numero2 == 0) {
				IO.println("No es posible dividir para 0");
			} else {
			respuesta = numero1 / numero2;
			IO.println("La respuesta es: " + respuesta);
			}
			break;
			
		case 5:
			IO.println("=================");
			IO.println("==¡Hasta pronto!=");
			IO.println("=================");
			sistemaEncendido = false;
			break;
			
		}
		}
		}
	}


