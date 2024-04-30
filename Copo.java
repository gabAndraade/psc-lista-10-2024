public class Copo {
    private String material;
    private int capacidade;
    private String formato;
    private double tamanho;

    public Copo(String material, int capacidade, String formato, double tamanho){
        this.material=material;
        this.capacidade=capacidade;
        this.formato=formato;
        this.tamanho=tamanho;
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public int getCapacidade() {
        return capacidade;
    }
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    public String getFormato() {
        return formato;
    }
    public void setFormato(String formato) {
        this.formato = formato;
    }
    public double getTamanho() {
        return tamanho;
    }
    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }
    public void encher(){
        System.out.println("Enchendo...");
    }
    public void beber(){
        System.out.println("Estou bebendo no copo.");
    }
    public void esvaziar(){
        System.out.println("Esvaziando...");
    }
    public void lavar(){
        System.out.println("Estou lavando o copo.");
    }
}
