
import java.util.ArrayList;
import java.util.HashMap;

public class PruebaAsiento{
    public static void main(String[] args) {
      
         ArrayList<Asiento> Fila1a4 = new ArrayList<>();
        ArrayList<Asiento> Fila5a10 = new ArrayList<>();


        Fila1a4.add(new Asiento( 1, 10));
        Fila1a4.add(new Asiento( 1, 10));
        Fila1a4.add(new Asiento( 1, 10));
        Fila1a4.add(new Asiento( 1, 10));
        Fila1a4.add(new Asiento( 1, 10));
        Fila1a4.add(new Asiento( 1, 10));
        Fila1a4.add(new Asiento( 1, 10));
        Fila1a4.add(new Asiento( 1, 10));

        Fila5a10.add(new Asiento( 1, 6));
        Fila5a10.add(new Asiento( 1, 6));
        Fila5a10.add(new Asiento( 1, 6));
        Fila5a10.add(new Asiento( 1, 6));
        Fila5a10.add(new Asiento( 1, 6));
        Fila5a10.add(new Asiento( 1, 6));
        Fila5a10.add(new Asiento( 1, 6));
        Fila5a10.add(new Asiento( 1, 6));



        HashMap<Integer, ArrayList<Asiento>> Teatro = new HashMap<>();
        Teatro.put( 1 , Fila1a4);
        Teatro.put( 2 , Fila1a4);
        Teatro.put( 3 , Fila1a4);
        Teatro.put( 4 , Fila1a4);

        Teatro.put( 5 , Fila5a10);
        Teatro.put( 6 , Fila5a10);
        Teatro.put( 7 , Fila5a10);
        Teatro.put( 8 , Fila5a10);
        Teatro.put( 9 , Fila5a10);
        Teatro.put( 10 , Fila5a10);

        System.out.println("Fila 1 = " + Teatro.get(1));
        System.out.println("Fila 2 = " + Teatro.get(2));
        System.out.println("Fila 3 = " + Teatro.get(3));
        System.out.println("Fila 4 = " + Teatro.get(4));
        System.out.println("Fila 5 = " + Teatro.get(5));
        System.out.println("Fila 6 = " + Teatro.get(6));
        System.out.println("Fila 7 = " + Teatro.get(7));
        System.out.println("Fila 8 = " + Teatro.get(8));
        System.out.println("Fila 9 = " + Teatro.get(9));
        System.out.println("Fila 10 = " + Teatro.get(10));



    }
}
    