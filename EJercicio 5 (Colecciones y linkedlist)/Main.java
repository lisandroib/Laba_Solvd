package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {


        GestorVehiculos gestor = new GestorVehiculos();

        // Agregar autos
        gestor.agregarAuto(new Auto("Toyota", "Corolla",2000,4));
        gestor.agregarAuto(new Auto("Ford", "Focus",2000,5));

        // Agregar motos
        gestor.agregarMoto(new Moto("Yamaha", "R1",2015,true));
        gestor.agregarMoto(new Moto("Honda", "CBR",2015,false));

        // Agregar camiones
        gestor.agregarCamion(new Camion("Mercedes", "Actros",1999,40));

        // Agregar colectivos
        gestor.agregarColectivo(new Colectivo("Volvo", "B9",1989,40));

        // Agregar aviones
        gestor.agregarAvion("A320", new Avion("Airbus", "A320",2024,4));
        gestor.agregarAvion("B737", new Avion("Boeing", "737",2016,6));

        // Mostrar los vehículos
        gestor.mostrarAutos();
        gestor.mostrarMotos();
        gestor.mostrarCamiones();
        gestor.mostrarColectivos();
        gestor.mostrarAviones();


        // Crear una lista enlazada personalizada para objetos Auto
        CustomLinkedList<Auto> listaDeAutos = new CustomLinkedList<>();

        // Agregar autos a la lista
        listaDeAutos.add(new Auto("Toyota", "Corolla",2000,4));
        listaDeAutos.add(new Auto("Ford", "Focus",2000,5));

        // Mostrar el tamaño de la lista
        System.out.println("Tamaño de la lista: " + listaDeAutos.size());

        // Obtener y mostrar un auto de la lista
        Auto auto = listaDeAutos.get(0);
        System.out.println("Primer auto: " + auto);

        // Verificar si la lista está vacía
        System.out.println("¿La lista está vacía? " + listaDeAutos.isEmpty());
    }
}