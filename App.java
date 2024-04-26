public class App{
    public static void main(String[] args) {
        Carro carro = new Carro("Azul",4,80000,2019);  

        System.out.println("Carro");
        System.out.println("Cor do carro: "+carro.getCor()+"\nPortas: "+carro.getQntdPortas()+"\nPreço: "+carro.getPreco()+"\nAno de fabricação: "+carro.getAno());
        System.out.print("O carro de cor "+carro.getCor()+" está ");
        carro.estacionar();

        Pessoa pessoa = new Pessoa("Gabriel","Andrade",18,1.70);

        System.out.println("\nPessoa:");
        System.out.println("Nome: "+pessoa.getNome()+"\nSobrenome: "+pessoa.getSobrenome()+"\nIdade: "+pessoa.getIdade()+"\nAltura: "+pessoa.getAltura()+" metros");
        System.out.print(pessoa.getNome()+" está ");
        pessoa.aprender();

        Cachorro cachorro = new Cachorro("Yorkshire micro", "Zaya",2, "Preto e Branco");

        System.out.println("\nCachorro: ");
        System.out.println("Raça do cachorro: "+cachorro.getRaca()+"\nNome: "+cachorro.getNome()+"\nIdade: "+cachorro.getIdade()+"\nCor do pelo: "+cachorro.getCorPelo());
        System.out.print(cachorro.getNome()+" está ");
        cachorro.latir();

        Aviao aviao = new Aviao("Boeing 737-800", 139, "Boeing",842);

        System.out.println("\nAvião:");
        System.out.println("Modelo do avião: "+aviao.getModelo()+"\nNúmero de assentos: "+aviao.getCapacidade()+"\nFabricante: "+aviao.getFabricante()+"\nVelocidade de cruzeiro: "+aviao.getVelocidade()+" Km/h");
        System.out.print("O "+aviao.getModelo()+ " está ");
        aviao.decolar();

        Celular celular = new Celular("Apple", "Iphone 15", 256,"Titânio Azul");

        System.out.println("\nCelular: ");
        System.out.println("Marca do celular: "+celular.getMarca()+"\nModelo: "+celular.getModelo()+"\nArmazenamento: "+celular.getQntdArmazenamento()+"gb"+"\nCor: "+celular.getCor());
        System.out.print(celular.getModelo()+" está ");
        celular.carregar();

        Caneta caneta = new Caneta("Preta", "Esferográfica", 15, 2.5);

        System.out.println("\nCaneta");
        System.out.println("Cor da tinta: "+caneta.getCorTinta()+"\nTipo: "+caneta.getTipo()+"\nTamanho: "+caneta.getTamanho()+"cm"+"\nEspessura da ponta: "+caneta.getEspessura()+"mm");
        System.out.print("A caneta do tipo "+caneta.getTipo()+" está ");
        caneta.desenhar();

        Computador computador = new Computador("Lenovo","Ideapad S145", "Ryzen 5 3500u", 8);

        System.out.println("\nComputador: ");
        System.out.println("Marca do computador: "+computador.getMarca()+"\nModelo: "+computador.getModelo()+"\nProcessador: "+computador.getCpu()+"\nMemória RAM: "+computador.getRam()+"gb");
        System.out.print("O Notebook "+computador.getMarca()+" está ");
        computador.ligar();

        Copo copo = new Copo("Vidro", 200,"Cilíndrico",8.5);

        System.out.println("\nCopo: ");
        System.out.println("Material do copo: "+copo.getMaterial()+"\nCapacidade: "+copo.getCapacidade()+"ml"+"\nFormato: "+copo.getFormato()+"\nAltura do copo: "+copo.getTamanho()+"cm");
        copo.lavar();

        Fogao fogao = new Fogao("Cooktop","Preto",4,"Mondial");

        System.out.println("\nFogão: ");
        System.out.println("Tipo de fogão: "+fogao.getTipo()+"\nCor: "+fogao.getCor()+"\nQuantidade de bocas: "+fogao.getBocas()+"\nMarca: "+fogao.getMarca());
        System.out.print("O fogão está ");
        fogao.ferver();

        Roupa roupa = new Roupa("Algodão","M","Branca","Camisa");

        System.out.println("\nRoupa: ");
        System.out.println("Material: "+roupa.getMaterial()+"\nTamanho: "+roupa.getTamanho()+"\nCor: "+roupa.getCor()+"\nEstilo: "+roupa.getEstilo());
        System.out.print("A "+ roupa.getEstilo()+" está ");
        roupa.rasgar();
        
        
    }
}