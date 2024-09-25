package scr;

//criação da classe

public class filme {
	
//introdução das variáveis de maneira privada
	
	private int duracao;
	private String nome;
	private String genero;
	
//declaração do meu objeto, ja colocado o construtor como set..
	public filme(int duracao, String nome, String genero) {
	
	this.setDuracao(duracao);
	this.setNome(nome);
	this.setGenero(genero);		
	}

//chamando o valor da variavel
	
	public String getNome() {
        return nome;
    }
	
	
//alteração do valor da variavel nome
    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            System.out.println("O nome não pode ser vazio. Atribuindo um nome padrão.");
            this.nome = "Nome não informado";
        } else {
            this.nome = nome;
        }
    }
    
   //chamando o valor da variavel duracao

    public int getDuracao() {
        return duracao;
    }
//alterando o nome da variavel duracao || coloquei que em caso de não ser colocado tempo irá atribuir o tempo padrão de 90 minutos ao filme
    public void setDuracao(int duracao) {
        if (duracao <= 0) {
            System.out.println("A duração deve ser maior que zero. Atribuindo 90 minutos.");
            this.duracao = 90;
        } else {
            this.duracao = duracao;
        }
    }
// chama o valor da variavel genero
    public String getGenero() {
        return genero;
    }
// muda o valor da variavel genero, e condiciona o usuário a esses tres temas de filme.
    public void setGenero(String genero) {
        String selegen = genero.toUpperCase(); //usado para converter todas as letra em maiusculas.
        
//utilizei um switch para limitar os generos para o usuário.
        
        switch (selegen) {
            case "ROMANCE":
            case "TERROR":
            case "COMEDIA":
                this.genero = genero;
                break;
            default:
                System.out.println("Gênero inválido, nesta seção cabem somente Romance, Terror ou Comédia");
                System.out.println("");
                this.genero = "Inválido"; //informa se caso o genero for diferente dos propostos.
        }
    }

        public static void main(String[] args) {
            filme filme1 = new filme(180, "A volta dos que não foram", "Independente"); // Vai mostrar exceção
            filme filme2 = new filme(146, "As sete tranças de um careca", "Terror");

            System.out.println("Nome: " + filme1.getNome());
            System.out.println("Duração: " + filme1.getDuracao() + " minutos");
            System.out.println("Gênero: " + filme1.getGenero());
            System.out.println("");
            
            System.out.println("Nome: " + filme2.getNome());
            System.out.println("Duração: " + filme2.getDuracao() + " minutos");
            System.out.println("Gênero: " + filme2.getGenero());
            System.out.println("");
        }
    }  



