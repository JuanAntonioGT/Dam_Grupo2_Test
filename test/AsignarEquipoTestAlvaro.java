import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author Alvaro
 *
 */
class AsignarEquipoTestAlvaro {

	/**
	 * Voy a comprobar que el equipo exista.
	 */
	@Test
	void testAsignarEquipoExista() {
		Equipo equipo = new Equipo();
		String nombreEquipo= "Los chancletas";
		
		equipo.setNombreEquipo(nombreEquipo);
		assertEquals(nombreEquipo,equipo.getNombreEquipo());
		
		
	}

	/**
	 * En este caso voy a probar que no exista.
	 */
	@Test
	void testSetEquipoNoExista() {
		Equipo equipo = new Equipo();
		String nombreEquipo="sdfghsdfg";
		
		equipo.setNombreEquipo(nombreEquipo);
		assertEquals(null,equipo.getNombreEquipo());
	}

	/**
	 * Si existe, pero valor es nulo en nombre, menos de 4 caracteres
	 */
	@Test
	void testSetEquipoExistaNoValido() {
		Equipo equipo = new Equipo();
		String nombreEquipo="Pac";
		
		equipo.setNombreEquipo(nombreEquipo);
		assertEquals(null,equipo.getNombreEquipo());
	}
	
	/**
	 * Si existe, pero no tiene ranking
	 */
	@Test
	void testSetEquipoExistaNoRanking() {
		Equipo equipo = new Equipo();
		String nombreEquipo="asdgfasdg";
		
		equipo.setNombreEquipo(nombreEquipo);
		assertEquals(null,equipo.getNombreEquipo());
	}
	
	/**
	 * Si existe, pero nombre está vacio
	 */
	@Test
	void testSetEquipoExistaVacio() {
		Equipo equipo = new Equipo();
		String nombreEquipo="";
		
		equipo.setNombreEquipo(nombreEquipo);
		assertEquals(null,equipo.getNombreEquipo());
	}
	
	/**
	 * Si existe, pero nombre es alfanumerico y por tanto invalido
	 */
	@Test
	void testSetEquipoExistaNombrreInvalido() {
		Equipo equipo = new Equipo();
		var nombreEquipo="12advbfasdgvas";
		
		equipo.setNombreEquipo(nombreEquipo);
		assertEquals(null,equipo.getNombreEquipo());
	}
	/**
	 * Si existe, pero ranking vacio
	 */
	@Test
	void testSetEquipoExistaRankingVacio() {
		Equipo equipo = new Equipo();
		String nombreEquipo="Los chancletas";
		
		int ranking;
		
		equipo.setNombreEquipo(nombreEquipo);
		assertEquals(nombreEquipo,equipo.getNombreEquipo());
	
		assertEquals(null,ranking.getRanking());
	}
	
	/**
	 * Si existe, pero ranking invalido
	 */
	@Test
	void testSetEquipoExistaRankingInvalido() {
		Equipo equipo = new Equipo();
		String nombreEquipo="Los chancletas";
		int ranking=(Integer) null;
		
		equipo.setNombreEquipo(nombreEquipo);
		assertEquals(nombreEquipo,equipo.getNombreEquipo());
		assertEquals(null,ranking.getRanking());
	}
}
