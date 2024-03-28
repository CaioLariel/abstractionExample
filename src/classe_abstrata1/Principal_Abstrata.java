/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe_abstrata1;

/**
 *
 * @author caio.gflima
 */
public class Principal_Abstrata {
    public static void main(String[] args) {
        
        //Instancia do primeiro aluno
        Aluno a1 = new Aluno();
        
        a1.nome = "Caio Gabriel";
        a1.rg = "36.453.783-5";
        a1.cpf = "345.424.345-6";
        
        //imprimindo dados do aluno
        
        System.out.println("\t - Dados do aluno: " + a1.nome + " - \n");
        System.out.println(a1.retornaDados());
    }
}
