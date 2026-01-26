package ejercicios.ejercicios27;

public class Partido {
	
	
	private Equipo equipoLocal;
	private Equipo equipoVisitante;
	private Resultado resultado;
	
	
	public Partido() {

	}
	
	public String toString() {
		return equipoLocal+" vs "+equipoVisitante;
	}
	
	String cadena= "EMPATE";
	public String getEquipoGanador() {
		if(resultado.isVictoriaLocal()) {
			return "Equipo Local ganador: "+equipoLocal;
		}
		if(resultado.isVictoriaVisitante()) {
			return "Equipo Visitante ganador: "+equipoVisitante;
		}else
		
		return cadena;
	}
	
	
	
	
	

}
