import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author ArtsiomKrautsouKharl
 *
 */
class AsignarEquipoTest {

	
	/**
	 * Se prueba Set nombre, para ver que existe en BDD y no puede estar metido
	 */
	@Test
	void testSetEquipoPruebaExistenciaBDD() {
		Jugador equipoUno = new Jugador();
	    Jugador equipoDos = new Jugador();
	    
		String e1nombre = "CasasCasasCasasCasasCasas";
		String e2nombre = "CasasCasasCasasCasasCasas";
		
		equipoUno.setNombreJugador(e1nombre);
		equipoDos.setNombreJugador(e2nombre);
		
		 assertEquals(null,equipoUno.getNombreJugador().equals(equipoDos.getNombreJugador()));
		 assertEquals(null,equipoUno.getNombreJugador().equals(equipoDos.getNombreJugador()));
		 assertEquals(null,equipoUno.getNombreJugador().equals(equipoDos.getNombreJugador()));
		
		/*fail("Not yet implemented");*/
	}
	
	/**
	 * Se prueba Set nombre, para ver que no existe en BDD
	 */
	@Test
	void testSetEquipoPruebaNoExistenciaBDD() {
		Equipo equipoUno = new Equipo();
	    Equipo equipoDos = new Equipo();
	    
		String e1nombre = "CasasCasasCasasCasasCasas";
		String e2nombre = "CasasCasasCasasCasas";
		
		equipoUno.setNombreEquipo(e1nombre);
		equipoDos.setNombreEquipo(e2nombre);
		
		 assertEquals(,equipoUno.getNombreEquipo().equals(equipoDos.getNombreEquipo()));
		
		/*fail("Not yet implemented");*/
	}
	
	/*========================================================*/
	/*========================================================*/
	/*========================================================*/
	

	
	
	/**
	 * Se prueba Set nombre, para ver que existe en BDD y que no se pueda introducir
	 */
	@Test
	void testSetNombreJugadorPruebaExistenciaBDD() {
		Jugador jugadorUno = new Jugador();
	    Jugador jugadorDos = new Jugador();
	    
		String j1nombre = "MariaMariaMariaMaria";
		String j2nombre = "MariaMariaMariaMaria";
		
		int edadj1 = 31;
	    int edadj2 = 31;
	    
	    String idiomaj1 = "Español";
	    String idiomaj2 = "Español";
	    
	    String idioma1 = "Ingles";
	    String idioma2 = "Frances";
	    String idioma3 = "Aleman";
	    String idioma4 = "Español";
	    
		jugadorUno.setNombreJugador(j1nombre);
		jugadorUno.setEdad(edadj1);
	    jugadorUno.setIdioma(idiomaj1);
	    
		jugadorDos.setNombreJugador(j2nombre);
		jugadorDos.setEdad(edadj2);
	    jugadorDos.setIdioma(idiomaj2);
	    
	   /* jugadorDos.setIdioma(jugadorDos.getIdioma()+idioma1);
        jugadorDos.setIdioma(jugadorDos.getIdioma()+idioma2);
        jugadorDos.setIdioma(jugadorDos.getIdioma()+idioma3);*/
		
		
	    assertAll("existencia",
	            () -> assertEquals(null,jugadorUno.getNombreJugador().equals(jugadorDos.getNombreJugador())),
	            () -> assertEquals(null,jugadorDos.getEdad() == jugadorUno.getEdad()),
	            () -> assertEquals(null, jugadorUno.getIdioma().equals(jugadorDos.getIdioma())));
		
		/*fail("Not yet implemented");*/
	}
	
	/**
	 * Se prueba Set nombre, para ver que no existe en BDD
	 */
	@Test
	void testSetNombreJugadorPruebaNoExistenciaBDD() {
		Jugador jugadorUno = new Jugador();
	    Jugador jugadorDos = new Jugador();
	    
		String j1nombre = "MariaMariaMariaMaria";
		String j2nombre = "MariaMariaMaria";
		
		int edadj1 = 31;
	    int edadj2 = 31;
	    
	    String idiomaj1 = "Español";
	    String idiomaj2 = "Español";
	    
	    String idioma1 = "Ingles";
	    String idioma2 = "Frances";
	    String idioma3 = "Aleman";
	    String idioma4 = "Español";
	    
		jugadorUno.setNombreJugador(j1nombre);
		jugadorUno.setEdad(edadj1);
	    jugadorUno.setIdioma(idiomaj1);
	    
		jugadorDos.setNombreJugador(j2nombre);
		jugadorUno.setEdad(edadj2);
	    jugadorUno.setIdioma(idiomaj2);
		
		
	    assertAll("existencia",
	            () -> assertFalse(jugadorUno.getNombreJugador().equals(jugadorDos.getNombreJugador())),
	            () -> assertEquals(edadj2,jugadorDos.getEdad()),
	            () -> assertEquals(idiomaj2,jugadorDos.getIdioma()));
		
		/*fail("Not yet implemented");*/
	}
	
	/**
	 * Se prueba Set nombre, para ver que el nombre esta mal puesto
	 */
	@Test
	void testSetNombreJugadorNombreIncorrecto() {
		Jugador jugadorUno = new Jugador();
	    Jugador jugadorDos = new Jugador();
	    
		String j1nombre = "MariaMariaMariaMaria";
		String j2nombre = "1234";
		
		int edadj1 = 31;
	    int edadj2 = 30;
	    
	    String idiomaj1 = "Español";
	    String idiomaj2 = "Español";
	    
	    String idioma1 = "Ingles";
	    String idioma2 = "Frances";
	    String idioma3 = "Aleman";
	    String idioma4 = "Español";
	    
		jugadorUno.setNombreJugador(j1nombre);
		jugadorUno.setEdad(edadj1);
	    jugadorUno.setIdioma(idiomaj1);
	    
		jugadorDos.setNombreJugador(j2nombre);
		jugadorUno.setEdad(edadj2);
	    jugadorUno.setIdioma(idiomaj2);
		
		
	    assertAll("existencia",
	            () -> assertEquals(null,jugadorUno.getNombreJugador()),
	            () -> assertEquals(edadj2,jugadorDos.getEdad()),
	            () -> assertEquals(idiomaj2,jugadorDos.getIdioma());
		
		/*fail("Not yet implemented");*/
	}
	
	/**
	 * Se prueba Set nombre, para ver si el nombre esta vacio
	 */
	@Test
	void testSetNombreJugadorNombreVacio() {
		Jugador jugadorUno = new Jugador();
	    Jugador jugadorDos = new Jugador();
	    
		String j1nombre = "MariaMariaMariaMaria";
		String j2nombre = " ";
		
		int edadj1 = 31;
	    int edadj2 = 30;
	    
	    String idiomaj1 = "Español";
	    String idiomaj2 = "Español";
	    
	    String idioma1 = "Ingles";
	    String idioma2 = "Frances";
	    String idioma3 = "Aleman";
	    String idioma4 = "Español";
	    
		jugadorUno.setNombreJugador(j1nombre);
		jugadorUno.setEdad(edadj1);
	    jugadorUno.setIdioma(idiomaj1);
	    
		jugadorDos.setNombreJugador(j2nombre);
		jugadorUno.setEdad(edadj2);
	    jugadorUno.setIdioma(idiomaj2);
		
		
	    assertAll("existencia",
	            () -> assertEquals(null,jugadorUno.getNombreJugador()),
	            () -> assertEquals(edadj2,jugadorDos.getEdad()),
	            () -> assertEquals(idiomaj2,jugadorDos.getIdioma());
		
		/*fail("Not yet implemented");*/
	}
	
	/**
	 * Se prueba Set nombre, para ver edad no valida
	 */
	@Test
	void testSetNombreJugadorPruebaEdadNoValida() {
		Jugador jugadorUno = new Jugador();
	    Jugador jugadorDos = new Jugador();
	    
		String j1nombre = "MariaMariaMariaMaria";
		String j2nombre = "MariaMariaMaria";
		
		int edadj1 = 31;
	    int edadj2 = 'a';
	    
	    String idiomaj1 = "Español";
	    String idiomaj2 = "Español";
	    
	    String idioma1 = "Ingles";
	    String idioma2 = "Frances";
	    String idioma3 = "Aleman";
	    String idioma4 = "Español";
	    
		jugadorUno.setNombreJugador(j1nombre);
		jugadorUno.setEdad(edadj1);
	    jugadorUno.setIdioma(idiomaj1);
	    
		jugadorDos.setNombreJugador(j2nombre);
		jugadorUno.setEdad(edadj2);
	    jugadorUno.setIdioma(idiomaj2);
		
		
	    assertAll("existencia",
	            () -> assertEquals(j2nombre,jugadorDos.getNombreJugador()),
	            () -> assertEquals(null,jugadorDos.getEdad()),
	            () -> assertEquals(idiomaj2,jugadorDos.getIdioma());
		
		/*fail("Not yet implemented");*/
	}
	
	/**
	 * Se prueba Set nombre, para ver que no tenga edad
	 */
	@Test
	void testSetNombreJugadorPruebaNoHayEdad() {
		Jugador jugadorUno = new Jugador();
	    Jugador jugadorDos = new Jugador();
	    
		String j1nombre = "MariaMariaMariaMaria";
		String j2nombre = "MariaMariaMaria";
		
		int edadj1 = 31;
	    int edadj2 ;
	    
	    String idiomaj1 = "Español";
	    String idiomaj2 = "Español";
	    
	    String idioma1 = "Ingles";
	    String idioma2 = "Frances";
	    String idioma3 = "Aleman";
	    String idioma4 = "Español";
	    
		jugadorUno.setNombreJugador(j1nombre);
		jugadorUno.setEdad(edadj1);
	    jugadorUno.setIdioma(idiomaj1);
	    
		jugadorDos.setNombreJugador(j2nombre);
		jugadorUno.setEdad(edadj2);
	    jugadorUno.setIdioma(idiomaj2);
		
		
	    assertAll("existencia",
	            () -> assertEquals(j2nombre,jugadorDos.getNombreJugador()),
	            () -> assertEquals(null,jugadorUno.getEdad() != jugadorDos.getEdad()),
	            () -> assertEquals(idiomaj2,jugadorDos.getIdioma());
		
		/*fail("Not yet implemented");*/
	}
	
	/**
	 * Se prueba Set nombre, para ver que idioma no es valido
	 */
	@Test
	void testSetNombreJugadorPruebaIdiomaNoValido() {
		Jugador jugadorUno = new Jugador();
	    Jugador jugadorDos = new Jugador();
	    
		String j1nombre = "MariaMariaMariaMaria";
		String j2nombre = "MariaMariaMaria";
		
		int edadj1 = 31;
	    int edadj2 = 30;
	    
	    String idiomaj1 = "Español";
	    String idiomaj2 = "Japones";
	    
	    String idioma1 = "Ingles";
	    String idioma2 = "Frances";
	    String idioma3 = "Aleman";
	    String idioma4 = "Español";
	    
		jugadorUno.setNombreJugador(j1nombre);
		jugadorUno.setEdad(edadj1);
	    jugadorUno.setIdioma(idiomaj1);
		jugadorDos.setNombreJugador(j2nombre);
		jugadorUno.setEdad(edadj2);
	    jugadorUno.setIdioma(idiomaj2);
		
		
	    assertAll("existencia",
	            () -> assertEquals(j2nombre,jugadorDos.getNombreJugador()),
	            () -> assertEquals(edadj2,jugadorDos.getEdad()),
	            () -> assertEquals(null,jugadorDos.getIdioma());
		
		/*fail("Not yet implemented");*/
	}
	
	/**
	 * Se prueba Set nombre, para ver que no hay idioma
	 */
	@Test
	void testSetNombreJugadorPruebaNoHayIdioma() {
		Jugador jugadorUno = new Jugador();
	    Jugador jugadorDos = new Jugador();
	    
		String j1nombre = "MariaMariaMariaMaria";
		String j2nombre = "MariaMariaMaria";
		
		int edadj1 = 31;
	    int edadj2 = 30;
	    
	    String idiomaj1 = "Español";
	    String idiomaj2 = " ";
	    
	    String idioma1 = "Ingles";
	    String idioma2 = "Frances";
	    String idioma3 = "Aleman";
	    String idioma4 = "Español";
	    
		jugadorUno.setNombreJugador(j1nombre);
		jugadorUno.setEdad(edadj1);
	    jugadorUno.setIdioma(idiomaj1);
	    
		jugadorDos.setNombreJugador(j2nombre);
		jugadorUno.setEdad(edadj2);
	    jugadorUno.setIdioma(idiomaj2);
		
		
	    assertAll("existencia",
	            () -> assertEquals(j2nombre,jugadorDos.getNombreJugador()),
	            () -> assertEquals(edadj2,jugadorDos.getEdad()),
	            () -> assertEquals(null,jugadorDos.getIdioma());
		
		/*fail("Not yet implemented");*/
	}
}
