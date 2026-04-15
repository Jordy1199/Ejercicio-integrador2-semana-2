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
        this.edad = edad;
        this.costoConsulta = costoConsulta;
        this.numeroConsultas = numeroConsultas;
        this.prioridadMedica = prioridadMedica;
        this.tipoSeguro = tipoSeguro;
    }

    public double calcularCostoTotal() { return 0; }

    public double aplicarDescuento() { return 0; }

    public String clasificarPrioridad() { return ""; }

    public String generarMensajeMedico() { return ""; }
}