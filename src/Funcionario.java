public class Funcionario {
    protected String nome;
    protected String salario;
    protected String departamento;

    public String mostrarInformacoes() {
        return "Nome: " + this.nome + "\nSalário: " + this.salario + "\nDepartamento: " + this.departamento;
    }

    public Funcionario(String nome, String salario, String departamento) {
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }
}
