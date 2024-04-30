public class Roupa {
    private String material;
    private String tamanho;
    private String cor;
    private String estilo;

    public Roupa(String material, String tamanho, String cor, String estilo){
        this.material=material;
        this.tamanho=tamanho;
        this.cor=cor;
        this.estilo=estilo;
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public String getTamanho() {
        return tamanho;
    }
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getEstilo() {
        return estilo;
    }
    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }
    public void vestir(){
        System.out.println("Vestindo a roupa");
    }
    public void lavar(){
        System.out.println("Lavando a roupa");
    }
    public void passar(){
        System.out.println("Passando a roupa");
    }
    public void rasgar(){
        System.out.println("Rasgada");
    }
}
