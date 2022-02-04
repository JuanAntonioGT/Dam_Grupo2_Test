
public class AsignarEquipo {
      private Equipo equipo;
      private Jugador jugador;

      public AsignarEquipo() {
      }
      
      public void setEquipo(Equipo equipo) {
            // Aqui vamos a guardar el Equipo. Para guardar el equipo setearemos el Nombre de equipo y Ranking.

            if (equipo != null){

                  if (equipo.getNombreEquipo() != null) {
                        String nombreEquipo  =  equipo.getNombreEquipo();
                        String[] numbers = {"0","1","2","3","4","5","6","7","8","9"};

                        if (nombreEquipo.length() >= 4 && nombreEquipo.length() <= 20) {

                              for (int i = 0; i < numbers.length; i++) {

                                    if (nombreEquipo.contains(numbers[i])){
                                          System.out.println("Contiene numero");
                                          this.equipo.setNombreEquipo(null);
                                          break;

                                    } else {
                                          System.out.println("NO contiene numero");
                                    }

                              }

                              if (equipo.getRanking() >= 1 && equipo.getRanking() <= 10) {
                                    System.out.println("Está en el rango");
                                    this.equipo = equipo;
                              } else {
                                    System.out.println("NO está en el rango");
                                    this.equipo.setRanking(0);
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
            if (equipo != null){
                  return this.equipo;
            }
            return null;
      }

      public Jugador getJugador(){

            return this.jugador;
      }
}
