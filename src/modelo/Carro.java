package modelo;

public class Carro {
    private String marca;

    public Carro() {

    }

    public Carro(String marca) {
        this.marca = marca;
    }

    public int precioMedio() {
        return 0;
    }

    void guardarCocheDB(Carro carro) {
        System.out.println("Guarde en BD");
    }
}
