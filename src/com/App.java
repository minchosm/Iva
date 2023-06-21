package com;
public class App {
    public static void iva(double cantidad){
       System.out.println(cantidad = cantidad + (cantidad / 100) * 21);
    }
    public static void main(String[] args){
      iva(56);
    }

    
}
