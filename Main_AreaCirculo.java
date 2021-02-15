
package com.nowe.presentacion;

/**
 *
 * @author Ana Garcia
 */
public class Main_AreaCirculo {
    
    public static void main(String[]args){
       //Declarar una constante, un valor fijo que no cambia
       //Para declarar una constante se usa la palabra reservada final
       //Las constantes se ponen en mayúsculas
       //Cuando declaramos una constante hay que asignarle su valor
       //final <tipo> <nombre de la constante> = <valor>;
       final double PI =3.14;
       //Declarar la variable
       double radio = 2;
       double area;
       area = PI*radio*radio;
        System.out.println("Area del círculo-->" + area);
        
       
        
    }
    
}
