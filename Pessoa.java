public class Pessoa {
    private String nome;
    private String sobrenome;
    private int idade;
    private double altura;

    public Pessoa(String nome, String sobrenome, int idade,double altura){
        this.nome=nome;
        this.sobrenome=sobrenome;
        this.idade=idade;
        this.altura=altura;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void falar(){
        System.out.println("Falando...");
    }
    public void andar(){
        System.out.println("Andando...");
    }
    public void ouvir(){
        System.out.println("Ouvindo...");
    }
    public void aprender(){
        System.out.println("Aprendendo...");
    }    
}

