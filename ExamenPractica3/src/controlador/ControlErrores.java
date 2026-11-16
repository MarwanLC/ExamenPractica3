package controlador;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Arrays;

public class ControlErrores {

    private static final DateTimeFormatter FORMATO = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static boolean comprobarFecha(String textoFecha) {
        try {
            LocalDate fecha = LocalDate.parse(textoFecha, FORMATO);
            return fecha.getYear() >= 1990 && fecha.getYear() <= 2026;
        } catch (DateTimeParseException e) {
            return false;
        }
    }

    public static LocalDate convertirFecha(String textoFecha) {
        return LocalDate.parse(textoFecha, FORMATO);
    }

    public static boolean comprobarPrecio(String textoPrecio) {
        try {
            float precio = Float.parseFloat(textoPrecio);
            return precio >= 0 && precio<= 150000;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    public static boolean comprobarMatricula(String textoMatricula) {
        if (textoMatricula == null || textoMatricula.trim().isEmpty()) {
            return false;
        }

        String requisito = "^\\d{4}[A-Z]{3}$";

        if (!textoMatricula.matches(requisito)) {
            return false;
        }
        return true;
    }
}
