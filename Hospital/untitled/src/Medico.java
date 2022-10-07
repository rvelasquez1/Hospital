import java.util.Date;
import java.util.List;

public class Medico extends Persona {
    String codMedico;
    Hospital hospital;

    public Medico(String nombre, String primerApellido, String segundoApellido, Date fechaNacimiento, String DNI) {
        super(nombre, primerApellido, segundoApellido, fechaNacimiento, DNI);
    }
}