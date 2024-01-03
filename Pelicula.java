public class Pelicula{
    
    private String Nombre;
    private String Director;
    private enum GeneroPelicula{
        accion, comedia, drama, suspenso
    };
    private GeneroPelicula genero;
    private int Duracion;
    private int Año;
    private double Calificacion;
    
    //constructor de la clase pelicula 
    public Pelicula(String Nombre, String Director, GeneroPelicula genero, int Duracion, int Año, double Calificacion){
        this.Nombre = Nombre;
        this.Director = Director;
        this.genero = genero;
        this.Duracion = Duracion;
        this.Año = Año;
        this.Calificacion = Calificacion;
    }
    
    //getters de las variables
    public String getNombre(){
        return Nombre;
    }
    public String getDirector(){
        return Director;
    }
    public GeneroPelicula getGenero(){
        return genero;
    }
    public int getDuracion(){
        return Duracion;
    } 
    public int getAño(){
        return Año;
    }
    public double getCalificacion(){
        return Calificacion;
    }
    
    //setters de todas las variables
    private void setNombre(String Nombre){
        this.Nombre = Nombre;
    }
    private void setDirector(String Director){
        this.Director = Director;
    }
    private void setGenero(GeneroPelicula genero){
        this.genero = genero;
    }
    private void setDuracion(int Duracion){
        this.Duracion = Duracion;
    }
    private void setAño(int Año){
        this.Año = Año;
    }
    private void setCalificacion(double Calificacion){
        this.Calificacion = Calificacion;
    }
    
    //metodo para imprimir todas las variables
    public void Imprimir(){
        System.out.println("Nombre = " + Nombre);
        System.out.println("Director = " + Director);
        System.out.println("Genero = " + genero);
        System.out.println("Duracion = " + Duracion);
        System.out.println("Año = " + Año);
        System.out.println("Calificacion = " + Calificacion);
        System.out.println();
    }
    
    //metodo que devuelve true si la pelicula dura mas de 3 horas
    private boolean esEpica(){
        System.out.print(Nombre + " es Epica = ");
        if(Duracion>=180){
            return true;
        } else {
            return false;
        }
    }
    
    //metodo que devuelve la valoracion de la pelicula
    private String Valoracion(){
        if(Calificacion <= 2){
            return "Muy mala";
        } else if(Calificacion <= 5){
            return "Mala";
        } else if(Calificacion <= 7){
            return "Regular";
        } else if(Calificacion <= 8){
            return "Buena";
        } else {
            return "Excelente";
        }
    }
    
    //metodo que compara dos peliculas. Si las dos son del mismo genero y tienen la misma valoracion se devuelve true
    private boolean esSimilar(Pelicula p2){
        System.out.print(Nombre + " es similar a " + p2.Nombre + " = ");
        if(p2.genero == genero && p2.Valoracion() == Valoracion()){
            return true;
        } else {
            return false;
        }
    }
    
    public static void main (String[] args) {
        Pelicula p1 = new Pelicula("Gandhi", "Richard Attenborough", GeneroPelicula.drama, 191, 1982, 8.1);
        Pelicula p2 = new Pelicula("Thor", "Kenneth Branagh", GeneroPelicula.accion, 115, 2011, 7.0);
        p1.Imprimir();
        p2.Imprimir();
        System.out.println(p1.esEpica());
        System.out.println(p2.esEpica());
        System.out.println(p1.esSimilar(p2));
    }
}