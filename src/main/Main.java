package main;

import logica.CarroService;
import modelo.Carro;
import modelo.Renault;
import modelo.Audi;

public class Main {
    public static void main(String[] args) {
        Carro[] arrayCoches = {
                new Renault(),
                new Audi()
        };
        CarroService service = new CarroService();
        // Ver precio de cada carro en arrayCoches
        for (Carro carro : arrayCoches) {
            service.imprimirPrecioMedioCoche(carro);
        }

        //Guardar carro en la BD.
        service.guardarCocheDB(new Carro());

    }
}
