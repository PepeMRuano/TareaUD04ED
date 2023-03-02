public class Main {

    public static void main(String[] args) {
        CuentaBanco miCuenta;
        double saldoActual;
        

        extracted();
    }
  
	private static void extracted() {
		CuentaBanco miCuenta;
		double saldoActual;
		miCuenta = new CuentaBanco("Antonio López","1000-2365-85-1230456789",5000,0);
        saldoActual = miCuenta.estado();
        System.out.println("El saldo actual es "+ saldoActual );

        try {
            miCuenta.retirar(4000);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            miCuenta.ingresar(2000);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
	}
	
}
