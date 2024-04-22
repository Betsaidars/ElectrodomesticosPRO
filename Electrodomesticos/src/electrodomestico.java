import java.sql.Array;
import java.util.ArrayList;

public class electrodomestico {

    private final double precioBase = 100;
    protected final String color = "blanco";
    protected final char consumoEnergetico = 'F';
    protected final double peso = 5;

    //No me deja crear los colores dentro del arrayList. Tampoco se si crear un ArrayList o un Array
    protected ArrayList<String> colores = new ArrayList<>();

    public electrodomestico(ArrayList<String> colores) {
        this.colores = colores;
    }

    public electrodomestico(double precioBase, double peso){
        this.precioBase = precioBase;
        this.peso = peso;
    }


}
