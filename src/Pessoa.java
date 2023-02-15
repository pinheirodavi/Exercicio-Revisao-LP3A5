public class Pessoa {
    protected String nome;
    protected Long idade;

    public String apresentar() {
        return "Olá, eu sou " + nome + " e tenho " + idade + " anos.";
    }

    public Pessoa(String nome, Long idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getIdade() {
        return idade;
    }

    public void setIdade(Long idade) {
        this.idade = idade;
    }
}
