
public class Main {

	public static void main(String[] args) {
        Auto auto = new Auto("Toyota", "Corolla", 2022, 4);
        Moto moto = new Moto("Harley-Davidson", "Street 750", 2021, false);
        Camion camion = new Camion("Volvo", "FH16", 2020, 20000);
        Colectivo colectivo = new Colectivo("Mercedes-Benz", "Sprinter", 2019, 50);
        Bicicleta bicicleta = new Bicicleta("Giant", "Explore E+", 2023, true);
        Avion avion = new Avion("Boeing", "747", 2015, 4);
        Barco barco = new Barco("Yamaha", "242X", 2018, 24.2);
        Tren tren = new Tren("Siemens", "Velaro", 2017, 8);
        Helicoptero helicoptero = new Helicoptero("Bell", "206", 2016, 2);
        
        
        auto.acelerar();
        auto.acelerar(120);
        moto.acelerar();
        moto.acelerar(60);
        camion.acelerar();
        camion.acelerar(80);
        colectivo.acelerar();
        colectivo.acelerar(50);
        bicicleta.acelerar();
        bicicleta.acelerar(10);
        avion.acelerar();
        avion.acelerar(120);
        barco.acelerar();
        barco.acelerar(150);
        tren.acelerar();
        tren.acelerar(200);
        helicoptero.acelerar();
        helicoptero.acelerar(180);
	}

}
