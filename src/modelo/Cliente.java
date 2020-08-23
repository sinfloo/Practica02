
package modelo;

public class Cliente {
    int id;
    String dni;
    String nom;
    String dir;
    String celular;
    String estado;

    public Cliente() {
    }

    public Cliente(int id, String dni, String nom, String dir, String celular, String estado) {
        this.id = id;
        this.dni = dni;
        this.nom = nom;
        this.dir = dir;
        this.celular = celular;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

   
    
}
