package main;

import modelo.Carro;

public class Main {
    public static void main(String[] args) {
        Carro[] arrayCoches = {
                new Carro("Renault"),
                new Carro("Audi")
        };
        imprimirPrecioMedioCoche(arrayCoches);
    }

    public static void imprimirPrecioMedioCoche(Carro[] carros) {
        for (Carro carro : carros) {
            if (carro.marca.equals("Renault")) {
                System.out.println(18000);
            }
            if (carro.marca.equals("Audi")) {
                System.out.println(25000);
            }
        }
    }
}
