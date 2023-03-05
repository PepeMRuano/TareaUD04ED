package cuentasBanco;

/**
 *  Esta es la clase principal de nuestro proyecto
 * @author Pepe Martínez Ruano
 * @version 1.0
 *
 */
public class Main {

	/**
 * Esta será la clase "de arranque" al contener el "main" y tiene dentro la llamada 
 * al método que nos dirá el saldo en cada momento
 * @param args: estos argumentos son los que vienen por defecto y no los rellenamos 
 * nostros
 */
	
    public static void main(String[] args) {
    	
/**
 * Esto es una variable de clase definida con tipo "CuentaBanco" y
 * en la cual almacenaremos los datos del cliente titular de la cuenta
 */
        CuentaBanco miCuenta;
/**
 * Esta variable del tipo double contendrá el saldo en cada momento de 
 * los requeridos
 */
        double saldoActual;
        
        extracted();
    }
    
/**
 * En este método se forma el constructor, se instancia las cuentas y se 
 * facilita el saldo 
 * 
 * Además contempla unos mensajes que pueden ocurrir al "retirar" o "ingresar"
 */
  
	private static void extracted() {
		operativaCuenta(0.0f);
	}

private static void operativaCuenta(float cantidad) {
	CuentaBanco cuentaPersonal;
	double saldoActual;
	cuentaPersonal = new CuentaBanco("Antonio López","1000-2365-85-1230456789",10000,0);
	saldoActual = cuentaPersonal.estado();
	System.out.println("El saldo actual es "+ saldoActual );
	
	try {
	    cuentaPersonal.retirar(4000);
	} catch (Exception e) {
	    System.out.print("Fallo al retirar");
	}
	try {
	    System.out.println("Ingreso en cuenta");
	    cuentaPersonal.ingresar(2000);
	} catch (Exception e) {
	    System.out.print("Fallo al ingresar");
	}
}
	
}
