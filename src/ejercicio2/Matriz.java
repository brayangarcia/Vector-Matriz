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
public class Matriz {
    
    public int [][]b;
    public int tam=0;

    public void Matricita() {
        
        
        int num;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ingrese el tamaño de la matriz:");
        tam = sc.nextInt();
        
        b=new int[tam][tam];
        
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b.length;j++){
                System.out.println("ingrese valor en la posicion "+i);
                num=sc.nextInt();
                b[i][j]=num;
            }
        }
        
    }
    
    public void descendente(){
        int aux,i,j,x,y;
        for(i=0;i<b.length;i++){
            for(j=0;j<b.length;j++){
                for(x=0;x<b.length;x++){
                    for(y=0;y<b.length;y++){
                        if(b[i][j]<b[x][y]){
                            aux=b[i][j];
                            b[i][j]=b[x][y];
                            b[x][y]=aux;
                        }
                    }
                }
            }
        }
        
        for(i=0;i<b.length;i++){
            for(j=0;j<b.length;j++){
                System.out.print(b[i][j]+" ");
                
            }
        }
    }
    
    public void ascendente(){
        int aux,i,j,x,y;
        for(i=0;i<b.length;i++){
            for(j=0;j<b.length;j++){
                for(x=0;x<b.length;x++){
                    for(y=0;y<b.length;y++){
                        if(b[i][j]>b[x][y]){
                            aux=b[i][j];
                            b[i][j]=b[x][y];
                            b[x][y]=aux;
                        }
                    }
                }
            }
        }
        
        for(i=0;i<b.length;i++){
            for(j=0;j<b.length;j++){
                System.out.print(b[i][j]+" ");
                
            }
        }
    }
    
}
