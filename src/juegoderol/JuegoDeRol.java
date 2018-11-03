
package juegoderol;

import java.util.Random;

public class JuegoDeRol {

    public static void main(String[] args) {        
        
        System.out.println("Condiciones previas de los contrincantes: ");
        Jugador jugador1 = new Jugador("Campeón",2,5);
        Jugador jugador2 = new Jugador("Retador",1,4);     
        
        int round = 1, danioCausado1,danioCausado2,stamina1=100,stamina2=100;
        Random aleatorio = new Random();    
        Random aleatorio2 = new Random();    
        
        while ((stamina1>0) && (stamina2>0) ) {            
        System.out.println("******Separador de Rounds******");
        System.out.println("Round Nro: " + round);      
                
        int n = aleatorio.nextInt(10);
        //System.out.println(n); //multiplicador aleatorio de potencia de golpe
        danioCausado1=jugador1.ataque(n);
        System.out.println(jugador1.toString());
        System.out.println("Daño causado por Jugador1: "+ danioCausado1);
                
        int n2 = aleatorio2.nextInt(10);
        //System.out.println(n2);
        danioCausado2=jugador2.ataque(n2);        
        System.out.println(jugador2.toString());
        System.out.println("Daño causado por Jugador2: "+ danioCausado2);
                
        stamina1=stamina1-danioCausado2;
        System.out.println("Vida restante del Jugador 1: "+stamina1);
        
        stamina2=stamina2-danioCausado1;
        System.out.println("Vida restante del Jugador 2: "+stamina2);
        
        ++round;
        
        }
        
        if (stamina1>stamina2) {
            System.out.println("Ganador el Jugador 1 ");
        } else if (stamina1==stamina2){
            System.out.println("Empate ");
        } else {
            System.out.println("Ganador el Jugador 2 ");
        }
    }
    
}
