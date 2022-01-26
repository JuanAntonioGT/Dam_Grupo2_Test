import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AsignarEquipoTest {

	 // Quiero comprobar que asignar un equipo con todos los campos de jugador sean correctos y se guarden.
	@Test
	void testSetJugadorTodoCorrecto() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();

		/*Creamos un jugador con todos los campos v�lidos*/

		Jugador jugador = new Jugador();
		String nombrevalido = "Maria";
		int edadValida = 32;
		String idiomaValido = "Espanol";

		jugador.setNombreJugador(nombrevalido);
		jugador.setEdad(edadValida);
		jugador.setIdioma(idiomaValido);

		/*Asignar el jugador creado en asignar equipo*/
		asignarEquipo.setJugador(jugador);

		Jugador jugadorGuardado = asignarEquipo.getJugador();

		assertNotNull(asignarEquipo.getJugador());
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

		Jugador jugador = new Jugador();
		String nombrevalido = "Artsiom";
		int edadValida = 28;
		String idiomaValido = "Espa�ol";

		jugador.setNombreJugador(nombrevalido);
		jugador.setEdad(edadValida);
		jugador.setIdioma(idiomaValido);

		asignarEquipo.setJugador(jugador);

		Jugador jugadorGuardado = asignarEquipo.getJugador();

		assertEquals(jugador,jugadorGuardado);
		assertEquals(jugador,jugadorGuardado.getNombreJugador());
		assertEquals(jugador,jugadorGuardado.getEdad());
		assertEquals(jugador,jugadorGuardado.getIdioma());
	}

	/**
	 * Se prueba Set nombre, para ver que el nombre esta mal puesto
	 */
	@Test
	void testSetNombreJugadorNombreIncorrecto() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();

		Jugador jugador = new Jugador();
		String nombreInvalido = "1234";
		int edadValida = 18;
		String idiomaValido = "Aleman";

		jugador.setNombreJugador(nombreInvalido);
		jugador.setEdad(edadValida);
		jugador.setIdioma(idiomaValido);

		asignarEquipo.setJugador(jugador);

		Jugador jugadorGuardado = asignarEquipo.getJugador();

		assertNull(jugadorGuardado);
		assertNull(jugadorGuardado.getNombreJugador());
		assertEquals(edadValida, jugadorGuardado.getEdad());
		assertEquals(idiomaValido, jugadorGuardado.getIdioma());
	}

	/**
	 * Se prueba Set nombre, para ver si el nombre esta vacio
	 */
	@Test
	void testSetNombreJugadorNombreVacio() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();

		Jugador jugador = new Jugador();
		String nombrevalido = "";
		int edadValida = 99;
		String idiomaValido = "Ingles";

		jugador.setNombreJugador(nombrevalido);
		jugador.setEdad(edadValida);
		jugador.setIdioma(idiomaValido);

		asignarEquipo.setJugador(jugador);

		Jugador jugadorGuardado = asignarEquipo.getJugador();

		assertNull(jugadorGuardado);
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

		Jugador jugador = new Jugador();
		String nombrevalido = "Maria";
		int edadValida = 15;
		String idiomaValido = "Espa�ol";

		jugador.setNombreJugador(nombrevalido);
		jugador.setEdad(edadValida);
		jugador.setIdioma(idiomaValido);

		asignarEquipo.setJugador(jugador);

		Jugador jugadorGuardado = asignarEquipo.getJugador();

		assertNull(jugadorGuardado);
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

		Jugador jugador = new Jugador();
		String nombrevalido = "Artsiom";
		String idiomaValido = "Aleman";

		jugador.setNombreJugador(nombrevalido);
		assertThrows(NullPointerException.class, () -> {
			int edadValida = (Integer) null;
			jugador.setEdad(edadValida);
		},"Solo puedes guardar n�meros");

		jugador.setIdioma(idiomaValido);

		asignarEquipo.setJugador(jugador);

		Jugador jugadorGuardado = asignarEquipo.getJugador();

		assertNull(jugadorGuardado);
		assertEquals(nombrevalido, jugadorGuardado.getNombreJugador());
		assertNull(jugadorGuardado.getEdad());
		assertEquals(idiomaValido, jugadorGuardado.getIdioma());
	}

	/**
	 * Se prueba Set nombre, para ver que idioma no es valido
	 */
	@Test
	void testSetNombreJugadorPruebaIdiomaNoValido() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();

		/*Creamos un jugador con todos los campos v�lidos*/
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

		assertNull(jugadorGuardado);
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

		Jugador jugador = new Jugador();
		String nombrevalido = "Antonio";
		int edadValida = 19;
		String idiomaValido = "";

		jugador.setNombreJugador(nombrevalido);
		jugador.setEdad(edadValida);
		jugador.setIdioma(idiomaValido);

		asignarEquipo.setJugador(jugador);

		Jugador jugadorGuardado = asignarEquipo.getJugador();

		assertNull(jugadorGuardado);
		assertEquals(nombrevalido, jugadorGuardado.getNombreJugador());
		assertEquals(edadValida, jugadorGuardado.getEdad());
		assertNull(jugadorGuardado.getIdioma());
	}


	/**
	 * En este caso voy a probar que no exista.
	 */
	@Test
	void testSetEquipoNoExista() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		Equipo equipo = null;

		asignarEquipo.setEquipo(equipo);

		Equipo equipoGuardado = asignarEquipo.getEquipo();
		assertNull(equipoGuardado);
	}

	/**
	 * Voy a comprobar que el equipo exista.
	 */
	@Test
	void testAsignarEquipoExista() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		Equipo equipo = new Equipo();
		String nombreEquipo= "Los chancletas";
		int ranking = 3;

		equipo.setNombreEquipo(nombreEquipo);
		equipo.setRanking(ranking);

		asignarEquipo.setEquipo(equipo);
		assertEquals(asignarEquipo.getEquipo(),equipo);
	}

	/**
	 * Si existe, pero menos de 4 caracteres
	 */
	@Test
	void testSetEquipoExistaNoValidoMenos() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();

		Equipo equipo = new Equipo();
		String nombreEquipo="Pac";
		int ranking = 3;
		equipo.setNombreEquipo(nombreEquipo);
		equipo.setRanking(ranking);

		asignarEquipo.setEquipo(equipo);

		assertEquals(null,asignarEquipo.getEquipo());
	}

	/**
	 * Si existe, y tiene 4 caracteres exactos.
	 */
	@Test
	void testSetEquipoExistaValido() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();

		Equipo equipo = new Equipo();
		String nombreEquipo="Juan";
		int ranking = 3;
		equipo.setNombreEquipo(nombreEquipo);
		equipo.setRanking(ranking);

		asignarEquipo.setEquipo(equipo);

		assertEquals(asignarEquipo.getEquipo(),equipo);
	}

	/**
	 * Si existe, y tiene mas de 4 caracteres .
	 */
	@Test
	void testSetEquipoExistaValidoMasDeCuatro() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		Equipo equipo = new Equipo();
		String nombreEquipo="Antonio";
		int ranking = 3;
		equipo.setNombreEquipo(nombreEquipo);
		equipo.setRanking(ranking);

		asignarEquipo.setEquipo(equipo);

		assertEquals(asignarEquipo.getEquipo(),equipo);
	}


	/**
	 * Si existe, pero tiene mas de 20 caracteres .
	 */
	@Test
	void testSetEquipoExistaNoValidoMasDeVeinte() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		Equipo equipo = new Equipo();
		String nombreEquipo="Pacolpacolpacolpacolpoloco";
		int ranking = 3;
		equipo.setNombreEquipo(nombreEquipo);
		equipo.setRanking(ranking);

		asignarEquipo.setEquipo(equipo);

		assertEquals(null,asignarEquipo.getEquipo());
	}

	/**
	 * Si existe equipo pero no tiene ranking
	 */
	@Test
	void testSetEquipoExistaSinRanking() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		Equipo equipo = new Equipo();
		String nombreEquipo="paco";

		equipo.setNombreEquipo(nombreEquipo);
		asignarEquipo.setEquipo(equipo);

		assertEquals(null,asignarEquipo.getEquipo());
	}

	/**
	 * Si existe, pero nombre est� vacio
	 */
	@Test
	void testSetEquipoNombreVacio() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		Equipo equipo = new Equipo();
		String nombreEquipo="";
		int ranking = 4;

		equipo.setNombreEquipo(nombreEquipo);
		equipo.setRanking(ranking);

		asignarEquipo.setEquipo(equipo);

		assertEquals(null,asignarEquipo.getEquipo());
	}

	/**
	 * Si existe, pero nombre es alfanumerico y por tanto invalido
	 */
	@Test
	void testSetEquipoExistaNombreInvalido() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();

		Equipo equipo = new Equipo();
		String nombreInvalido = "324143241";
		int ranking = 4;

		equipo.setNombreEquipo(nombreInvalido);
		equipo.setRanking(ranking);

		asignarEquipo.setEquipo(equipo);

		Equipo equipoGuardado = asignarEquipo.getEquipo();

		assertNull(equipoGuardado);
		assertEquals(null, equipo.getNombreEquipo());
		assertEquals(ranking, equipo.getRanking());

	}

	/**
	 * Si existe, pero ranking vacio
	 */
	@Test
	void testSetEquipoExistaRankingVacio() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();

		Equipo equipo = new Equipo();
		String nombreEquipo="Los chancletas";
		assertThrows(NullPointerException.class, () -> {
			int ranking = (Integer) null;
			equipo.setRanking(ranking);
		},"Solo puedes guardar n�meros");

		asignarEquipo.setEquipo(equipo);

		assertEquals(null,asignarEquipo.getEquipo());
	}

	/**
	 * Si existe, pero ranking invalido
	 */
	@Test
	void testSetEquipoExistaRankingInvalido() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		Equipo equipo = new Equipo();
		var nombreEquipo="Los Madriles";
		int ranking = -1;

		equipo.setNombreEquipo(nombreEquipo);
		equipo.setRanking(ranking);

		asignarEquipo.setEquipo(equipo);

		assertEquals(null,asignarEquipo.getEquipo());
	}
}