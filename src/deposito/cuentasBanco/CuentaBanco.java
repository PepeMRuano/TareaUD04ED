package cuentasBanco;
/**
 *  Esta clase nos proporciona las variables y los métodos necesarios para realizar el
 *  seguimiento de una cuenta bancaria , analizar sus movimientos ( ingresos o retiradas monetarias)
 *  y conocer el estado de la misma, (3/3/2023)  
 *  
 * @author Pepe Martínez Ruano
 * @version 1.0
 * 
 */
public class CuentaBanco {

/**
 * Esta variabla ( de tipo String)deberá contener el nombre y los dos apellidos del titular o titulares de la cuenta
 */
    private String nombre;
    
/**
 * En esta variable ( de tipo String) deberemos almacenar el número de la cuenta (veinte dígitos) en un formato : DDDD-DDDD-DD- y a
 *  continuación diez dígitos más
 */
    private String cuenta;
/**
 * En esta variable de tipo double se almacenará el saldo inicial con el que se abre la citada cuenta    
 */
    private double saldo;
/**
 *   En esta tambien de tipo double almacenaremos el tipo de interés que nos ofrece el banco (actualmente cero...)  
 */  
    private double tipoInteres;
/*
    public CuentaBanco()
    {
    	
    }
    */
/**
 *  Con este método constructor, posteriormente, crearemos la cuenta de cada uno de los clientes   
 * @param nom: Nombre del titular de la cuenta
 * @param cue: Número de identificación de la cuenta ( los 20 dígitos)
 * @param sal: Saldo inicial de la cuenta
 * @param tipo: Tipo de interes que nos ofrece el banco
 */

    public CuentaBanco(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }
    
/**
 * Nos proporciona el estado de la cuenta en todo momento, después de hacer
 *  la operación de "ingresar" o "retirar" dinero    
 * @return Nos devuelve el saldo en  cada momento
 */

    public double estado()
    {
        return getSaldo();
    }
    
/**
 * Este método se ocupa de gestionar la cuenta cuando se produce un ingreso    
 * @param cantidad: Nos indica la cantidad de dinero a ingresar
 * @throws Exception Prevee que se pueda intentar hacer un ingreso con una cantidad 
 * negativa
 */

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    
/**
 * Este método se ocupa de gestionar la cuenta cuando se produce una retirada 
 * de efectivo
 *     
 * @param cantidad Nos indica la cantidad de dinero a retirar
 * 
 * @throws Exception Prevee que se pueda intentar hacer una retirada de una cantidad 
 * negativa o que la cantidad que se intente retirar sea mayor que el saldo que 
 * exista en ese momento en la cuenta.
 *  
 */

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

private String getNombre() {
	return nombre;
}

private void setNombre(String nombre) {
	this.nombre = nombre;
}

private String getCuenta() {
	return cuenta;
}

private void setCuenta(String cuenta) {
	this.cuenta = cuenta;
}

private double getSaldo() {
	return saldo;
}

private void setSaldo(double saldo) {
	this.saldo = saldo;
}

private double getTipoInteres() {
	return tipoInteres;
}

private void setTipoInteres(double tipoInteres) {
	this.tipoInteres = tipoInteres;
}
}
