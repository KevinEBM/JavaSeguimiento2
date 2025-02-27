package Ejemplo3;

class Electrodomestico {
    void encender() {
        System.out.println("El electrodoméstico está encendido.");
    }
}

class Nevera extends Electrodomestico {
    void enfriar() {
        System.out.println("La nevera está enfriando...");
    }
}

class Main {
    public static void main(String[] args) {
        Electrodomestico e = new Electrodomestico();
        e.encender(); 

        Nevera n = new Nevera();
        n.encender();
        n.enfriar();
    }
}
