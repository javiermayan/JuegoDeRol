
package juegoderol;

public class Jugador {
    private String nombre;
    private int vida=100, minPower,maxPower;
    int danio=0, golpeDebil, golpeFuerte;    
    
    public Jugador(String nombre, int minPower, int maxPower) {
        this.nombre = nombre;
        this.minPower = minPower;
        this.maxPower = maxPower;
        System.out.println("Nombre del jugador: " + nombre +", minPower: "+ minPower +", maxPower: "+ maxPower);
    }
    
    public String getNombre() {
        return this.nombre;        
    }    
    
    public int ataque (int n ) {                             
        golpeDebil=this.minPower * n;
        golpeFuerte=this.maxPower * n;
        danio = golpeDebil + golpeFuerte;
        return danio;
    }               
    
    @Override
    public String toString(){
        return "Nombre del jugador: " + nombre +", Golpe más débil: "+ golpeDebil +", Golpe más fuerte: "+ golpeFuerte;
    } 
    
}
