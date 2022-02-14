package entornos;
// TODO: Auto-generated Javadoc

/**
 * The Class Equipo.
 * @author Alvaro Martin Bazan
 * @author Alberto Morales Galvez
 * @version 14/02/2022
 */
public class Equipo {

	/** The nombre equipo. */
	private String nombreEquipo;
	
	/** The ranking. */
	private int ranking;

	/**
	 * Sets the nombre equipo.
	 *
	 * @param nombreEquipo the new nombre equipo
	 */
	public void setNombreEquipo(String nombreEquipo) {
		//Comprobamos si es null
		if (isValidated(nombreEquipo)){
			//Comprobamos el Rango
			if (isInRange(nombreEquipo)) {
				//Comprobamos que sea del abecedario español
				if (isWord(nombreEquipo)){
					String nombreEquipoMayus = nombreEquipo.toUpperCase();
					this.nombreEquipo = nombreEquipoMayus;
				}
			}
		}
	}

	/**
	 * Gets the nombre equipo.
	 *
	 * @return the nombre equipo
	 */
	public String getNombreEquipo() {
		return nombreEquipo;
	}


	/**
	 * Gets the ranking.
	 *
	 * @return the ranking
	 */
	public int getRanking() {
		return ranking;
	}

	/**
	 * Sets the ranking.
	 *
	 * @param ranking the new ranking
	 */
	public void setRanking(int ranking) {
		if (isEntire(ranking)){
			if (isRankingInRange(ranking)) {
				this.ranking = ranking;
			}
		}
	}

	/**
	 * Gets the categoria equipo.
	 *
	 * @return the categoria equipo
	 */
	// Author: alvaro martin bazan
	public String getCategoriaEquipo() {
		return categoria();
	}

	/**
	 * Categoria.
	 *
	 * @return the string
	 */
	private String categoria(){
		String tercera = "Tercera";
		String segunda = "Segunda";
		String primera = "Primera";
		String retorno = null;

		//En esta parte definimos la categoria segun su ranking
		int minimoTerceraCategoria = 1;
		int maximoTerceraCategoria= 3;

		int minimoSegundaCategoria = 3;
		int maximoSegundaCategoria= 6;

		int minimoPrimeraCategoria = 7;
		int maximoPrimeraCategoria= 10;


		if (isValidated(nombreEquipo)){

			if(this.ranking>=minimoTerceraCategoria && this.ranking<maximoTerceraCategoria){
				retorno =  tercera;
			}else if(this.ranking>=minimoSegundaCategoria && this.ranking <=maximoSegundaCategoria){
				retorno = segunda;
			}else if(this.ranking>=minimoPrimeraCategoria && this.ranking <=maximoPrimeraCategoria){
				retorno = primera;
			}
		}
		return retorno;
	}

	/**
	 * Checks if is validated.
	 *
	 * @param nombreEquipo the nombre equipo
	 * @return true, if is validated
	 */
	//Nos devuelve true si no es nulo.
	private boolean isValidated(String nombreEquipo) {
		boolean isValidated = true;
		if(nombreEquipo==null) {
			isValidated= false;
		} else {
			isValidated= true;
		} return isValidated;
	}

	/**
	 * Checks if is in range.
	 *
	 * @param nombreEquipo the nombre equipo
	 * @return true, if is in range
	 */
	//Nos devuelve true si está en rango la longitud de la palabra
	private boolean isInRange(String nombreEquipo) {
		int nombreMinimo = 4;
		int nombreMaximo = 20;
		boolean isInRage = false;

		if (nombreEquipo.length() >= nombreMinimo && nombreEquipo.length() <= nombreMaximo) {
			isInRage= true;
		} else {
			isInRage = false;
		}

		return isInRage;
	}

	/**
	 * Checks if is word.
	 *
	 * @param comprobar the comprobar
	 * @return true, if is word
	 */
	//Nos devuelve true si una letra del abecedario español
	private boolean isWord(String comprobar){
		char a = 65;
		char z = 90;
		char espacio = 32;
		char cero = 48;
		char nueve = 57;
		boolean inWord = true;

		comprobar = comprobar.toUpperCase();

		for (int i = 0; i < comprobar.length(); i++) {
			char c = comprobar.charAt(i);
			if (!(c >= a && c <= z || c==espacio)) {
				inWord =  false;
				i = comprobar.length()+1;
			}
			if (c>= cero && c <= nueve){
				inWord = false;
				i = comprobar.length()+1;
			}
		}

		return inWord;
	}

	/**
	 * Checks if is entire.
	 *
	 * @param ranking the ranking
	 * @return true, if is entire
	 */
	//Nos devuelve true si es un numero entero
	private boolean isEntire(int ranking) {
		boolean isEntire = true;

		if(ranking%1 != 0) {
			isEntire= false;

		} else {
			isEntire = true;

		}
		return isEntire;
	}

	/**
	 * Checks if is ranking in range.
	 *
	 * @param ranking the ranking
	 * @return true, if is ranking in range
	 */
	//Nos devuelve true si está en el rango de ranking
	private boolean isRankingInRange(int ranking) {
		int rankingMinimo = 1; //ranking minimo para poder esta en el ranking
		int rankingMaximo = 10; //ranking maximo para poder esta en el ranking
		boolean isInRange = true;

		if (ranking >= rankingMinimo && ranking <= rankingMaximo) { //Comprobamos que estan entre el minimo y el maximo
			isInRange = true;
		} else {
			isInRange = false;
		}
		return isInRange;
	}


}
