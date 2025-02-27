package Ejemplo2;

class Vehiculo {
    void mover() {
        System.out.println("El vehículo se está moviendo...");
    }
}

class Coche extends Vehiculo {
    void acelerar() {
        System.out.println("El coche está acelerando...");
    }
}

class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.mover();  
        miCoche.acelerar(); 
    }
}
