import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


	
	/*========================================================*/
	/*========================================================*/
	/*========================================================*/
	

	
	
	/**
	 * Asignar jugador que exista y tenga todos los campos válidos
	 */
    @Test
    void testSetJugadorTodoCorrecto() {

        AsignarEquipo asignarEquipo = new AsignarEquipo();

        /*Creamos un jugador con todos los campos válidos*/
        Jugador jugador = new Jugador();
        String nombrevalido = "Maria";
        int edadValida = 32;
        String idiomaValido = "Español";
        
        jugador.setNombreJugador(nombrevalido);
        jugador.setEdad(edadValida);
        jugador.setIdioma(idiomaValido);

        /*Asignar el jugador creado en asignar equipo*/
        asignarEquipo.setJugador(jugador);

        Jugador jugadorGuardado = asignarEquipo.getJugador();
       
        assertNotNull(jugadorGuardado);
        assertEquals(nombrevalido, jugadorGuardado.getNombreJugador());
        assertEquals(edadValida, jugadorGuardado.getEdad());
        assertEquals(idiomaValido, jugadorGuardado.getIdioma());
    }
	
	
	/**
	 * Se prueba Set nombre, para ver que no existe en BDD
	 */
	@Test
	void testSetNombreJugadorPruebaNoExistenciaBDD() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();

        /*Creamos un jugador con todos los campos válidos*/
        Jugador jugador = new Jugador();
        String nombrevalido = "";
        int edadValida = 0;
        String idiomaValido = "";
        
        jugador.setNombreJugador(nombrevalido);
        jugador.setEdad(edadValida);
        jugador.setIdioma(idiomaValido);

        /*Asignar el jugador creado en asignar equipo*/
        asignarEquipo.setJugador(jugador);

        Jugador jugadorGuardado = asignarEquipo.getJugador();
       
        assertNotNull(jugadorGuardado);
        assertEquals(null, jugadorGuardado.getNombreJugador());
        assertEquals(0, jugadorGuardado.getEdad());
        assertEquals(null, jugadorGuardado.getIdioma());
	}
	
	/**
	 * Se prueba Set nombre, para ver que el nombre esta mal puesto
	 */
	@Test
	void testSetNombreJugadorNombreIncorrecto() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();

        /*Creamos un jugador con todos los campos válidos*/
        Jugador jugador = new Jugador();
        String nombrevalido = "1234";
        int edadValida = 18;
        String idiomaValido = "Aleman";
        
        jugador.setNombreJugador(nombrevalido);
        jugador.setEdad(edadValida);
        jugador.setIdioma(idiomaValido);

        /*Asignar el jugador creado en asignar equipo*/
        asignarEquipo.setJugador(jugador);

        Jugador jugadorGuardado = asignarEquipo.getJugador();
       
        assertNotNull(jugadorGuardado);
        assertEquals(null, jugadorGuardado.getNombreJugador());
        assertEquals(edadValida, jugadorGuardado.getEdad());
        assertEquals(idiomaValido, jugadorGuardado.getIdioma());
	}
	
	/**
	 * Se prueba Set nombre, para ver si el nombre esta vacio
	 */
	@Test
	void testSetNombreJugadorNombreVacio() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();

        /*Creamos un jugador con todos los campos válidos*/
        Jugador jugador = new Jugador();
        String nombrevalido = "";
        int edadValida = 99;
        String idiomaValido = "Ingles";
        
        jugador.setNombreJugador(nombrevalido);
        jugador.setEdad(edadValida);
        jugador.setIdioma(idiomaValido);

        /*Asignar el jugador creado en asignar equipo*/
        asignarEquipo.setJugador(jugador);

        Jugador jugadorGuardado = asignarEquipo.getJugador();
       
        assertNotNull(jugadorGuardado);
        assertEquals(null, jugadorGuardado.getNombreJugador());
        assertEquals(edadValida, jugadorGuardado.getEdad());
        assertEquals(idiomaValido, jugadorGuardado.getIdioma());
	}
	
	/**
	 * Se prueba Set nombre, para ver edad no valida
	 */
	@Test
	void testSetNombreJugadorPruebaEdadNoValida() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();

        /*Creamos un jugador con todos los campos válidos*/
        Jugador jugador = new Jugador();
        String nombrevalido = "Maria";
        int edadValida = 15;
        String idiomaValido = "Español";
        
        jugador.setNombreJugador(nombrevalido);
        jugador.setEdad(edadValida);
        jugador.setIdioma(idiomaValido);

        /*Asignar el jugador creado en asignar equipo*/
        asignarEquipo.setJugador(jugador);

        Jugador jugadorGuardado = asignarEquipo.getJugador();
       
        assertNotNull(jugadorGuardado);
        assertEquals(nombrevalido, jugadorGuardado.getNombreJugador());
        assertEquals(0, jugadorGuardado.getEdad());
        assertEquals(idiomaValido, jugadorGuardado.getIdioma());
	}
	
	/**
	 * Se prueba Set nombre, para ver que no tenga edad
	 */
	@Test
	void testSetNombreJugadorPruebaNoHayEdad() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();

        /*Creamos un jugador con todos los campos válidos*/
        Jugador jugador = new Jugador();
        String nombrevalido = "Artsiom";
        int edadValida = 0;
        String idiomaValido = "Aleman";
        
        jugador.setNombreJugador(nombrevalido);
        jugador.setEdad(edadValida);
        jugador.setIdioma(idiomaValido);

        /*Asignar el jugador creado en asignar equipo*/
        asignarEquipo.setJugador(jugador);

        Jugador jugadorGuardado = asignarEquipo.getJugador();
       
        assertNotNull(jugadorGuardado);
        assertEquals(nombrevalido, jugadorGuardado.getNombreJugador());
        assertEquals(0, jugadorGuardado.getEdad());
        assertEquals(idiomaValido, jugadorGuardado.getIdioma());
	}
	
	/**
	 * Se prueba Set nombre, para ver que idioma no es valido
	 */
	@Test
	void testSetNombreJugadorPruebaIdiomaNoValido() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();

        /*Creamos un jugador con todos los campos válidos*/
        Jugador jugador = new Jugador();
        String nombrevalido = "Artsiom";
        int edadValida = 50;
        String idiomaValido = "Japones";
        
        jugador.setNombreJugador(nombrevalido);
        jugador.setEdad(edadValida);
        jugador.setIdioma(idiomaValido);

        /*Asignar el jugador creado en asignar equipo*/
        asignarEquipo.setJugador(jugador);

        Jugador jugadorGuardado = asignarEquipo.getJugador();
       
        assertNotNull(jugadorGuardado);
        assertEquals(nombrevalido, jugadorGuardado.getNombreJugador());
        assertEquals(edadValida, jugadorGuardado.getEdad());
        assertEquals(null, jugadorGuardado.getIdioma());
	}
	
	/**
	 * Se prueba Set nombre, para ver que no hay idioma
	 */
	@Test
	void testSetNombreJugadorPruebaNoHayIdioma() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();

        /*Creamos un jugador con todos los campos válidos*/
        Jugador jugador = new Jugador();
        String nombrevalido = "Antonio";
        int edadValida = 19;
        String idiomaValido = "";
        
        jugador.setNombreJugador(nombrevalido);
        jugador.setEdad(edadValida);
        jugador.setIdioma(idiomaValido);

        /*Asignar el jugador creado en asignar equipo*/
        asignarEquipo.setJugador(jugador);

        Jugador jugadorGuardado = asignarEquipo.getJugador();
       
        assertNotNull(jugadorGuardado);
        assertEquals(nombrevalido, jugadorGuardado.getNombreJugador());
        assertEquals(edadValida, jugadorGuardado.getEdad());
        assertEquals(idiomaValido, jugadorGuardado.getIdioma());
	}
}
