/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kjbs1
 */
public class Multiplicacion_Recursiva {
    
    int i = 1, suma = 0;
    String cad="";  
    
    public int Multiplicacion(int num){
    
        if (i <= 10){
            suma= suma + num;
            cad= cad + (num+" x "+i+" = "+suma+"\n");
        }
        else{
            return suma;
        }
        i++;
        return Multiplicacion(num);
    }  
}
