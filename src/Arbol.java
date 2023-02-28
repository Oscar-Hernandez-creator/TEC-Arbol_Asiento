public class Arbol {
    private String nombre;
    private int tamaño;
    private String color;
    private int grosor;

    public Arbol() {
    }
    
    

    public Arbol(String nombre, int tamaño, String color , int grosor) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.color = color;
        this.grosor = grosor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getGrosor() {
        return grosor;
    }

    public void setGrosor(int grosor) {
        this.grosor = grosor;
    }

    @Override
    public String toString() {
        return "Arbol{" + "nombre=" + nombre + ", tama\u00f1o=" + tamaño + ", color=" + color + ", grosor=" + grosor + '}';
    }

    
}
