/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exAtividade07;

import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Tamiris
 */
public class Atividade07 {
    
  
  
   
   public double media (double vVetor[]){    
     double media=0;
     int i=0;
     double soma=0;
              
     for(i = 0; i < vVetor.length; i++)
        soma +=  vVetor[i];
     
      media = (soma/vVetor.length);
      
     return media;
    }
    
    public double menorValor(double vVetor[]){
    int i=0;     
    double menorValor = vVetor[0];
    
    for (i=0; i<vVetor.length; i++) {
      
      if (vVetor[i] < menorValor)
         menorValor = vVetor[i]; 
     }     
     return menorValor;
        
    }
    
    
    public double maiorValor(double vVetor[]){
    int i=0;     
    double maiorValor = vVetor[vVetor.length - 1];
    
    for (i=0; i<vVetor.length; i++) {
      
      if (vVetor[i] > maiorValor)
         maiorValor = vVetor[i]; 
    }     
    
     return maiorValor;        
    }
    
    
    public double valoresAcimaMedia(double vVetor[]){
    int i=0, contAcimaMedia=0;         
    double media = media(vVetor);
    
    for (i=0; i<vVetor.length; i++) {
      
        if(vVetor[i] > media)
            contAcimaMedia++;     
    }    
     return contAcimaMedia;        
    }
    
    
    public double valoresAbaixoMedia(double vVetor[]){
    int i=0, contAbaixoMedia=0;    
    double media = media(vVetor);
    
    for (i=0; i<vVetor.length; i++) {
      
        if(vVetor[i] < media)
            contAbaixoMedia++;     
    }    
     return contAbaixoMedia;        
    }
    
    
    public double getDesvioPadrao (double vVetor[]) {
    Double media = media(vVetor);
    
    int i=0, tamanho = vVetor.length;
    
    double desvioPadrao = 0, vAuxiliar=0;
    
    for (i=0; i<vVetor.length; i++) {
        
        double aux = vVetor[i] - media;
        desvioPadrao += vAuxiliar * vAuxiliar;
    }
    return Math.sqrt(desvioPadrao / tamanho);
}
    
    
}
