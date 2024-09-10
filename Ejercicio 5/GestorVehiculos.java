package org.example;

import java.util.*;

public class GestorVehiculos {

    private ArrayList<Auto> autos = new ArrayList<>();
    private HashSet<Moto> motos = new HashSet<>();
    private LinkedList<Camion> camiones = new LinkedList<>();
    private TreeSet<Colectivo> colectivos = new TreeSet<>();
    private HashMap<String, Avion> avionesMap = new HashMap<>();


    public void agregarAuto(Auto auto) {
        autos.add(auto);
    }

    public void agregarMoto(Moto moto) {
        motos.add(moto);
    }

    public void agregarCamion(Camion camion) {
        camiones.add(camion);
    }

    public void agregarColectivo(Colectivo colectivo) {
        colectivos.add(colectivo);
    }

    public void agregarAvion(String identificador, Avion avion) {
        avionesMap.put(identificador, avion);
    }


    public void mostrarAutos() {
        for (Auto auto : autos) {
            System.out.println(auto);
        }
    }

    public void mostrarMotos() {
        for (Moto moto : motos) {
            System.out.println(moto);
        }
    }

    public void mostrarCamiones() {
        for (Camion camion : camiones) {
            System.out.println(camion);
        }
    }

    public void mostrarColectivos() {
        for (Colectivo colectivo : colectivos) {
            System.out.println(colectivo);
        }
    }

    public void mostrarAviones() {
        for (String key : avionesMap.keySet()) {
            System.out.println("Avion ID: " + key + " - " + avionesMap.get(key));
        }
    }
}
