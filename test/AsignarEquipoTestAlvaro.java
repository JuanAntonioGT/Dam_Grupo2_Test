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
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		Equipo equipo = new Equipo();
		String nombreEquipo= "Los chancletas";
		
	
		asignarEquipo.setEquipo(equipo);
				
		assertEquals(nombreEquipo,equipo.getNombreEquipo());
		
		
	}

	/**
	 * En este caso voy a probar que no exista.
	 */
	@Test
	void testSetEquipoNoExista() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		Equipo equipo = new Equipo();
		String nombreEquipo="12";
		asignarEquipo.setEquipo(equipo);
		equipo.setNombreEquipo(nombreEquipo);
		assertEquals(null,equipo.getNombreEquipo());
	}

	/**
	 * Si existe, pero menos de 4 caracteres
	 */
	@Test
	void testSetEquipoExistaNoValidoMenos() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		Equipo equipo = new Equipo();
		String nombreEquipo="Pac";
		asignarEquipo.setEquipo(equipo);
		equipo.setNombreEquipo(nombreEquipo);
		assertEquals(null,equipo.getNombreEquipo());
	}
	
	/**
	 * Si existe, y tiene 4 caracteres exactos.
	 */
	@Test
	void testSetEquipoExistaValido() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		Equipo equipo = new Equipo();
		String nombreEquipo="Paco";
		asignarEquipo.setEquipo(equipo);
		equipo.setNombreEquipo(nombreEquipo);
		assertEquals(nombreEquipo,equipo.getNombreEquipo());
	}
	
	/**
	 * Si existe, y tiene mas de 4 caracteres .
	 */
	@Test
	void testSetEquipoExistaValidoMasDeCuatro() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		Equipo equipo = new Equipo();
		String nombreEquipo="Pacolo";
		asignarEquipo.setEquipo(equipo);
		equipo.setNombreEquipo(nombreEquipo);
		assertEquals(nombreEquipo,equipo.getNombreEquipo());
	}
	
	/**
	 * Si existe, y tiene maximo 20 caracteres .
	 */
	@Test
	void testSetEquipoExistaValidoVeinte() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		Equipo equipo = new Equipo();
		String nombreEquipo="Pacolpacolpacolpacol";
		asignarEquipo.setEquipo(equipo);
		equipo.setNombreEquipo(nombreEquipo);
		assertEquals(nombreEquipo,equipo.getNombreEquipo());
	}
	
	/**
	 * Si existe, pero tiene mas de 20 caracteres .
	 */
	@Test
	void testSetEquipoExistaNoValidoMasDeVeinte() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		Equipo equipo = new Equipo();
		String nombreEquipo="Pacolpacolpacolpacol";
		asignarEquipo.setEquipo(equipo);
		equipo.setNombreEquipo(nombreEquipo);
		assertEquals(null,equipo.getNombreEquipo());
	}
	/**
	 * Si existe, pero no tiene ranking
	 */
	@Test
	void testSetEquipoExistaNoRanking() {
		Equipo equipo = new Equipo();
		String nombreEquipo="paco";
		int ranking=12;
		equipo.setRanking(ranking);
		equipo.setNombreEquipo(nombreEquipo);
		assertEquals(null,equipo.setRanking(ranking));
		assertEquals(nombreEquipo,equipo.getNombreEquipo());
	}
	


	/**
	 * Si existe, pero nombre está vacio
	 */
	@Test
	void testSetEquipoExistaVacio() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
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
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		asignarEquipo.setEquipo(equipo);
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
