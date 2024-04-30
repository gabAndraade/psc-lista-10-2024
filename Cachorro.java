public class Cachorro {
    private String raca;
    private String nome;
    private int idade;
    private String corPelo;
    
    public Cachorro(String raca, String nome, int idade, String corPelo){
        this.raca=raca;
        this.nome=nome;
        this.idade=idade;
        this.corPelo=corPelo;
    }
    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getCorPelo() {
        return corPelo;
    }
    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    public void latir(){
        System.out.println("Latindo...");
    }
    public void correr(){
        System.out.println("Correndo...");
    }
    public void comer(){
        System.out.println("Comendo...");
    }
    public void brincar(){
        System.out.println("Brincando...");
    }
}
