package Destape;

import java.util.ArrayList;
import java.util.List;

public class Caso {
    private int numeroCaso;
    private String nombreClave;
    private Detective detectiveAsignado;
    private List<Sospechoso> sospechosos;

    public Caso(int numeroCaso, String nombreClave, Detective detectiveAsignado) {
        this.numeroCaso = numeroCaso;
        this.nombreClave = nombreClave;
        this.detectiveAsignado = detectiveAsignado;
        this.sospechosos = new ArrayList<>();
    }

    // Métodos getters y setters
    public int getNumeroCaso() {
        return numeroCaso;
    }

    public void setNumeroCaso(int numeroCaso) {
        this.numeroCaso = numeroCaso;
    }

    public String getNombreClave() {
        return nombreClave;
    }

    public void setNombreClave(String nombreClave) {
        this.nombreClave = nombreClave;
    }

    public Detective getDetectiveAsignado() {
        return detectiveAsignado;
    }

    public void setDetectiveAsignado(Detective detectiveAsignado) {
        this.detectiveAsignado = detectiveAsignado;
    }

    public List<Sospechoso> getSospechosos() {
        return sospechosos;
    }

    public void setSospechosos(List<Sospechoso> sospechosos) {
        this.sospechosos = sospechosos;
    }

    // Método para agregar un sospechoso al caso
    public void agregarSospechoso(Sospechoso sospechoso) {
        sospechosos.add(sospechoso);
    }

    // Método para buscar un sospechoso por nombre
    public Sospechoso buscarSospechoso(String nombre) {
        for (Sospechoso sospechoso : sospechosos) {
            if (sospechoso.getNombre().equalsIgnoreCase(nombre)) {
                return sospechoso;
            }
        }
        return null; // Retorna null si no se encuentra el sospechoso
    }
}

package destape;

public class Detective {
    private String nombre;
    private int antiguedad;

    public Detective(String nombre, int antiguedad) {
        this.nombre = nombre;
        this.antiguedad = antiguedad;
    }

    // Métodos getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
}

package destape;

public class Sospechoso {
    private String nombre;
    private String descripcionCaracteristicas;
    private String alias;
    private int edad;
    private String foto;
    private String ultimaDireccion;

    public Sospechoso(String nombre, String descripcionCaracteristicas, String alias, int edad, String foto, String ultimaDireccion) {
        this.nombre = nombre;
        this.descripcionCaracteristicas = descripcionCaracteristicas;
        this.alias = alias;
        this.edad = edad;
        this.foto = foto;
        this.ultimaDireccion = ultimaDireccion;
    }

    // Métodos getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcionCaracteristicas() {
        return descripcionCaracteristicas;
    }

    public void setDescripcionCaracteristicas(String descripcionCaracteristicas) {
        this.descripcionCaracteristicas = descripcionCaracteristicas;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getUltimaDireccion() {
        return ultimaDireccion;
    }

    public void setUltimaDireccion(String ultimaDireccion) {
        this.ultimaDireccion = ultimaDireccion;
    }
}

