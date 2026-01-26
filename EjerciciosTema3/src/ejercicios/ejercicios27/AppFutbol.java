package ejercicios.ejercicios27;

import java.util.ArrayList;
import java.util.List;

public class AppFutbol {

	public static void main(String[] args) {

		
		ArrayList<Jugador> jugadoresA = new ArrayList<>();
		ArrayList<Jugador> jugadoresB = new ArrayList<>();
		
		
		
		
		Equipo equipoA=new Equipo("Real Madrid");
		Jugador jugadorA1=new Jugador("Cristiano",1);
		Jugador jugadorA2=new Jugador("Ramos",2);
		Jugador jugadorA3=new Jugador("Vinicius",3);
		jugadoresA.add(jugadorA1);
		jugadoresA.add(jugadorA2);
		jugadoresA.add(jugadorA3);
		equipoA.setJugadores(jugadoresA);
		
		Equipo equipoB=new Equipo("Barcelona");

		Jugador jugadorB1=new Jugador("Messi",1);
		Jugador jugadorB2=new Jugador("Lamine",2);
		Jugador jugadorB3=new Jugador("Vinicius",3);
		jugadoresB.add(jugadorB1);
		jugadoresB.add(jugadorB2);
		jugadoresB.add(jugadorB3);
		equipoB.setJugadores(jugadoresB);
		equipoA.setCapitan(jugadoresA.get(0));
		equipoB.setCapitan(jugadoresB.get(0));
		
		
		System.out.println(equipoA);
		System.out.println(equipoB);
		
		
		System.out.println("PARTIDO ENTRE BARCELONA Y MADRID");
		
		Partido partido = new Partido();
		Resultado resultado= new Resultado();
		resultado.toString();
		
		
		
		
	}

}
