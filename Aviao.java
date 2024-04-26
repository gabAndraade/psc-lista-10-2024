public class Aviao {
    public String modelo;
    public int capacidade;
    public String fabricante;
    public int velocidade;
    public Aviao(String modelo, int capacidade, String fabricante, int velocidade){
        this.modelo=modelo;
        this.capacidade=capacidade;
        this.fabricante=fabricante;
        this.velocidade=velocidade;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getCapacidade() {
        return capacidade;
    }
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public int getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    public void voar(){
        System.out.println("Voando...");
    }
    public void aterrisar(){
        System.out.println("Aterrissando...");
    }
    public void decolar(){
        System.out.println("Decolando...");
    }
    public void viajar(){
        System.out.println("Viajando...");
    }
    
}
