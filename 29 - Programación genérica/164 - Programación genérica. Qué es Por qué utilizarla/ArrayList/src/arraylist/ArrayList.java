/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

/**
 *
 * @author marcv
 */
public class ArrayList {

    private Object[] datosElemento;
    
    private int i = 0;
    
    public ArrayList(int z)
    {
        
        datosElemento = new Object[z];
        
    }
    
    public Object get(int i)
    {
        
        return datosElemento[i];
        
    }
    
    public void add(Object o)
    {
        
        datosElemento[i] = o;
        
        i++;
        
    }
    
}
