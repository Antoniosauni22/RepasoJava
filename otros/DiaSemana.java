package otros;

public enum DiaSemana {
    LUNES("primer dia de la semana"),
    MARTES("segundo dia de la semana"),
    MIERCOLES("Tercer dia de la semana");
    private String descripcion;

    // metodo constructor de enum
    private DiaSemana(String descripcion){
        this.descripcion=descripcion;

    }
    
    // metodo para obtener la descripcion del dia de la semana 
    public String getDescripcion(){
        return this.descripcion;
    }

  
   
    
    
}
