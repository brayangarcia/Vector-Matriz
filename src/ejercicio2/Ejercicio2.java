/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;
import java.util.Scanner;
/**
 *
 * @author Brayan
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Vector vec=new Vector();
        Matriz mat=new Matriz();
        
        
        Scanner sc = new Scanner(System.in);
        
        int resp01,resp02,resp03;
        do{
        System.out.println("1. Vector");
        System.out.println("2. Matriz");
        System.out.println("Ingrese su respuesta");
        resp01 = sc.nextInt();
       
        switch(resp01){
            case 1:
                
                vec.Vectorcito();
                System.out.println("1. Descendente");
                System.out.println("2. Ascendente");
                System.out.println("Ingrese su respuesta");
                resp02 = sc.nextInt();
                
                switch(resp02){
                    case 1:
                        vec.descendente();
                    break;
                    case 2:
                        vec.ascendente();
                    break;
                }
                
            break;
            
            case 2:
                
                mat.Matricita();
                
                System.out.println("1. Descendente");
                System.out.println("2. Ascendente");
                System.out.println("Ingrese su respuesta");
                resp02 = sc.nextInt();
                
                switch(resp02){
                    case 1:
                        mat.descendente();
                    break;
                    case 2:
                        mat.ascendente();
                    break;
                }
                
            break;
        }
        
        System.out.println("\n1. Seguir");
        System.out.println("2. Terminar");
        resp03 = sc.nextInt();
        }while(resp03==1);
                   
    }
        
}
