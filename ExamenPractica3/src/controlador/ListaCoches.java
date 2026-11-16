/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import modelo.Coche;

public class ListaCoches extends ArrayList<Coche> {
    
    private int actual;

    public ListaCoches() {
        this.add(new Coche("2000ABC", LocalDate.of(2011, 5, 12), (float) 20000.0));
        this.add(new Coche("4020ABC", LocalDate.of(2001, 11, 28), (float) 7000.0));
        this.add(new Coche("3100CBA", LocalDate.of(2005, 2, 14), (float) 5000.0));
        this.add(new Coche("8090BAC", LocalDate.of(2002, 8, 5), (float) 2000.0));
        this.add(new Coche("7770ACB", LocalDate.of(2011, 5, 12), (float) 10000.0));
        ordenarPorMatricula();
        actual = 0;
    }

    public boolean esVacia() {
        return this.isEmpty();
    }

    public boolean esPrimero() {
        return !esVacia() && actual == 0;
    }

    public boolean esUltimo() {
        return !esVacia() && actual == this.size() - 1;
    }

    public void avanzar() {
        if (!esUltimo() && !esVacia()) {
            actual++;
        }
    }

    public void retroceder() {
        if (!esPrimero() && !esVacia()) {
            actual--;
        }
    }

    public void irPrimero() {
        if (!esVacia()) {
            actual = 0;
        }
    }

    public void irUltimo() {
        if (!esVacia()) {
            actual = this.size() - 1;
        }
    }

    public Coche obtenerCocheActual() {
        if (esVacia() || actual < 0 || actual >= this.size()) {
            return null;
        }
        return this.get(actual);
    }

    public void anadirCoche(Coche c) {
        this.add(c);
        ordenarPorMatricula();
        actual = this.indexOf(c);
    }

    public void borrarCliente() {
        if (!esVacia()) {
            this.remove(actual);
            if (esVacia()) {
                actual = -1;
            } else if (actual >= this.size()) {
                actual = this.size() - 1;
            }
        }
    }
   
    public void ordenarPorMatricula() {
    Collections.sort(this, new Comparator<Coche>() {
        @Override
        public int compare(Coche c1, Coche c2) {
            return c1.getMatricula().compareTo(c2.getMatricula());
        }
    });
}
}
