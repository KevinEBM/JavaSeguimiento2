package Ejemplo8;

class Capital {
    String nombre = "Bogotá";
}

class Pais {
    Capital capital;

    Pais(Capital capital) {
        this.capital = capital;
    }
}

class Main {
    public static void main(String[] args) {
        Capital miCapital = new Capital();
        Pais miPais = new Pais(miCapital);

        System.out.println("Capital del país: " + miPais.capital.nombre);
    }
}
