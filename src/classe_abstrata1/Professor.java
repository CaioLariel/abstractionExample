/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe_abstrata1;

public class Professor extends Pessoa {

    private int matriculaProfessor;
    private String dataAdmissao;
    private double salarioHorista;

    @Override
    public String retornaDados() {

        //atribuindo valores da principal dentro dos dados do alunos
        String dados = "";

        //dados presentes na classe abstrata, acessiveis na classe que herda
        dados += "Nome:" + getNome() + "\n";
        dados += "RG:" + getRg() + "\n";
        dados += "CPF :" + getCpf() + "\n";
        dados += "Data de admissao: " + getDataAdmissao() + "\n";
        dados += "Matricula do professor: " + getMatriculaProfessor() + "\n";
        dados += "salarioHorista: " + getSalarioHorista() + "\n";

        return dados;
    }

    public int getMatriculaProfessor() {
        return matriculaProfessor;
    }

    public void setMatriculaProfessor(int matriculaProfessor) {
        this.matriculaProfessor = matriculaProfessor;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public double getSalarioHorista() {
        return salarioHorista;
    }

    public void setSalarioHorista(double salarioHorista) {
        this.salarioHorista = salarioHorista;
    }
}
