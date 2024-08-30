package enums;

import otros.DiaSemana;

public class aplication {
  public static void main(String[] args) {
    Turno turno=Turno.MAÑANA;
    System.out.println(" el turno creado es :"+turno);

    // trabajando con dias de la semana ;
    DiaSemana dia=DiaSemana.LUNES;
    // obtenemos valores o atributos mediante los metodos creados :
    System.out.println(" mostrando valores mediante sus metodos :");
    System.out.println(dia.getDescripcion());
    
  }
  
    
}
