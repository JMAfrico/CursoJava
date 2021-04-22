package oo.heranca.desafio;

public class Carro {

    public double aceleraçao = 0;
    
    public boolean acelerar(){
            aceleraçao = aceleraçao + 5;
        return true;

    }
    
    public boolean frear(){
        aceleraçao = aceleraçao - 5;
        return true;
    }
    
    public double getAceleracao(){
        return aceleraçao;
    }
    
    @Override//Quando eu chamar o objeto, por padrão vai aparecer essa mensagem
    public String toString(){
        return "Aceleração atual "+aceleraçao+"Km/h";
    }
}