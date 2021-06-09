public class Computador {
    private String marca;
    private String modelo;
    private Ram ram1 = new Ram();

    public Computador() {
        this.marca = "Gear";
        this.modelo = "x-300";

    }

    public Ram getRam1() {
        return ram1;
    }

    public void CambiarMarcaRam(String marca) {
        ram1.setMarca(marca);

    }

    public String MarcaRam() {
        return ram1.getMarca();
    }

    public void CambiarCapacidadRam(int capacidad) {
        ram1.setCapacidad(capacidad);

    }

    public String CapacidadRam() {
        return ram1.getMarca();
    }

    public void CambiarFrecuenciaRam(int frecuencia) {
        ram1.setFrecuancia(frecuencia);

    }

    public String FrecuenciaRam() {
        return ram1.getMarca();
    }

        public String getMarca () {
            return marca;
        }

        public void setMarca (String marca){
            this.marca = marca;

        }

        public String getModelo () {
            return modelo;
        }

        public void setModelo (String modelo){
            this.modelo = modelo;

        }


    }

