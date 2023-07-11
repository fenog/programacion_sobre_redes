package TPIO;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.io.PrintWriter;
import java.io.FileReader;

public class tpIOARCHIVOS {
	static PrintStream PS = System.out;
	static BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
	
	
	
	public static void ingresoDatos() {
	    PS.println("Cuantos numeros estara ingresando?");
	    int cantidadDatos = lecturaNum();
	    String[] datos = generarVector(cantidadDatos);
	    imprimirValoresVector(datos);
	    escribirDatosArchivo(datos);
	    
	    archErr(datos);
	    
	    archErrDos(datos);
	    
	    PS.println(leer());
	    PS.println("\nSe creó el archivo.");
	}

	
	private static int lecturaNum() {
	    int cantidadDatos = 0;
	    
	    try {
	        cantidadDatos = Integer.parseInt(BR.readLine());
	        PS.println("");
	    } catch (IOException | NumberFormatException e) {
	        e.printStackTrace();
	    }
	    
	    return cantidadDatos;
	}

	
	private static String[] generarVector(int cantidadDatos) {
	    String[] datos = new String[cantidadDatos];
	    
	    try {
	        for ( int i = 0 ; i < cantidadDatos ; i++ ) {
	            PS.println("Ingrese el dato para escribirlo en el vector (mínimo 5 datos): ");
	            datos[i] = BR.readLine();
	        }
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	    
	    return datos;
	}

	
	private static void imprimirValoresVector(String[] datos) {
	    PS.println("\nValores dentro del vector: ");
	    
	    for( int i = 0 ; i < datos.length ; i++ ) {
	        PS.println(datos[i]);
	    }
	    PS.println("");
	}

	private static void escribirDatosArchivo(String[] datos) {
	    File archivo = new File("datos.txt");
	    
	    try {
			FileWriter FW = new FileWriter(archivo , false);
			PrintWriter PW = new PrintWriter(FW);
			
			for( int i = 0 ; i < datos.length ; i++ ) {
			    PS.println("Ingrese el dato para escribirlo en el archivo (mínimo 5 datos): ");
			    String dato = BR.readLine();
			    PW.println(dato);
			}
			
			FW.flush();
			PW.close();
			FW.close();
        } catch (IOException e) {
	        e.printStackTrace();
	    }
	    
	}
	
	public static void archErr(String[] datos) {
	    File archivo = new File("resultados.txt");
	    File archivoError = new File("error.txt");
	    
	    try {
	        FileWriter FW = new FileWriter(archivo , false );
	        PrintWriter PW = new PrintWriter(FW);
	        
			FileWriter FWR = new FileWriter(archivoError , true);
			PrintWriter PWR = new PrintWriter(FWR);
			
	        for( int i = 0 ; i < datos.length ; i++ ) {
	            double num1 = Integer.parseInt(datos[i]);
	            
	            int num2Index = i + 1;
	            if(num2Index >= datos.length) {
	                num2Index = 0;
	            }
	            
	            double num2 = Integer.parseInt(datos[num2Index]) - 3;
	            
	            String resultado = "";
	            try {
	            	double result = num1 / num2;
	                resultado += result;
	            } catch (NumberFormatException | ArithmeticException e) {
	                PWR.println(datos[i] + " / " + datos[i + 1] + " = " + "error: " + e.getMessage());
	                resultado = "Error: División por cero";
	            }
	            
	            String linea = num1 + " / " + num2 + " = " + resultado;
	            PW.println(linea);
	        }
	        
	        FW.flush();
	        FWR.flush();
	        PW.close();
	        FW.close();
	        FWR.close();
	        
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
		
	public static void archErrDos(String[] datos) {
		String cadena = leer();
		String[] lineas = cadena.split("\n");
		
		File archivo = new File("resultadosDos.txt");
		File archivoError = new File("errorDos.txt");
		
		try {
			FileWriter FW = new FileWriter( archivo , true );
			PrintWriter PW = new PrintWriter(FW);

			FileWriter FWR = new FileWriter( archivoError , true );
			PrintWriter PWR = new PrintWriter(FWR);
			
			for( int i = 0 ; i < datos.length ; i++ ) {
                double num1 = Integer.parseInt(datos[i]);
                int num2 = 3;
                
                String resultado = "";
                try {
                    double result = num1 / num2;
                	resultado += result;
                    PS.println(result + ": ");
                } catch (NumberFormatException | ArithmeticException e) {
                	PWR.println(datos[i] + " / " + datos[i + 1] + " = " + "error: " + e.getMessage());
                    resultado = "Error: División por cero";
                }
                
                String linea = (num1 + " / " + num2 + " = " + resultado + "\n");
                PW.write(linea);
            }

			for (int i = 0; i < lineas.length - 1; i++) {
			    if (!lineas[i].isEmpty()) {
			        try {
			            double num1 = Double.parseDouble(lineas[i]);
			            int num2 = 3;

			            String resultado = "";
			            try {
			                double result = num1 / num2;
			                resultado += result;
			                PW.write(num1 + " / " + num2 + " = " + resultado + "\n");
			            } catch (NumberFormatException | ArithmeticException e) {
			                PWR.println(lineas[i] + " / " + lineas[i + 1] + " = " + "error: " + e.getMessage());
			                resultado = "Error: División por cero";
			            }
			        } catch (NumberFormatException e) {
			            PWR.println("Dato inválido: " + lineas[i]);
			        }
			    }
			}
			FW.flush();
	        FWR.flush();
	        PW.close();
	        FW.close();
	        FWR.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
        }
	
	public static String leer() {
		   
		String texto="";
		try {
			
			FileReader FR = new FileReader("datos.txt");
			BufferedReader BR = new BufferedReader(FR);
			
			String linea ="";
		
			while( (linea = BR.readLine() ) !=  null) {
				texto += "\n" + linea;
			}
				BR.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return texto;
	}	
}