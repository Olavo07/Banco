package Banco;
import java.util.*;

class Servicos {
  public void s()  {
    Scanner sc = new Scanner(System.in);
    //Servicos SS = new Servicos();
    //Banco.setSS(SS);
    int op, deposito, saque, transferencia, saldo, extrato, cadastrar;
    System.out.println("Deseja realizar qual serviço?  1- deposito, 2- saque, 3- transferencia, 4- saldo, 5- extrato, 6- cadastrar");
   // Servicos.getServicos();
    op = sc.nextInt();
    switch (op){
      case 1:
        System.out.println("Depósito");
        break;
      case 2:
        System.out.println("Saque");
        break;
      case 3:
        System.out.println("Transferência");
        break;
      case 4:
        System.out.println("Saldo disponível");
        break;
      case 5:
        System.out.println("Extrato");
        break;
      case 6:
        System.out.println("Cadastrar");
        break;
    } 
  }
}
