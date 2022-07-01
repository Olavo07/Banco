package Banco;
import java.util.*;

class Banco {
  public static void main(String[] args) {
    System.out.println("            Menu            ");
    Banco bc = new Banco();
    bc.Bb();
  }
  public void Bb(){
    Scanner sc = new Scanner(System.in);
    Conta CC = new Conta();
    Dados DD = new Dados();
    Servicos SS = new Servicos();
    String Menu;
    int opcao, dados, conta, servicos;
    
    System.out.println("1 - Dados Perfil, 2 - Conta, 3 - Serviços.");
     opcao = sc.nextInt();
     switch (opcao){
       case 1:
        System.out.println("Dados perfil");         
        DD.d();         
        //Banco.getDD();
         break;
       case 2:
         System.out.println("Conta");
         CC.c();  
         //Banco.getCC();
        break;
       case 3:
         System.out.println("Serviços");  
         SS.s();  
         //Banco.getSS();
          break;         
     }    
  }
}
