public class Paciente {

    public String nombreCompleto;
    public String identificacion;

    private int edad;
    private double costoConsulta;
    private int numeroConsultas;
    private int prioridadMedica;
    private String tipoSeguro;

    public Paciente(String nombreCompleto, String identificacion, int edad, double costoConsulta,
                    int numeroConsultas, int prioridadMedica, String tipoSeguro) {

        this.nombreCompleto = nombreCompleto;
        this.identificacion = identificacion;

        // Validaciones
        if (edad > 0) {
            this.edad = edad;
        } else {
            this.edad = 1;
        }

        if (costoConsulta > 0) {
            this.costoConsulta = costoConsulta;
        } else {
            this.costoConsulta = 1;
        }

        if (numeroConsultas >= 0) {
            this.numeroConsultas = numeroConsultas;
        } else {
            this.numeroConsultas = 0;
        }

        if (prioridadMedica >= 1 && prioridadMedica <= 5) {
            this.prioridadMedica = prioridadMedica;
        } else {
            this.prioridadMedica = 1;
        }

        this.tipoSeguro = tipoSeguro;
    }

    // Calcular costo total sin descuento
    public double calcularCostoTotal() {
        return costoConsulta * numeroConsultas;
    }

    public double aplicarDescuento() {
        double total = calcularCostoTotal();
        double descuento = 0;

        if (tipoSeguro.equalsIgnoreCase("Basico")) {
            descuento = total * 0.10;
        } else if (tipoSeguro.equalsIgnoreCase("Premium")) {
            descuento = total * 0.20;
        } else {
            descuento = 0;
        }

        return total - descuento;
    }

    public String clasificarPrioridad() {
        if (prioridadMedica >= 4) {
            return "Alta prioridad";
        } else if (prioridadMedica >= 2) {
            return "Prioridad media";
        } else {
            return "Prioridad baja";
        }
    }

    public String generarMensajeMedico() {
        String prioridad = clasificarPrioridad();

        if (prioridad.equals("Alta prioridad")) {
            return "Atención inmediata requerida";
        } else if (prioridad.equals("Prioridad media")) {
            return "Seguimiento necesario";
        } else {
            return "Control regular";
        }
    }
}