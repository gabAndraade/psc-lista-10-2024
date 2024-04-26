public class Fogao {
    public String tipo;
    public String cor;
    public int bocas;
    public String marca;

    public Fogao(String tipo, String cor, int bocas, String marca){
        this.tipo=tipo;
        this.cor=cor;
        this.bocas=bocas;
        this.marca=marca;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public int getBocas() {
        return bocas;
    }
    public void setBocas(int bocas) {
        this.bocas = bocas;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void cozinhar(){
        System.out.println("Cozinhando...");
    }
    public void ferver(){
        System.out.println("Fervendo a água.");
    }
    public void assar(){
        System.out.println("Assando...");
    }
    public void acender(){
        System.out.println("Estou acendendo o fogão.");
    }
}
