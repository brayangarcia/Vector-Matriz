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
public class Vector extends Ejercicio2 implements OrientacionInterface{    
    
    public int []a;
    public void Vectorcito() {
        
        int z,resp,numeros,resp2;
        //int[]a;
        
        Scanner sc = new Scanner(System.in);
        
        
                System.out.println("ingrese el tamaño del vector:");
                z = sc.nextInt();
                
                a=new int[z];
                
                for(int i=0;i<a.length;i++){
                    System.out.println("ingrese valor en la posicion "+i);
                    numeros=sc.nextInt();
                    a[i]=numeros;
                }
            
    }
    
    public void descendente(){
        int aux,i,j;
        for (i=0; i<a.length;i++){
            for(j=0;j<a.length;j++){
                if(a[i]<a[j]){
                    aux=a[i];
                    a[i]=a[j];
                    a[j]=aux;
		}
            }
        }
        
        for (i=0; i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        
    } 
    
    public void ascendente(){
        int aux,i,j;
        for (i=0; i<a.length;i++){
            for(j=0;j<a.length;j++){
                if(a[i]>a[j]){
                    aux=a[i];
                    a[i]=a[j];
                    a[j]=aux;
		}
            }
        }
        
        for (i=0; i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    
}
