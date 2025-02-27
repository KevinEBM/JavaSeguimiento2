package Ejemplo5;

class Figura {
    void dibujar() {
        System.out.println("Dibujando una figura...");
    }
}

class Circulo extends Figura {
    @Override
    void dibujar() {
        System.out.println("Dibujando un círculo...");
    }
}

class Main {
    public static void main(String[] args) {
        Circulo c = new Circulo();
        c.dibujar(); // Se ejecuta la versión de Circulo
    }
}
