package Ejemplo1;

class Dispositivo {
    void encender() {
        System.out.println("El dispositivo está encendido.");
    }
}

class Telefono extends Dispositivo {
    void llamar() {
        System.out.println("Llamando a un contacto...");
    }
}

class Main {
    public static void main(String[] args) {
        Telefono miTelefono = new Telefono();
        miTelefono.encender(); 
        miTelefono.llamar();   


    }
}
