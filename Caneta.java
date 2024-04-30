public class Caneta {
    private String corTinta;
    private String tipo;
    private int tamanho;
    private double espessura;

    public Caneta(String corTinta, String tipo, int tamanho, double espessura){
        this.corTinta=corTinta;
        this.tipo= tipo;
        this.tamanho=tamanho;
        this.espessura=espessura;
    }
    public String getCorTinta() {
        return corTinta;
    }
    public void setCorTinta(String corTinta) {
        this.corTinta = corTinta;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getTamanho() {
        return tamanho;
    }
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    public double getEspessura() {
        return espessura;
    }
    public void setEspessura(double espessura) {
        this.espessura = espessura;
    }
    public void escrever(){
        System.out.println("Escrevendo...");
    }
    public void desenhar(){
        System.out.println("Desenhando...");
    }
    public void marcar(){
        System.out.println("Marcando...");
    }
    public void sublinhar(){
        System.out.println("Sublinhando...");
    }
}
