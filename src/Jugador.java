public class Jugador {
    private String nombre;
    private int edad;
    private String idioma;
    private String tipo;
    
    //story 5
     private String tipo;
    //
    public Jugador (String nombre, int edad, String idioma) {
        this.setNombreJugador(nombre);
        this.setEdad(edad);
        this.setIdioma(idioma);


    }

    public void setNombreJugador(String nombre) {
        //Pasamos a mayusculas para facilitar el trabajo
        String nombreMayus = nombre.toUpperCase();

        //Revisamos que no sea nulo
        if (nombreMayus != null){
             //Revisamos el largo del nombre
             if (nombre.length()>=4 && nombre.length()<=20 ){
                //Recorremos el nombre por su largo
                for (int i = 0; i < nombre.length(); i++) {
                    //En cada vuelta revisamos las letras
                    char letra = nombreMayus.charAt(i);
                    //Comprobamos que esten entre A y Z
                    if (letra >= 65 && letra <= 90 || letra == 32) {
                        this.nombre=nombre.toUpperCase();
                    }
                }
            }
        }


    }

    public void setEdad(int edad) {


                if (edad != 0){
                    if (edad >= 18) {
                        if (edad <= 100) {
                            this.edad=edad;
                        }
                    }
                }
            

    }
    public void setIdioma(String idioma) {
        String aleman = "aleman";
        String ingles = "ingles";
        String espanol = "español";
        String frances = "frances";
        String idiomaMin = idioma.toLowerCase();

        if(idiomaMin != null){
            if(idiomaMin != " "){
                if(idiomaMin.equals(aleman) || idiomaMin.equals(ingles) || idiomaMin.equals(espanol) || idiomaMin.equals(frances) ){
                    this.idioma=idioma;
                }
            }
        }
    }


    public String getIdioma() {
        return idioma;
    }

    public String getNombreJugador() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    
    //Story 5
    public void setTipo(String tipo) {
        if(edad >=18 && edad <=25){
            this.tipo = "Junior";
            if(edad >=26 && edad <=35) {
                this.tipo = "Senior";
                if(edad >36) {
                    this.tipo = "Master";
                }
            }

          }
       }
    
    public String getTipo() {
        return tipo;
    }
    //
    
    
     
}
