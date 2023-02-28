

import java.util.ArrayList;

/**
 *
 * @author Oscar
 */
public class PruebaArbol {
    public static void main(String[] args) {
       ArrayList<Arbol> Parque = new ArrayList<>();
       
       Arbol Arbol1 = new Arbol( "Arce", 6, "Verde", 2);
       Arbol Arbol2 = new Arbol( "Cedro", 4, "Verde Oscuro", 3);
       Arbol Arbol3 = new Arbol( "Abedul", 9, "Blanco", 1);
       
       Parque.add(Arbol1);
       Parque.add(Arbol2);
       Parque.add(Arbol3);
       
        System.out.println(Parque);
       
    }
}
