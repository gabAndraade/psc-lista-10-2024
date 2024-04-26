public class Carro {
    public String cor;
    public int qntdPortas;
    public double preco;
    public int ano;

    public Carro(String cor, int qntdPortas, double preco, int ano){
        this.cor=cor;
        this.qntdPortas=qntdPortas;
        this.preco=preco;
        this.ano=ano;
    }
    
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getQntdPortas() {
        return qntdPortas;
    }

    public void setQntdPortas(int qntdPortas) {
        this.qntdPortas = qntdPortas;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    public void acelerar(){
        System.out.println("Acelerando...");
    }
    public void frear(){
        System.out.println("Freiando...");
    }
    public void estacionar(){
        System.out.println("Estacionando...");
    }
    public void virar(){
        System.out.println("Virando...");
    }

    

    
}
