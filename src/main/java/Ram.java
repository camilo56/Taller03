public class Ram {
    private String marca="";
    private int capacidad=0;
    private int frecuancia=0;




    public Ram() {
        this.frecuancia = frecuancia;
        this.marca = marca;
        this.capacidad = capacidad;
    }

    public Ram(String marca,int capacidad,int frecuancia) {
        this.frecuancia = frecuancia;
        this.marca = marca;
        this.capacidad = capacidad;    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getFrecuancia() {
        return frecuancia;
    }

    public void setFrecuancia(int frecuancia) {
        this.frecuancia = frecuancia;
    }

    @Override
    public String toString() {
        return "Ram{" +
                "marca='" + marca + '\'' +
                ", capacidad=" + capacidad +
                ", frecuancia=" + frecuancia +
                '}';
    }
}
