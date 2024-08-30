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

    // acceder a las constantes del Enum turno  Turno
    System.out.println(" accediendo a las constantes del Enum Turno");
    System.out.println(turno);
    // accediendo a las constantes del enum DiaSemana
    System.out.println(" accediante a la constante del enum dia :");
    System.out.println(dia);

    // obteniendo todos los valores del enum

    DiaSemana []dias =DiaSemana.values();
    System.out.println(" mostrando la descripcion de todos los dias de la semana ");
     for (int i = 0; i < dias.length; i++) {
        System.out.println( dias[i].getDescripcion());
        
     }
    
  }
  
    
}
