/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe_abstrata1;

/**
 *
 * @author caio.gflima
 */
public class Funcionario extends Pessoa {

    private String dataAdmissao;
    private int matriculaFuncionario;
    private double salarioMensal;

    @Override
    public String retornaDados() {

        //atribuindo valores da principal dentro dos dados do alunos
        String dados = "";

        //dados presentes na classe abstrata, acessiveis na classe que herda
        dados += "Nome:" + getNome() + "\n";
        dados += "RG:" + getRg() + "\n";
        dados += "CPF :" + getCpf() + "\n";dados += "Data da admissao.: " + getDataAdmissao() + "\n";
        dados += "Matricula do Funcionario: " + getMatriculaFuncionario() + "\n";
        dados += "Salario mensal: " + getSalarioMensal() + "\n";

        return dados;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public int getMatriculaFuncionario() {
        return matriculaFuncionario;
    }

    public void setMatriculaFuncionario(int matriculaFuncionario) {
        this.matriculaFuncionario = matriculaFuncionario;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }
}
