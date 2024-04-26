public class Computador {
    public String marca;
    public String modelo;
    public String cpu;
    public int ram;

    public Computador(String marca, String modelo, String cpu, int ram){
        this.marca=marca;
        this.modelo=modelo;
        this.cpu=cpu;
        this.ram=ram;
    }
    
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getCpu() {
        return cpu;
    }
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }
    public int getRam() {
        return ram;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }
    public void ligar(){
        System.out.println("Ligando...");
    }
    public void desligar(){
        System.out.println("Desligando...");
    }
    public void digitar(){
        System.out.println("Digitando...");
    }
    public void executar(){
        System.out.println("Executando...");
    }
}
