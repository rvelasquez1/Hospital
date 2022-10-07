import java.util.Date;

public class Paciente extends Persona {
    String codPaciente;
    String numeroSeguridadSocial;

    public Paciente(String nombre, String primerApellido, String segundoApellido, Date fechaNacimiento, String DNI, String codPaciente) {
        super(nombre, primerApellido, segundoApellido, fechaNacimiento, DNI);
        this.codPaciente = codPaciente;
    }
}
