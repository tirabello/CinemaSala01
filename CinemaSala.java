
package cinemasala;
import java.util.Scanner;


public class CinemaSala {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        Pessoa operador = new Pessoa();
        Salas sala = new Salas();
        Caixa caixa2 = new Caixa ();
        
     //----------------login-------------------------------
        System.out.print("Bem vindo\n");
        System.out.print("Digite seu nome: ");
        operador.nome = scan.nextLine();
        System.out.print("Agora,digite seu ID (composto somente de numeros): ");
        operador.ID = scan.nextInt();
        System.out.println(operador.MensagemIniciandoSistema() + "\nBem vindo "+ operador.nome);
     //----------------------------------------------------
     //-----------------menu inicial-----------------------
        while(sala.menu!=4){
            System.out.println("################################\n");
            System.out.println(sala.mensagemFilmesDoDia());
            System.out.println("1- Sala 1: Filme A");
            System.out.println("2- Sala 2: Filme B");
            System.out.println("3- Sala 3: Filme C");
            System.out.println("4- Encerrar o dia");
            System.out.println("################################");
            sala.menu = scan.nextInt();
      //------opções-----
            switch (sala.menu){
                case 1 -> { 
                    if(sala.lugaresSala1<30){
                        sala.lugaresSala1 ++;
                        System.out.println("Total de lugares restantes: "+ (30 - sala.lugaresSala1));
                        caixa2.caixa += 42;
                    }else
                        System.out.println("vagas esgotadas para esta sala.");
                }
                case 2 -> {
                    if(sala.lugaresSala2<35){
                        sala.lugaresSala2 ++;
                        System.out.println("Total de lugares restantes: "+ (35 - sala.lugaresSala2));
                        caixa2.caixa += 42;
                    }else
                        System.out.println("vagas esgotadas para esta sala.");
                }
                case 3 -> {
                    if(sala.lugaresSala3<55){
                        sala.lugaresSala3 ++;
                        System.out.println("Total de lugares restantes: "+ (55 - sala.lugaresSala3));
                        caixa2.caixa += 42;
                    }else
                        System.out.println("vagas esgotadas para esta sala.");
                }
            } 
        }  
             //sistema encerrado
            System.out.println("#############"); 
            System.out.println("Dia encerrado.");
            System.out.println("Total de ingressos vendidos: " + sala.ingressosDoDia());
            caixa2.caixa(caixa2.caixa);
            System.out.println(operador.nome);
          

    } 
    
}
