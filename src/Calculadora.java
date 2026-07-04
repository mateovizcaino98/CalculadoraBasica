
public class Calculadora {

	public static void main(String[] args) {
		
	int seleccionador = 0;
	boolean sistemaEncendido = true;
	
	while (sistemaEncendido == true){
		double numero1 = 0, numero2 = 0, respuesta;
		boolean opcionValida = false;
		IO.println("=================");
		IO.println("===Calculadora===");
		IO.println("=================");
		IO.println("1. Suma");
		IO.println("2. Resta");
		IO.println("3. Multiplicación");
		IO.println("4. División");
		IO.println("5. Potenciación");
		IO.println("6. Salir");
		while(opcionValida == false) {
		try {
		seleccionador = Integer.parseInt(IO.readln("Seleccione su opción: "));
		opcionValida = true;
		} catch(NumberFormatException error) {
			IO.println("Opción inválida. Escoja una de las opciones del menú");
		}
		}
		switch (seleccionador) {
		case 1:
			IO.println("=================");
			IO.println("======Suma=======");
			IO.println("=================");
			boolean numeroValido = false;
			while (numeroValido == false) {
			try {
			numero1 = Double.parseDouble(IO.readln("Ingrese el PRIMER numero: "));
			numero2 = Double.parseDouble(IO.readln("Ingrese el SEGUNDO numero: "));
			numeroValido = true;
			} catch(NumberFormatException error) {
				IO.println("Opción inválida. Ingrese un número entero o decimal usando el punto (.)");
			}
			}
			respuesta = numero1 + numero2;
			IO.println("La respuesta es: " + respuesta);
			break;
			
		case 2:
			IO.println("=================");
			IO.println("======Resta======");
			IO.println("=================");
			numeroValido = false;
			while (numeroValido == false) {
			try {
			numero1 = Double.parseDouble(IO.readln("Ingrese el PRIMER numero: "));
			numero2 = Double.parseDouble(IO.readln("Ingrese el SEGUNDO numero: "));
			numeroValido = true;
			} catch(NumberFormatException error) {
				IO.println("Opción inválida. Ingrese un número entero o decimal usando el punto (.)");
			}
			}
			respuesta = numero1 - numero2;
			IO.println("La respuesta es: " + respuesta);			
			break;
			
		case 3:
			IO.println("=================");
			IO.println("==Multiplicación=");
			IO.println("=================");
			numeroValido = false;
			while (numeroValido == false) {
			try {
			numero1 = Double.parseDouble(IO.readln("Ingrese el PRIMER numero: "));
			numero2 = Double.parseDouble(IO.readln("Ingrese el SEGUNDO numero: "));
			numeroValido = true;
			} catch(NumberFormatException error) {
				IO.println("Opción inválida. Ingrese un número entero o decimal usando el punto (.)");
			}
			}
			respuesta = numero1 * numero2;
			IO.println("La respuesta es: " + respuesta);
			break;
			
		case 4:
			IO.println("=================");
			IO.println("====División=====");
			IO.println("=================");
			numeroValido = false;
			while (numeroValido == false) {
			try {
			numero1 = Double.parseDouble(IO.readln("Ingrese el PRIMER numero: "));
			numero2 = Double.parseDouble(IO.readln("Ingrese el SEGUNDO numero: "));
			numeroValido = true;
			} catch(NumberFormatException error) {
				IO.println("Opción inválida. Ingrese un número entero o decimal usando el punto (.)");
			}
			}
			if (numero2 == 0) {
				IO.println("No es posible dividir para 0");
			} else {
			respuesta = numero1 / numero2;
			IO.println("La respuesta es: " + respuesta);
			}
			break;
			
		case 5:
			IO.println("=================");
			IO.println("==Potenciación===");
			IO.println("=================");
			numeroValido = false;
			while (numeroValido == false) {
			try {
			numero1 = Double.parseDouble(IO.readln("Ingrese el PRIMER numero: "));
			numero2 = Double.parseDouble(IO.readln("Ingrese el SEGUNDO numero: "));
			numeroValido = true;
			} catch(NumberFormatException error) {
				IO.println("Opción inválida. Ingrese un número entero o decimal usando el punto (.)");
			}
			}
			respuesta = Math.pow(numero1, numero2);
			IO.println("La respuesta es: " + respuesta);			
			break;
			
		case 6:
			IO.println("=================");
			IO.println("==¡Hasta pronto!=");
			IO.println("=================");
			sistemaEncendido = false;
			break;
		
		default:
			IO.println(String.format("Opción inválida. Elegiste %s, escoja una de las opciones del menú.", seleccionador));
		}
		}
		}
	}


