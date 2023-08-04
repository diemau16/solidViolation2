package modelo;

public class Audi extends Carro {

    public Audi() {
        super("Audi");
    }

    @Override
    public int precioMedio() {
        return 25000;
    }
}
