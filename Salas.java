
package cinemasala;

public class Salas {
    public int menu;
    public int lugaresSala1;
    public int lugaresSala2;
    public int lugaresSala3;
    
    
    public String mensagemFilmesDoDia(){
        return "Para qual filme sera o ingresso?";   
    }
    public int ingressosDoDia(){
        return lugaresSala1 + lugaresSala2 + lugaresSala3;
    }
}
