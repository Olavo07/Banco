package Banco;
import java.util.*;

class Conta {
  public void c() {
    Scanner sc = new Scanner(System.in);
    //Conta CC = new Conta();
    //Banco.setCC(CC);
    String conta, poupanca, corrente;
    System.out.println("Deseja ter acesso a sua conta corrente ou poupança?");
    conta = sc.next();
    switch (conta){
      case ("corrente"):
        System.out.println("Conta corrente");
        break;
      case ("poupanca"):
        System.out.println("Conta poupança");
        break;      
    } 
  }
}
