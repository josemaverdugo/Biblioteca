package tema6.biblioteca;

public class testLibro {
    public static void main(String[] args) {
        Libro L1=new Libro("Lazarillo de Tormes","Alfonso de Valdes", 12,0);
        
        System.out.println(L1.prestamos());
        System.out.println(L1.toString());
        L1.devolucion();
        System.out.println(L1.toString());
    }
    
}
