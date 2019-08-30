class Empleado
{
    
    private String nombre;
    
    private int edad;
    
    private double salario;
    
    public Empleado(String nombre, int edad, double salario)
    {
        
        this.nombre = nombre;
        
        this.salario = salario;
        
        this.edad = edad;
        
    }
    
    public String dameDatos()
    {
        
        return "El empleado se llama " + nombre + ", tiene " + edad + " años, " + " y un salario de " + salario + " euros."; 
        
    }
    
}