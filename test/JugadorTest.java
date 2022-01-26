import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JugadorTest {

    // Test para revisar el tipo de caracteres, deben ser de tipo texto

    @Test
    void setNombreJugadorValidoCaracteres() {
        Jugador jugador = new Jugador();
        String nombre = "Caracteres";
        jugador.setNombreJugador(nombre);
        assertEquals(nombre,jugador.getNombreJugador());
    }

    // Test para revisar el tipo de contenido erroneo, ser revisa que el campo contenga valores no valido

    @Test
    void setNombreJugadorCaracteresNoValidos() {
        Jugador jugador = new Jugador();
        String nombre = "12345";
        jugador.setNombreJugador(nombre);
        assertEquals(null,jugador.getNombreJugador());
    }

    // Test para que tenga menos del mínimo de 4 caracteres

    @Test
    void setTestNombreJugadorCaracterMenorACuatro() {
        Jugador jugador = new Jugador();
        String nombre = "Ana";
        jugador.setNombreJugador(nombre);
        assertEquals(null,jugador.getNombreJugador());
    }

    // Test para que tenga  4 caracteres exactos

    @Test
    void setTestNombreJugadorIgualAlMinimo() {
        Jugador jugador = new Jugador();
        String nombre = "Juan";
        jugador.setNombreJugador(nombre);
        assertEquals(nombre,jugador.getNombreJugador());
    }

    // Test para que tenga mas de 4 caracteres

    @Test
    void setTestNombreJugadorMasDelMinimo() {
        Jugador jugador = new Jugador();
        String nombre = "Pedro"; // La prueba
        jugador.setNombreJugador(nombre);
        assertEquals(nombre,jugador.getNombreJugador());
    }

    // Test para que tenga igual al maximo (20)

    @Test
    void setTestNombreJugadorMenosDelMaximo() {
        Jugador jugador = new Jugador();
        String nombre = "qwertyuiopasdfghjklñ"; // La prueba
        jugador.setNombreJugador(nombre);
        assertEquals(nombre,jugador.getNombreJugador());
    }

    // Test para que tenga mas al maximo (20)

    @Test
    void setTestNombreJugadorMasDelMaximo() {
        Jugador jugador = new Jugador();
        String nombre = "qwertyuiopasdfghjklñr"; // La prueba
        jugador.setNombreJugador(nombre);
        assertEquals(null,jugador.getNombreJugador());
    }

    // Test para revisar el tipo de caracteres, deben ser de tipo entero

    @Test
    void setEdadJugadorValidoCaracteres() {
        Jugador jugador = new Jugador();
        int edad = 50;
        jugador.setEdad(edad);
        assertEquals(edad,jugador.getEdad());
    }

    // Test para revisar el tipo de contenido erroneo, ser revisa que el campo contenga valores no valido

    @Test
    void setEdadJugadorCaracteresNoValidos() {
        Jugador jugador = new Jugador();

        assertThrows(NumberFormatException.class, () -> {
            int edad = Integer.parseInt("Hola");
            jugador.setEdad(edad);
        },"Solo puedes guardar números");

    }

    // Test para revisar el minimo de edad

    @Test
    void setEdadJugadorEdadMinimo() {
        Jugador jugador = new Jugador();
        int edad = 18;
        jugador.setEdad(edad);
        assertEquals(edad,jugador.getEdad());
    }

    // Test para revisar la edad maxima de un jugador

    @Test
    void setEdadJugadorEdadMaxima() {
        Jugador jugador = new Jugador();
        int edad = 100;
        jugador.setEdad(edad);
        assertEquals(edad,jugador.getEdad());
    }

    // Test para revisar la edad menor a la edad minima de un jugador

    @Test
    void setEdadJugadorEdadMenorEdadMinima() {
        Jugador jugador = new Jugador();
        int edad = 17;
        jugador.setEdad(edad);
        assertEquals(0,jugador.getEdad());
    }

    // Test para revisar la edad mayor que a la edad maxima de un jugador

    @Test
    void setEdadJugadorEdadMayorEdadMaxima() {
        Jugador jugador = new Jugador();
        int edad = 101;
        jugador.setEdad(edad);
        assertEquals(0,jugador.getEdad());
    }

    // Test para revisar la edad negativa de un jugador

    @Test
    void setEdadJugadorEdadNegativa() {
        Jugador jugador = new Jugador();
        int edad = -15;
        jugador.setEdad(edad);
        assertEquals(0,jugador.getEdad());
    }

    // Test para revisar el idioma de un jugador correctamente

    @Test
    void setIdiomaJugadorPositivo() {
        Jugador jugador = new Jugador();
        String idioma = "Aleman";
        jugador.setIdioma(idioma);
        assertEquals(idioma, jugador.getIdioma());
    }

    // Test para revisar que se ha cpgido los 4 idiomas maximos validos

    @Test
    void setIdiomaJugadorTodosLosIdiomas() {
        Jugador jugador = new Jugador();
        String aleman = "Aleman";
        String ingles = "Ingles";
        String espanol = "Español";
        String frances = "Frances";

        jugador.setIdioma(aleman);
        jugador.setIdioma(jugador.getIdioma()+ingles);
        jugador.setIdioma(jugador.getIdioma()+espanol);
        jugador.setIdioma(jugador.getIdioma()+frances);
        assertEquals(aleman+ingles+espanol+frances, jugador.getIdioma());
    }

    // Test para revisar que se ha cogido entre 1 y 4 idiomas

    @Test
    void setIdiomaJugadorEntreUnoYCuatroIdiomas() {
        Jugador jugador = new Jugador();
        String ingles = "Ingles";
        String espanol = "Español";

        jugador.setIdioma(ingles);
        jugador.setIdioma(jugador.getIdioma()+espanol);

        assertEquals(ingles+espanol, jugador.getIdioma());
    }

    // Test para revisar que de error dejar el campo vacio

    @Test
    void setIdiomaJugadorNegativoVacio() {
        Jugador jugador = new Jugador();
        String vacio = "";
        jugador.setIdioma(vacio);
        assertNull(jugador.getIdioma());
    }


    // Test para revisar que no se pueda coger un idioma erroneo

    @Test
    void setIdiomaJugadorNegativoErroneo() {
        Jugador jugador = new Jugador();
        String idioma = "Chino";
        jugador.setIdioma(idioma);
        assertNull(jugador.getIdioma());
    }

}