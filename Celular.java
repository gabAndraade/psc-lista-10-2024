public class Celular {
    public String marca;
    public String modelo;
    public int qntdArmazenamento;
    public String cor;

    public Celular(String marca, String modelo, int qntdArmazenamento, String cor){
        this.marca=marca;
        this.modelo=modelo;
        this.qntdArmazenamento=qntdArmazenamento;
        this.cor=cor;
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
    public int getQntdArmazenamento() {
        return qntdArmazenamento;
    }
    public void setQntdArmazenamento(int qntdArmazenamento) {
        this.qntdArmazenamento = qntdArmazenamento;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public void ligar(){
        System.out.println("Ligando...");
    }
    public void capturar(){
        System.out.println("Capturando a paisagem.");
    }
    public void carregar(){
        System.out.println("Carregando...");
    }
    public void vibrar(){
        System.out.println("Vibrando...");
    }
}
