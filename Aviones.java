public class Aviones{
    
    String Fabricante;
    int numeroMotores;
    
    //Contructor del objeto Aviones
    public Aviones(String Fabricante, int numeroMotores){
        this.Fabricante = Fabricante;
        this.numeroMotores = numeroMotores;
    }
    
    //getter de los atributos
    String getFabricante(){
        return Fabricante;
    }
    int getNumeroMotores(){
        return numeroMotores;
    }
    
    //setter de los attributos
    void setFabricante(String Fabricante){
        this.Fabricante = Fabricante;
    }
    void setNumeroMotores(int numeroMotores){
        this.numeroMotores = numeroMotores;
    }
    
    //metodo que imprime el nombre del Fabricante
    void imprimirFabricante(){
        System.out.println(Fabricante);
    }
    
    //metodo que cambia al Fabricante a Loockhead
    void cambiarFabricante(Aviones a){
        a.Fabricante = "Loockhead";
    }
    
    public static void main (String[] args) {
        Aviones a1 = new Aviones("Airbus", 4);
        Aviones a2;
        a2 = a1;
        a1.imprimirFabricante();
        a2.imprimirFabricante();
        a1.setFabricante("Douglas");
        a1.imprimirFabricante();
        a2.imprimirFabricante();
        a1.cambiarFabricante(a2);
        a2.imprimirFabricante();
    }
}