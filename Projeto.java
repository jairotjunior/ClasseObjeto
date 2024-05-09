package Java;

public class Projeto {

  //Nesta classe define-se as lojas a serem cadastradas 
  String nome;
  String endereco;

  public static void main (String args[]){
    Projeto projeto = new Projeto();
    projeto.setNome("Casas Bahia");
    projeto.setEndereco("R: Casas Bahia, 1");
    System.out.println(projeto.nome);
    System.out.println(projeto.endereco);
  } 
    
    void setNome(String nome){
      this.nome = nome;
    }
    
    String getNome(){
      return nome;
    }

    void setEndereco(String endereco){
      this.endereco = endereco;
    }
    
    String getEndereco(){
      return endereco;
    }
  }