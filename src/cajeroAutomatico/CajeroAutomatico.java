package cajeroAutomatico;
import java.util.Scanner;





public class CajeroAutomatico {

	public static void main(String[] args) {
		
		UsuarioCajeroAutomatico vectorDePersonas[] = new UsuarioCajeroAutomatico[1];

		Scanner teclado = new Scanner(System.in);
		String entrarAlMenu="";
		boolean salirDelMenu = false;
		boolean validarDatos = false;
		
		
		System.out.println("--------------------------------------------\n");
		System.out.println("Bienvenido al Simulador de Cajero Automatico\n");
		System.out.println("Crear 5 usuarios con nombre, apellido y saldo en cuenta:\n");
		System.out.println("--------------------------------------------");
		
		//ACA COMIENZA EL ALTA DE LOS USUARIOS
		//HERE BEGINS THE REGISTRATION OF THE USERS
		
		for (int i = 0; i < vectorDePersonas.length; i++) {
			
			System.out.println("*Ingrese el nombre de la persona:" + i);
			
			String nombreTemporal = teclado.next();
			
			System.out.println("*Ingrese el apellido de la persona:" + i);
			
			String apellidoTemporal = teclado.next();
			
			System.out.println("*Ingrese el saldo de la persona:" + i);
			
			double saldoTemporal = teclado.nextInt();
			
			//EN LA LINEA 42 SE CREAN LOS USUARIOS INVOCANDO AL CONSTRUCTOR QUE TOMA 3 PARAMETROS
			//LINE 42 USERS ARE CREATED USING THE CONSTRUCTOR THAT TAKES THREE PARAMETERS
			
			vectorDePersonas[i]=new UsuarioCajeroAutomatico(nombreTemporal, apellidoTemporal, saldoTemporal);
			
			}
		
		do {
			System.out.println("--------------------------------------------\n");
			System.out.println("Seleccione la opcion del menu:\n");
			
			System.out.println("a) DEPOSITAR");
			
			System.out.println("b) EXTRAER");
			
			System.out.println("c) CONSULTAR");
			
			System.out.println("d) SALIR");
			
			System.out.println("--------------------------------------------\n");
			
			entrarAlMenu = teclado.next();
			
			
			switch(entrarAlMenu) {
			
			case "a":
				break;
			case "b":
				break;
			case "c":
				break;
			case "d":
				break;
			default:
				
			
			}
		}
		while(salirDelMenu = false);
		
		
	}

}
