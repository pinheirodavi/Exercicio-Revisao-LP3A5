public class Gerente extends Funcionario {

    private String senha;

    public Gerente(String nome, String salario, String departamento, String senha) {
        super(nome, salario, departamento);
        this.senha = senha;
    }

    @Override
    public String mostrarInformacoes() {
        return "Nome: " + this.nome + "\nSalário: " + this.salario + "\nDepartamento: " + this.departamento + "\nSenha: " + this.senha;
    }
}