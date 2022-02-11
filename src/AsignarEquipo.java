public class AsignarEquipo {
      private Equipo equipo;
      private Jugador jugador;

      //Nos devuelve un true si es distinto a nulo.
      private Boolean isValidated(Object comprobar) {
            boolean validated = true;

            if (comprobar == null) {
                  validated = false;
            } else {
                  validated = true;
            }

            return validated;
      }

      public void setEquipo(Equipo equipo) {
            if (isValidated(equipo)){
                  if (hasName(equipo.getNombreEquipo())){
                        if (hasRanking(equipo.getRanking())){
                              this.equipo = equipo;
                        }
                  }
            }
      }

      private boolean hasRanking(int rank){
            boolean hasRanking = true;

            if (rank != 0){
                  hasRanking = true;
            } else {
                  hasRanking = false;
            }

            return hasRanking;
      }

      private boolean hasName(String name){
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


      public Equipo getEquipo(){
            return this.equipo;
      }

      public void setJugador(Jugador jugador) {
            //Comprobamos si viene null
            if (isValidated(jugador)) {
                  if (isValidated(jugador.getNombreJugador())){
                        if (isValidated(jugador.getIdioma())){
                              if (jugador.getEdad() != 0){
                                    this.jugador = jugador;
                              }
                        }
                  }
            }
      }

      public Jugador getJugador() {
            return this.jugador;
      }

}
