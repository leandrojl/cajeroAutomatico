package cajeroAutomatico;
import java.util.Scanner;

public class CajeroAutomatico 

{

	public static void main(String[] args) 
	
	{
		
		UsuarioCajeroAutomatico vectorDePersonas[] = new UsuarioCajeroAutomatico[2];

		Scanner teclado = new Scanner(System.in);
		String entrarAlMenu="";
		boolean salirDelMenu = true;
		boolean salirDelPrograma = true;
		boolean validarDatos = false;
		boolean salirDelMenuSalir = true;
		UsuarioCajeroAutomatico usuarioActivo = null;
		double totalidadDeSaldo = 0.0;
		
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
			
			System.out.println("*Ingrese el dni de la persona:" + i);
			
			int dniTemporal = teclado.nextInt();
			
			System.out.println("*Ingrese el saldo de la persona:" + i);
			
			double saldoTemporal = teclado.nextInt();
			
			//EN LA LINEA 42 SE CREAN LOS USUARIOS INVOCANDO AL CONSTRUCTOR QUE TOMA 3 PARAMETROS
			//LINE 42 USERS ARE CREATED USING THE CONSTRUCTOR THAT TAKES THREE PARAMETERS
			
			vectorDePersonas[i]=new UsuarioCajeroAutomatico(nombreTemporal, apellidoTemporal, dniTemporal, saldoTemporal);
			
			}
		do {
			
		
		do {
			System.out.println("--------------------------------------------\n");
			System.out.println("*Ingrese el dni de la persona para operar:");
			System.out.println("--------------------------------------------\n");
			
			int dniTemporal = teclado.nextInt(); 
				
				for(int i= 0; i < vectorDePersonas.length; i++) 
				{
					if(dniTemporal == vectorDePersonas[i].getDni()) 
						{
						
						usuarioActivo = vectorDePersonas[i]; 
						
						salirDelMenu = false; 
						}	
				}
				
				if(usuarioActivo != null) 
				
				{
					
					if(dniTemporal == usuarioActivo.getDni()) 
					
					{
						System.out.println("BIENVENIDO AL CAJERO AUTOMATICO");
						System.out.println(usuarioActivo.getNombre());
						System.out.println(usuarioActivo.getApellido());
						System.out.println(usuarioActivo.getDni());
						
					}
				
				}
				
				else
					
					{
						System.out.println("DNI NO ENCONTRADO, INGRESE UN DNI CORRECTO");
					}
				
			}while(salirDelMenu == true);
		
		do {
			
			System.out.println("--------------------------------------------\n");
			
			System.out.println("Seleccione la opcion del menu:\n");
			
			System.out.println("a) DEPOSITAR");
			
			System.out.println("b) EXTRAER");
			
			System.out.println("c) CONSULTAR");
			
			System.out.println("d) SALIR");
			
			System.out.println("--------------------------------------------\n");
			
			entrarAlMenu = teclado.next();
			
			
			switch(entrarAlMenu) 
			
			{
			
				case "a":
					
					System.out.println("MONTO A DEPOSITAR:");
					
					double saldoACargar = teclado.nextDouble();
					
					totalidadDeSaldo = usuarioActivo.getSaldo() + saldoACargar;
					
					usuarioActivo.setSaldo(totalidadDeSaldo);
					
					salirDelMenu = true;
					
					break;
					
				case "b":
					
					boolean salirDelWhile = true;
					
					while(salirDelWhile == true) 
						
					{
						System.out.println("MONTO A EXTRAER:");
						
						double saldoARetirar = teclado.nextDouble();
						
						if(saldoARetirar <= usuarioActivo.getSaldo()) 
						
							{
								System.out.println("HA RETIRADO EXITOSAMENTE");
								totalidadDeSaldo = usuarioActivo.getSaldo() - saldoARetirar;
								
								usuarioActivo.setSaldo(totalidadDeSaldo);
								
								salirDelWhile = false;
								
								salirDelMenu = true;
								
							}
						
						else 
							
							{
								System.out.println("NO POSEE SALDO SUFICIENTE");
								salirDelWhile = true;
							}
						
					}
					
					break;
					
				case "c":
					
					System.out.println("SU SALDO ES:");
					
					System.out.println(usuarioActivo.getSaldo());
					
					salirDelMenu = true;
					
					break;
					
				case "d":
					do {
						System.out.println("--------------------------------------------\n");
						System.out.println("ELIJA LA OPCION PARA PROSEGUIR:");
						System.out.println("1) OPERAR CON OTRA CUENTA");
						System.out.println("2) SALIR DEL PROGRAMA");
						System.out.println("--------------------------------------------\n");
						
						int salirDelProgramaFinal = teclado.nextInt();
						
						switch(salirDelProgramaFinal) {
						
						case 1:
							
							salirDelMenu = false;
							
							salirDelPrograma = true;
							
							salirDelMenuSalir = false;
							
							break;
							
						case 2:
							
							System.out.println("HA SALIDO EXITOSAMENTE DEL PROGRAMA");
							
							salirDelMenu = false;
							
							salirDelPrograma = false;
							
							salirDelMenuSalir = false;
							
							break;
							
						default:
							
							System.out.println("--------------------------------------------");
							
							System.out.println("CARACTER INCORRECTO, INGRESE UN CARACTER VALIDO");
							
							System.out.println("--------------------------------------------\n");
							
							salirDelMenuSalir = true;
							
						}
						
					}while(salirDelMenuSalir == true);

					break;
					
				default:
					
					System.out.println("--------------------------------------------");
					
					System.out.println("CARACTER INCORRECTO, INGRESE UN CARACTER VALIDO");
					
					System.out.println("--------------------------------------------\n");
					
					salirDelMenu = true;
					
				}
			
		    }
		
		while(salirDelMenu == true);
		
		}while(salirDelPrograma==true);
	}
	
}