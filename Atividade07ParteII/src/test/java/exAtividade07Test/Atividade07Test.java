/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exAtividade07Test;

import exAtividade07.Atividade07;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tamiris
 */
public class Atividade07Test {
    
    @Test
    public void testMenorValor(){
    
        Atividade07 atv = new Atividade07();
        
        double vVetor[] = new double[] {1,2,3,4,5};     
        
        assertEquals(1, atv.menorValor(vVetor), 1);
    } 
    
    @Test
     public void testMaiorValor(){
    
        Atividade07 atv = new Atividade07();
        
        double vVetor[] = new double[] {1,2,3,4,5};       
        assertEquals(5, atv.maiorValor(vVetor), 1);
    } 
    
     @Test
    public void testNumeroValoresAcimaMedia(){
     
         Atividade07 atv = new Atividade07();
        
        double vVetor[] = new double[] {1,2,3,4,5};  
        
        assertEquals(2, atv.valoresAcimaMedia(vVetor), 1);        
     }
     
     @Test
     public void testNumeroValoresAbaixoMedia(){
     
         Atividade07 atv = new Atividade07();
        
        double vVetor[] = new double[] {1,2,3,4,5};
        
        assertEquals(2, atv.valoresAbaixoMedia(vVetor), 1);
        
     }
     
     
     @Test
     public void testDesvioPadrao (){
                 
        Atividade07 atv = new Atividade07();
        
        double vVetor[] = new double[] {1,2,3,4,5};  
        
        assertEquals(1.89, atv.valoresAbaixoMedia(vVetor), 1);
        
     }
    
}
