
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
/**
 * @author Alberto
 *
 */
	class EquipoTest {
		
	/**
	 * Set nombre debe ser de tipo texto sin otro tipo de caracteres
	 */
	@Test	
	void testSetNombreEquipoValido() {
	
	Equipo equipo = new Equipo ();
	String nombreEquipo = "Equipito";
	equipo.setNombreEquipo(nombreEquipo);
	assertEquals(nombreEquipo, equipo.getNombreEquipo());
	
	}

	/**
	 * Set nombre debe comprobarse que no se guarde el nombre por contener caracteres númericos
	 */
	@Test	
	void testSetNombreEquipoInvalidNumeros() {
	
	Equipo equipo = new Equipo ();
	String nombreEquipo = "123456";
	equipo.setNombreEquipo(nombreEquipo);
	assertEquals(null, equipo.getNombreEquipo());
	
	}
	
	
	/**
	 * Set nombre debe comprobarse que se guarde el resultado con el mínimo de caracteres establecidos (4)
	 */
	@Test	
	void testSetNombreEquipoValidoIgualAMinimo() {
	
	Equipo equipo = new Equipo ();
	String nombreEquipo = "Casa";
	equipo.setNombreEquipo(nombreEquipo);
	assertEquals(nombreEquipo, equipo.getNombreEquipo());
	
	}
	
	/**
	 * Set nombre debe comprobarse que se guarde el resultado con el máximo de caracteres establecidos (20)
	 */
	@Test	
	void testSetNombreEquipoValidoIgualAMaximo() {
	
	Equipo equipo = new Equipo ();
	String nombreEquipo = "holaquetalelmaximoes";
	equipo.setNombreEquipo(nombreEquipo);
	assertEquals(nombreEquipo, equipo.getNombreEquipo());
	
	}

	
	/**
	 * Set nombre debe comprobarse que no se guarde el resultado por encima del máximo de caracteres establecidos (+ de 20)
	 */
	@Test	
	void testSetNombreEquipoInvalidoMayorAlMaximo() {
	
	Equipo equipo = new Equipo ();
	String nombreEquipo = "equipodefutbolfederaldevoleybolydewaterpolo";
	equipo.setNombreEquipo(nombreEquipo);
	assertEquals(null, equipo.getNombreEquipo());
	
	}
	
	/**
	 * Set nombre debe comprobarse que no se guarde el resultado por tener menos caracteres a los establecidos (0 o 1 o 2 o 3)
	 */
	@Test	
	void testSetNombreEquipoInferiorAMinimo() {
	
	Equipo equipo = new Equipo ();
	String nombre = "Siv";
	equipo.setNombreEquipo(nombre);
	assertEquals(null, equipo.getNombreEquipo());
	
	}

	/**
	 * Set nombre debe comprobarse que se guarde el resultado con entre el maximo y minimo de caracteres establecidos (20-4)
	 */
	@Test	
	void testSetNombreEquipoValidoMenorAMaximo() {
	
	Equipo equipo = new Equipo ();
	String nombreEquipo = "Equipo";
	equipo.setNombreEquipo(nombreEquipo);
	assertEquals(nombreEquipo, equipo.getNombreEquipo());
	
	}


	/**
	 * Set ranking debe comprobar que lo que se introduzca sea de tipo decimal
	 */
	@Test
	void testSetRankingDecimales() {
		Equipo equipo = new Equipo ();
		double ranking = 1.01;
		equipo.setRanking((int) ranking);
		assertEquals(ranking, equipo.getRanking());
	}
	
	/**
	 * Set ranking debe comprobar que si el caracter es de tipo no decimal no se guarde
	 */
	@Test
	void testSetRankingConLetras() {
		Equipo equipo = new Equipo ();
		int ranking = 1;
		equipo.setRanking(ranking);
		assertEquals(0, equipo.getRanking());
	}
		

	
	/**
	 * Set ranking debe comprobar que el número que se introduzca sea mayor que -1 y menor a 11 y se guarde
	 */
	@Test
	void testSetRankingMayorQue0() {
		Equipo equipo = new Equipo ();
		int ranking = 5;
		equipo.setRanking(ranking);
		assertEquals(ranking, equipo.getRanking());
	}
	
	
	/**
	 * Set ranking debe comprobar que el número que se introduzca sea menor que 0 y no se guarde
	 */
	@Test
	void testSetRankingMenorQue0() {
		Equipo equipo = new Equipo ();
		int ranking = -1;
		equipo.setRanking(ranking);
		assertEquals(0, equipo.getRanking());
	}
	
	/**
	 * Set ranking debe comprobar que el número que se introduzca sea igual que 0 y se guarde
	 */
	@Test
	void testSetRankingIgualQue0() {
		Equipo equipo = new Equipo ();
		int ranking = 0;
		equipo.setRanking(ranking);
		assertEquals(ranking, equipo.getRanking());
	}
	
	/**
	 * Set ranking debe comprobar que el número que se introduzca sea igual que 10 y se guarde
	 */
	@Test
	void testSetRankingIgualQue10() {
		Equipo equipo = new Equipo ();
		int ranking = 10;
		equipo.setRanking(ranking);
		assertEquals(ranking, equipo.getRanking());
	}

	/**
	 * Set ranking debe comprobar que el número que se introduzca sea mayor que 10 y no se guarde
	 */
	@Test
	void testSetRankingMayorQue10() {
		Equipo equipo = new Equipo ();
		int ranking = 11;
		equipo.setRanking(ranking);
		assertEquals(0, equipo.getRanking());
	}

}