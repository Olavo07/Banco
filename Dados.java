package Banco;
import java.util.*;

class Dados {
  public void d()  {
    Scanner sc = new Scanner(System.in);
    //Dados DD = new Dados();
    //Banco.setDD(DD);
    int op, funcionario, clinte;
    System.out.println("O seu perfil é de funcionário (1) ou cliente(2)? ");
    op = sc.nextInt();
    switch (op){
      case 1:
        System.out.println("Funcionário");
        break;
      case 2:
        System.out.println("Cliente");
        break;        
    }
  }
}
