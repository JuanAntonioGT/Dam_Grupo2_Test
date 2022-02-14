package entornos;


// TODO: Auto-generated Javadoc
/**
 * The Class Jugador.
 * @author Artsiom Krautsou Kharlap
 * @version 14/02/2022
 */

public class Jugador {
	
	/** El nombre. */
	private String nombre;
	
	/** La edad. */
	private int edad;
	
	/** El idioma. */
	private String idioma;

	/**
	 * Sets de nombre jugador.
	 *
	 * @param nombre de new nombre jugador
	 */
	/*NOMBRE*/
	public void setNombreJugador(String nombre) {
		if (isValidated(nombre)){

			//Pasamos a mayusculas para facilitar el trabajo
			String nombreMayus = nombre.toUpperCase();

			//Comprobamos el Rango
			if (isInRange(nombreMayus)) {

				//Comprobamos que sea del abecedario español
				if (isWord(nombreMayus)){
					this.nombre = nombreMayus;
				}
			}
		}
	}

	/**
	 * Gets de nombre jugador.
	 *
	 * @return El nombre jugador
	 */
	public String getNombreJugador() {
		return nombre;
	}

	/**
	 * Sets de edad.
	 *
	 * @param edad de new edad
	 */
	/*EDAD*/
	public void setEdad(int edad) {

		//Comprobamos el Rango de edad
		if (isInYear(edad)){
			this.edad = edad;
		}

	}

	/**
	 * Gets de edad.
	 *
	 * @return La edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * Sets de idioma.
	 *
	 * @param idioma de new idioma
	 */
	/*IDIOMA*/
	public void setIdioma(String idioma) {
		// A IDIOMA NO PUEDE LLEGAR MAS DE 1 IDIOMA

		//Pasamos el idioma a minusculas
		String idiomaMin = idioma.toLowerCase();

		//Revisamos que no sea nulo y no este vacio
		if (isValidated(idiomaMin)) {
			if (isInLanguage(idiomaMin)) {
				this.idioma = idioma;
			}

		}
	}

	/**
	 * Gets de idioma.
	 *
	 * @return El idioma
	 */
	public String getIdioma() {
		return idioma;
	}


	//Story 5
	/**
	 * Gets de tipo jugador.
	 *
	 * @return El tipo jugador
	 */
	/*TIPO*/
	public String getTipoJugador() {
		//String para los rangos de clases
		String junior = "Junior";
		String senior = "Senior";
		String master = "Master";

		//Int para rangos de edades
		int edadMinJunior = 18;
		int edadMaxJunior = 25;
		int edadMinSenior = 26;
		int edadMaxSenior = 35;
		int edadMinMaster = 36;
		int edadCero = 0;

			if (this.edad >= edadMinJunior
					&& this.edad <= edadMaxJunior) {

				return junior;

			} else if (this.edad >= edadMinSenior
					&& this.edad <= edadMaxSenior) {

				return senior;

			} else if (this.edad >= edadMinMaster) {

				return master;

			} else {
				return null;
			}

	}

	/**
	 * Checks if is validated.
	 *
	 * @param comprobar el comprobar
	 * @return the boolean
	 */
	//Nos devuelve un true si es distinto a nulo.
	private Boolean isValidated(String comprobar) {
		boolean isTrue=true;
		if (comprobar != null) {

			isTrue= true;
		}else {
			isTrue=false;
		}
		return isTrue;
	}

	/**
	 * Checks if is in range.
	 *
	 * @param comprobar the comprobar
	 * @return true, if is in range
	 */
	//Nos devuelve un true si está en rango la longitud de la palabra
	private boolean isInRange(String comprobar){
		int largoMin = 4;
		int largoMax = 20;
		boolean isLongitud=true;
		if (comprobar.length() >= largoMin
				&& comprobar.length() <= largoMax ){
			isLongitud=true;
		}else {
			isLongitud=false;
		}
		return isLongitud;
	}

	/**
	 * Checks if is word.
	 *
	 * @param comprobar the comprobar
	 * @return true, if is word
	 */
	//Nos devuelve un true si una letra del abecedario español
	private boolean isWord(String comprobar){
		char a = 65;
		char z = 90;
		char espacio = 32;
		boolean isEsLetra=true;

		for (int i = 0; i < comprobar.length(); i++) {
			char c = comprobar.charAt(i);
			if (!(c >= a && c <= z || c==espacio)) {
				isEsLetra=false;
			}else {
				isEsLetra=true;
			}
		}
		return isEsLetra;
	}

	/**
	 * Checks if is in year.
	 *
	 * @param comprobarEdad the comprobar edad
	 * @return true, if is in year
	 */
	//Nos devuelve true si está en el rango de edad
	private boolean isInYear(int comprobarEdad){
		int edadCero = 0;
		int edadMinima = 18;
		int edadMaxima = 100;
		boolean isRangoEdad=true;
		if (comprobarEdad != edadCero){

			if (comprobarEdad >= edadMinima && comprobarEdad <= edadMaxima){
				isRangoEdad= true;
			} else {
				isRangoEdad= false;
			}
		} else {
			isRangoEdad =false;
		}
		return isRangoEdad;
	}

	/**
	 * Checks if is in language.
	 *
	 * @param idioma the idioma
	 * @return true, if is in language
	 */
	//Nos devuelve true si el idioma es válido
	private boolean isInLanguage(String idioma){
		String[] listaDeIdiomas =  {"aleman", "ingles", "espanol", "frances"};
		String vacio = " ";
		boolean isIdiomaValido=true;

		if (!idioma.equals(vacio)){
			for (int i = 0; i < listaDeIdiomas.length; i++) {
				if (idioma.contains(listaDeIdiomas[i])){
					isIdiomaValido= true;
					//Me salgo del for si es true.
					i=listaDeIdiomas.length+1;
				}else {
					isIdiomaValido=false;
				}
			}

		}else {
			isIdiomaValido=false;
		}
		return isIdiomaValido;
	}

}