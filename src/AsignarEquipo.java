
public class AsignarEquipo {
      private Equipo equipo;
      private Jugador jugador;

      public AsignarEquipo() {
      }
      
      public void setEquipo(Equipo equipo) {
            if (equipo != null) {
                  if (equipo.getNombreEquipo() != null){
                        if (equipo.getNombreEquipo().length()>=4 && equipo.getNombreEquipo().length()<=20){

                              for (int i = 0; i < equipo.getNombreEquipo().length(); i++) {

                                    char c = equipo.getNombreEquipo().charAt(i);
                                    if (!(c >= '0' && c <= '9')) {
                                          if (equipo.getNombreEquipo() != null) {
                                                if (((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))) {
                                                      if (equipo.getRanking() >= 0 && equipo.getRanking() <= 10) {
                                                            this.equipo = equipo;
                                                      }
                                                }
                                          }
                                    }
                              }
                        }
                  }

            }

      }
      
      public void setJugador(Jugador jugador) {
            if (jugador != null) {

                  if (jugador.getNombreJugador() != null){
                        if (jugador.getNombreJugador().length() >= 4 && jugador.getNombreJugador().length() <= 20) {
                              for (int i = 0; i < jugador.getNombreJugador().length(); i++) {
                                    char c = jugador.getNombreJugador().charAt(i);
                                    if (!(c >= '0' && c <= '9')){
                                          if (((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || c == ' ')) {
                                                try {
                                                      if (jugador.getEdad() != 0 && jugador.getEdad() >= 18 && jugador.getEdad() <= 100) {

                                                            if (jugador.getIdioma() != null){
                                                                  if (jugador.getIdioma().contains("Espanol") || jugador.getIdioma().contains("Ingles") || jugador.getIdioma().contains("Aleman") || jugador.getIdioma().contains("Frances") || jugador.getIdioma().contains("Español") ) {
                                                                        this.jugador = jugador;
                                                                  }
                                                            }
                                                      }
                                                } catch (NumberFormatException e) {
                                                      System.out.println(e.getCause() + e.getMessage());
                                                }
                                          }
                                    }

                              }
                        }

                  }
            }


      }
      public Equipo getEquipo(){
            if (equipo.getNombreEquipo() != null){
                  return this.equipo;
            }
            return null;
      }
      public Jugador getJugador(){

            return this.jugador;
      }
}
