package cajeroAutomatico;
import java.util.Scanner;

public class CajeroAutomatico 

{

	public static void main(String[] args) 
	
	{
		
		UsuarioCajeroAutomatico vectorDePersonas[] = new UsuarioCajeroAutomatico[5];
		
		
		//DECLARATION OF VARIABLES AND OBJETCS
		//DECLARACION DE VARIABLES Y OBJETOS
		
		Scanner teclado = new Scanner(System.in);
		String entrarAlMenu="";
		boolean salirDelMenu = true;
		boolean salirDelPrograma = true;
		//boolean validarDatos = false;
		boolean salirDelMenuSalir = true;
		boolean salirDelDoWhile = true;
		UsuarioCajeroAutomatico usuarioActivo = null;
		double totalidadDeSaldo = 0.0;
		int dniTemporal = 0;
		double saldoTemporal = 0;
		double saldoACargar = 0;
		double saldoARetirar = 0;
		int salirDelProgramaFinal = 0;
		
		System.out.println(" ---------------------------------------------------------------");
		System.out.println("|       Bienvenido al Simulador de Cajero Automatico: ATM       |");
		System.out.println("|                                                               |");
		System.out.println("| Crear 5 usuarios con nombre, apellido, dni y saldo en cuenta: |");
		System.out.println(" ---------------------------------------------------------------\n");
		
		//ACA COMIENZA EL ALTA DE LOS USUARIOS
		//HERE BEGINS THE REGISTRATION OF THE USERS
		
		for (int i = 0; i < vectorDePersonas.length; i++) {
			System.out.println("--------------------------------------------\n");
			System.out.println("INGRESE NOMBRE DE LA PERSONA = " + i);
			String nombreTemporal = teclado.next();
		
			System.out.println("INGRESE APELLIDO DE LA PERSONA = " + i);
			
			String apellidoTemporal = teclado.next();
			
			
			//VALIDACION DE ENTRADA DE NUMERO ENTERO-----------------------------------------------
			do {
				
				System.out.println("INGRESE DNI DE LA PERSONA = " + i);
				
				
			    while (!teclado.hasNextInt()) {
			    	System.out.println("--------------------------------------------\n");
			        System.out.println("CARACTER INVALIDO, POR FAVOR INGRESE EL DNI\n");
			        System.out.println("--------------------------------------------\n");
			        
			        teclado.next(); // this is important!
			    }
			    dniTemporal = teclado.nextInt();
			    salirDelDoWhile = false;
			} while (salirDelDoWhile == true);
			//FIN DE ALGORITMO DE VALIDACION DE ENTEROS---------------------------------------------
			
			//ALGORTIMO DE VALIDACION DE ENTRADA DE NUMEROS ENTEROS-----------------------------------------------
			do {
				
				System.out.println("INGRESE SALDO DE LA PERSONA = " + i);
				
				
			    while (!teclado.hasNextInt()) {
			    	System.out.println("--------------------------------------------\n");
			        System.out.println("CARACTER INVALIDO, POR FAVOR INGRESE EL SALDO\n");
			        System.out.println("--------------------------------------------\n");
			        
			        teclado.next(); // this is important!
			    }
			    saldoTemporal = teclado.nextInt();
			    salirDelDoWhile = false;
			} while (salirDelDoWhile == true);
			//FIN DE ALGORITMO DE VALIDACION DE ENTEROS----------------------------------------------------------
			
			
			
			
			
			//EN LA LINEA 42 SE CREAN LOS USUARIOS INVOCANDO AL CONSTRUCTOR QUE TOMA 3 PARAMETROS
			//LINE 42 USERS ARE CREATED USING THE CONSTRUCTOR THAT TAKES THREE PARAMETERS
			
			vectorDePersonas[i]=new UsuarioCajeroAutomatico(nombreTemporal, apellidoTemporal, dniTemporal, saldoTemporal);
			
			}
		do {
			
		
		do {
			
			
			
			//ALGORITMO DE VALIDACION DE ENTRADA DE NUMERO ENTERO-----------------------------------------------
			do {
				System.out.println("--------------------------------------------\n");
				
				System.out.println("PARA COMENZAR CORRECTAMENTE EL PROGRAMA\n");
				System.out.println("INGRESE EL DNI DE LA PERSONA A OPERAR:\n");
				
				
			    while (!teclado.hasNextInt()) {
			    	System.out.println("--------------------------------------------\n");
			        System.out.println("CARACTER INVALIDO, POR FAVOR INGRESE EL DNI\n");
			        
			        teclado.next(); // this is important!
			    }
			    dniTemporal = teclado.nextInt();
			    salirDelDoWhile = false;
			} while (salirDelDoWhile == true);
			//FIN DE ALGORITMO DE VALIDACION DE ENTEROS-----------------------------------------------------------
				
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
						System.out.println("--------------------------------------------\n");
						System.out.println("BIENVENIDO AL CAJERO AUTOMATICO\n");
						
						System.out.println(usuarioActivo.getNombre()+" "+usuarioActivo.getApellido()+"\n");
						
						System.out.println("DNI: "+usuarioActivo.getDni()+"\n");
						
					}
				
				}
				
				else
					
					{
						System.out.println("--------------------------------------------\n");
						System.out.println("DNI NO ENCONTRADO, INGRESE UN DNI CORRECTO\n");
						System.out.println("--------------------------------------------\n");
						
						salirDelMenu = true;
					}
				
			}while(salirDelMenu == true);
		
		do {
			
			System.out.println("--------------------------------------------\n");
			
			System.out.println("Seleccione la opcion del menu:\n");
			
			System.out.println("a) DEPOSITAR\n");
			
			System.out.println("b) EXTRAER\n");
			
			System.out.println("c) CONSULTAR\n");
			
			System.out.println("d) SALIR\n");
			
			
			System.out.println("--------------------------------------------\n");
			entrarAlMenu = teclado.next();
			
			
			switch(entrarAlMenu) 
			
			{
			
				case "a":
					
					//ALGORITMO DE VALIDACION DE NUMERO DOUBLE-----------------------------
					do {
						
						System.out.println("--------------------------------------------\n");
						System.out.println("MONTO A DEPOSITAR:\n");
						
						
					    while (!teclado.hasNextDouble()) {
					    	System.out.println("--------------------------------------------\n");
					        System.out.println("CARACTER INVALIDO, POR FAVOR INGRESE EL MONTO A DEPOSITAR\n");
					        System.out.println("--------------------------------------------\n");
					        System.out.println("MONTO A DEPOSITAR:\n");
					        
					        teclado.next(); // this is important!
					    }
					    saldoACargar = teclado.nextDouble();
					    salirDelDoWhile = false;
					} while (salirDelDoWhile == true);
					//---------------------------------------------------------------------
					
					totalidadDeSaldo = usuarioActivo.getSaldo() + saldoACargar;
					
					usuarioActivo.setSaldo(totalidadDeSaldo);
					
					salirDelMenu = true;
					System.out.println("--------------------------------------------\n");
					System.out.println("HA DEPOSITADO CON EXITO: "+ "$"+ saldoACargar+"\n");
					System.out.println("--------------------------------------------\n");
					
					break;
					
				case "b":
					
					boolean salirDelWhile = true;
					
					while(salirDelWhile == true) 
						
					{
						
						
						
						//ALGORITMO DE VALIDACION DE NUMERO DOUBLE
						do {
							
							System.out.println("--------------------------------------------\n");
							System.out.println("USTED TIENE DISPONIBLE: $"+ usuarioActivo.getSaldo()+"\n");
							System.out.println("MONTO A EXTRAER:\n");
							
							
						    while (!teclado.hasNextDouble()) {
						    	System.out.println("--------------------------------------------\n");
						        System.out.println("CARACTER INVALIDO, POR FAVOR INGRESE EL MONTO A EXTRAER\n");
						        System.out.println("--------------------------------------------\n");
						        System.out.println("MONTO A EXTRAER:\n");
						        teclado.next(); // this is important!
						    }
						    saldoARetirar = teclado.nextDouble();
						    salirDelDoWhile = false;
						} while (salirDelDoWhile == true);
						
						
						if(saldoARetirar <= usuarioActivo.getSaldo()) 
						
							{
								System.out.println("--------------------------------------------\n");
								System.out.println("HA RETIRADO EXITOSAMENTE: $"+saldoARetirar+"\n");
								System.out.println("--------------------------------------------\n");
								
								totalidadDeSaldo = usuarioActivo.getSaldo() - saldoARetirar;
								
								usuarioActivo.setSaldo(totalidadDeSaldo);
								
								salirDelWhile = false;
								
								salirDelMenu = true;
								
							}
						
						else 
							
							{
								System.out.println("--------------------------------------------\n");
								System.out.println("NO POSEE SALDO SUFICIENTE\n");
								System.out.println("--------------------------------------------\n");
								
								salirDelWhile = true;
							}
						
					}
					
					break;
					
				case "c":
					System.out.println("--------------------------------------------\n");
					System.out.println(usuarioActivo.getNombre()+" "+ usuarioActivo.getApellido()+"\n" );
					System.out.println("SU SALDO ES: $"+usuarioActivo.getSaldo()+"\n");
					
					
					
					
					salirDelMenu = true;
					
					break;
					
				case "d":
					do {
						
						
						
						
						
						//ALGORTIMO DE VALIDACION DE ENTRADA DE NUMEROS ENTEROS-----------------------------------------------
						do {
							
							System.out.println("--------------------------------------------\n");
							System.out.println("ELIJA LA OPCION PARA PROSEGUIR:\n");
							System.out.println("1) OPERAR CON OTRA CUENTA\n");
							System.out.println("2) SALIR DEL PROGRAMA\n");
							System.out.println("--------------------------------------------\n");
							
							
						    while (!teclado.hasNextInt()) {
						    	System.out.println("--------------------------------------------\n");
						        System.out.println("CARACTER INVALIDO, POR FAVOR INGRESE UN NUMERO VALIDO\n");
						        System.out.println("--------------------------------------------\n");
						        
						        teclado.next(); // this is important!
						    }
						    salirDelProgramaFinal = teclado.nextInt();
						    salirDelDoWhile = false;
						} while (salirDelDoWhile == true);
						//FIN DE ALGORITMO DE VALIDACION DE ENTEROS----------------------------------------------------------
						
						switch(salirDelProgramaFinal) {
						
						case 1:
							
							usuarioActivo = null;
							
							salirDelMenu = false;
							
							salirDelPrograma = true;
							
							salirDelMenuSalir = false;
							
							break;
							
						case 2:
							System.out.println("--------------------------------------------\n");
							System.out.println("HA SALIDO EXITOSAMENTE DEL PROGRAMA\n");
							System.out.println("--------------------------------------------\n");
							
							salirDelMenu = false;
							
							salirDelPrograma = false;
							
							salirDelMenuSalir = false;
							
							break;
							
						default:
							
							System.out.println("--------------------------------------------\n");
							System.out.println("CARACTER INCORRECTO, INGRESE UN CARACTER VALIDO\n");
							System.out.println("--------------------------------------------\n");
							
							
							
							salirDelMenuSalir = true;
							
						}
						
					}while(salirDelMenuSalir == true);

					break;
					
				default:
					
					System.out.println("--------------------------------------------\n");
					System.out.println("CARACTER INCORRECTO, INGRESE UN CARACTER VALIDO\n");
					System.out.println("--------------------------------------------\n");
					
					
					
					salirDelMenu = true;
					
				}
			
		    }
		
		while(salirDelMenu == true);
		
		}while(salirDelPrograma==true);
	}
	
}