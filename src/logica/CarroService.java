package logica;

import bd.DatabaseMysql;
import modelo.Carro;

public class CarroService {

    public void guardarCocheDB(Carro carro) {
        DatabaseMysql db = new DatabaseMysql();
        db.guardar();
    }

    public void imprimirPrecioMedioCoche(Carro carro) { // Ya no tiene el for dentro del metodo y se arregla el Open/Closed
        System.out.println(carro.precioMedio());
    }
}
