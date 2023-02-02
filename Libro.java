package tema6.biblioteca;

public class Libro {
    
    private String tituloLibro;
    private String autor;
    private int numeroEjemplares;
    private int ejemplaresPrestados;
    
    
    Libro(){
        
    }
    
    Libro(String tituloLibro, String autor, int numeroEjemplares, int ejemplaresPrestados){
        
        this.tituloLibro=tituloLibro;
        this.autor=autor;
        this.numeroEjemplares=numeroEjemplares;
        this.ejemplaresPrestados=ejemplaresPrestados;
        
    }

    public String gettituloLibro(){
        return tituloLibro;
    }
    
    public void settituloLibro(String tituloLibro){
        this.tituloLibro=tituloLibro;
        
    }
    
    
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public int getnumeroEjemplares(){
        return numeroEjemplares;
        
    }
    
    public void setnumeroEjemplares(int numeroEjemplares){
        this.numeroEjemplares=numeroEjemplares;
    }
    
    public int getejemplaresPrestados(){
        return ejemplaresPrestados;
    }
    
    public void setejemplaresPrestados(int ejemplaresPrestados){
        this.ejemplaresPrestados=ejemplaresPrestados;
        
    }
    
    
      
    boolean prestamos(){
        boolean res;
        if(numeroEjemplares>0){
            res=true;
            numeroEjemplares--;
            ejemplaresPrestados++;
        }else{
            res=false;
            
        }
    return res;        
        
    }
    
    boolean devolucion(){
        boolean res;
        if(ejemplaresPrestados>0){
            res=true;
            numeroEjemplares++;
            ejemplaresPrestados--;
        }else{
            res=false;
        }
    return res;
            
    }
    
    public String toString(){
        
      return  "El titulo del libro es: " + tituloLibro +  "\n El autor del libro es: "+ autor + "\n El numero de ejemplares son: " + numeroEjemplares + "\n El total de ejemplares prestados son:"+ ejemplaresPrestados;
    }
    
    
    
}
