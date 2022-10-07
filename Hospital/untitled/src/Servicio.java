import java.awt.*;
import java.util.List;

public class Servicio {
    String idServicio;
    String nombre;
    List<Hospital> hospital;
    int numeroCamas;
    String comentario;

    public Servicio(String idServicio, String nombre, List<Hospital> hospital, int numeroCamas, String comentario) {
        this.idServicio = idServicio;
        this.nombre = nombre;
        this.hospital = hospital;
        this.numeroCamas = numeroCamas;
        this.comentario = comentario;
    }

    public String getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(String idServicio) {
        this.idServicio = idServicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Hospital> getHospital() {
        return hospital;
    }

    public void setHospital(List<Hospital> hospital) {
        this.hospital = hospital;
    }

    public int getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    @Override
    public String toString() {
        return "Servicio{" +
                "idServicio='" + idServicio + '\'' +
                ", nombre='" + nombre + '\'' +
                ", hospital=" + hospital +
                ", numeroCamas=" + numeroCamas +
                ", comentario='" + comentario + '\'' +
                '}';
    }
}
