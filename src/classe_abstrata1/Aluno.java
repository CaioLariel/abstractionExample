/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe_abstrata1;

/**
 *
 * @author caio.gflima
 */
public class Aluno extends Pessoa {
    
    
    //construtor
    public Aluno(){
        
    }
    @Override
    public String retornaDados(){
        
        String dados = "";
        
        //dados presentes na classe abstrata, acessiveis na classe que herda
        dados += "Nome:" + nome + "\n";
        dados += "RG:" + rg + "\n";
        dados += "CPF :" + cpf + "\n";
        return dados;
    }
}
