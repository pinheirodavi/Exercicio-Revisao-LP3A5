public class Aluno extends Pessoa{
    private String matricula;

    public Aluno(String nome, Long idade, String matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    @Override
    public String apresentar(){
        return "Olá, eu sou o aluno " + this.nome +"com matrícula"+this.matricula+ " e tenho " + this.idade + " anos.";
    }
}
