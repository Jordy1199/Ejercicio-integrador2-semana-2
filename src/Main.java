public class Main {
    public static void main(String[] args) {

        Paciente p = new Paciente(
                "Carlos Pérez",
                "0102030405",
                45,
                25.50,
                3,
                4,
                "Premium"
        );

        System.out.println("===== REPORTE DEL PACIENTE =====");
        System.out.println("Nombre: " + p.nombreCompleto);
        System.out.println("ID: " + p.identificacion);

        System.out.println("\n===== RESULTADOS =====");
        System.out.println("Costo total sin descuento: " + p.calcularCostoTotal());
        System.out.println("Costo final con descuento: " + p.aplicarDescuento());
        System.out.println("Clasificación: " + p.clasificarPrioridad());
        System.out.println("Mensaje: " + p.generarMensajeMedico());
    }
}
