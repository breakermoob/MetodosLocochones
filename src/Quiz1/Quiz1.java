/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz1;
import java.util.Scanner;
/**
 *
 * @author bm
 */
public class Quiz1 {

   public static void main(String[] args) {        
        potencia();
        mostrarX();
        mostrarX2();
        factorial();
        tablasMultiplicar();
        
        
    }
    
    
    /*punto 1*/
     public void mostrarPares()
       {            
        int a=-32;
        int b=-108;
        while(a>=b){
            
            if(a%2==0){
                System.out.println("numero" + a);               
         }                
           a= a-1;          
        }  
    }    
     public static void mostrarX( )
                {
                    
                  System.out.print("Ingrese un numero mayor o igual a -2: ");
                  Scanner read =new Scanner(System.in);
                  int n= read.nextInt();
                  int x=0;
                  if(n>=-2){
                  for(int i =-2;i<=n;i++)
                  {
                       x =7*i-3;
                       System.out.print(x + "\n");
                  }                  
                   
                }
                    else
     {
         System.out.println("El numero debe ser mayor o igual a -2");
     }
                  System.out.println("X es igual a "+x);
                }
     public static void mostrarX2 (){//punto 3
         
           System.out.print("Ingrese un numero m: ");
                  Scanner read =new Scanner(System.in);
                 int  m= read.nextInt();
                 int a1=0;
                 int a2=0;
                 int n;
                 System.out.print("ingrese un numero n: ");
                 n= read.nextInt();
                 if(n>=-2){
                 for(int i=-2;i<=m;i++){
                     for(int j=-3;j<=n;j++){
                         a2=a2+4*i-j;
                     }
                     a1=a1+3*i+a2;
                     }
                 }
                     else{
                     System.out.println("El numero debe ser mayor o igual a -2");
                 
                     }
                 System.out.println("el resultado es: "+a1);
                  
                         }
     public static void tablasMultiplicar(){
         int i;
         int j=0;
         int producto=0;        
         for(i=1;i<=10;j++){
             producto=i*j;
             System.out.println(i+" * "+j+" = "+producto);
             if(j==10)
             {
                 i=i+1;
                 j=0;
             }                 
             }
     }
     public static void factorial()
     {
         System.out.println("Ingrese el valor: ");
         Scanner read =new Scanner(System.in);
         int n= read.nextInt();
         int p=n;
         while(n>1){
             p = p *(n-1);
             n=n-1;
         }        
         System.out.println("El factorial es: "+ p);
     }
     public static void potencia()
     {
         System.out.println("Ingrese el flotante: ");
         Scanner read =new Scanner(System.in);
         float n = read.nextFloat(); 
         System.out.println("Ingrese el entero: ");
         int m = read.nextInt(); 
         float p=n;
         while(m>1){
             p=p*n;
             m=m-1;  
         }
         System.out.println(p);
     }
  }
