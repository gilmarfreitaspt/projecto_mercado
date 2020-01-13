/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercado;

import java.util.HashSet;
import java.util.Set;


 
public class Mercado {
    private String produto;
    private double preco;
    private double stock;
    private double quantidade;
    private int metodo;
    
    
    // get's e set´s
    public String getproduto(){return produto;}
    public void setproduto(String produto ){this.produto=produto;}
    public double  getpreco(){return preco;}
    public void setpreco(double preco ){this.preco=preco;}
    public double  getstock(){return stock;}
    public void setstock(double stock ){this.stock=stock;}
    public double  getquantidade(){return quantidade;}
    public void setquantidade(double quantidade ){this.quantidade=quantidade;}
    public int  getmetodo(){return metodo;}
    public void setmetodo(int metodo ){this.metodo=metodo;}
    
    private void verificaStock(){
        if (quantidade<=this.stock)this.stock -=quantidade;
        else 
            System.out.println("stock insuficiente");
        }
    
    private void totalPagar(){
         double tPagar;
         tPagar=this.quantidade*this.preco;
         System.out.println("o valor a pagar : "+tPagar);
    }
    private void metodoPagamento(){
       switch(this.metodo){
           case 1:
    System.out.println("pagamento em Dinheiro");
    break;
           case 2:
    System.out.println("pagamento em cheque");
      break;
           case 3:
    System.out.println("pagamento em cartão");
     break;
}
    
       
}
    
    
    public static void main(String[] args) {
        Mercado p1= new Mercado();
        p1.setproduto("detergente");
        p1.setpreco(3.25);
        p1.setstock(50);
        p1.setquantidade(20);
        p1.setmetodo(1);
        
        p1.verificaStock();
        p1.totalPagar();
        p1.metodoPagamento();
        
  
    }
    
}
