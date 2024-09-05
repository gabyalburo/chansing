/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package undang;

public class Product {
    int pid;
    String pname;
    double price;
    int stocks, sold;
    
    public void addProducts(int id,String name, double pr, int stcks, int sld){
        this.pid = id;
        this.pname = name;
        this.price = pr;
        this.stocks = stcks;
        this.sold = sld;
    }
    
    public void getProducts(){
        double profit = this.price*this.sold;
        double tep = this.stocks*this.price;
        
        String status = (this.stocks > 0) ? "Available" : "Out-of-Stocks";
        
        System.out.println("   "+this.pid+"    "+this.pname+"    "+this.price+"    "+this.stocks+"     "+this.sold+"    "+profit+"     "+tep+"   "+status);
    }
}