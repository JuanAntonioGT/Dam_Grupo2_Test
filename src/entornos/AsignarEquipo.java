package entornos;

// TODO: Auto-generated Javadoc
/**
 * The Class AsignarEquipo.
 * @author Juan Antonio Gracia Torres
 * @author Alejandro Marin Bermudez
 * @version 14/02/2022
 */
public class AsignarEquipo {
    
    /** The equipo. */
    private Equipo equipo;
    
    /** The jugador. */
    private Jugador jugador;

    /**
     * Sets the equipo.
     *
     * @param equipo the new equipo
     */
    public void setEquipo(Equipo equipo) {
          if (isEquipoValidated(equipo)){
                if (hasString(equipo.getNombreEquipo())){
                      if (hasInt(equipo.getRanking())){
                            this.equipo = equipo;
                      }
                }
          }
    }

    /**
     * Gets the equipo.
     *
     * @return the equipo
     */
    public Equipo getEquipo(){
          return this.equipo;
    }

    /**
     * Sets the jugador.
     *
     * @param jugador the new jugador
     */
    public void setJugador(Jugador jugador) {
          //Comprobamos si viene null
          if (isJugadorValidated(jugador)){
                if (hasString(jugador.getNombreJugador())){
                      if (hasInt(jugador.getEdad())){
                            if (hasString(jugador.getIdioma())) {
                                  this.jugador = jugador;
                            }
                      }
                }
          }
    }



    /**
     * Gets the jugador.
     *
     * @return the jugador
     */
    public Jugador getJugador() {
          return this.jugador;
    }

    /**
     * Checks if is jugador validated.
     *
     * @param comprobar the comprobar
     * @return the boolean
     */
    //Nos devuelve un true si es distinto a nulo.
    private Boolean isJugadorValidated(Jugador comprobar) {
          boolean validated = true;

          if (comprobar == null) {
                validated = false;
          } else {
                validated = true;
          }

          return validated;
    }

    /**
     * Checks if is equipo validated.
     *
     * @param comprobar the comprobar
     * @return the boolean
     */
    private Boolean isEquipoValidated(Equipo comprobar) {
          boolean validated = true;

          if (comprobar == null) {
                validated = false;
          } else {
                validated = true;
          }

          return validated;
    }

    /**
     * Checks for int.
     *
     * @param rank the rank
     * @return true, if successful
     */
    private boolean hasInt(int rank){
          boolean hasRanking = true;

          if (rank != 0){
                hasRanking = true;
          } else {
                hasRanking = false;
          }

          return hasRanking;
    }

    /**
     * Checks for string.
     *
     * @param name the name
     * @return true, if successful
     */
    private boolean hasString(String name){
          boolean hasName = true;

          if (name != null){
                if (name.length()>0){
                      hasName = true;
                } else {
                      hasName = false;
                }
          } else {
                hasName = false;
          }
          return hasName;
    }

}
