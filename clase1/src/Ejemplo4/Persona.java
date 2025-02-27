package Ejemplo4;

class Persona {
    String nombre = "Juan";

    void saludar() {
        System.out.println("Hola, soy " + nombre);
    }
}

class Estudiante extends Persona {
    void estudiar() {
        System.out.println(nombre + " está estudiando...");
    }
}

class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();
        estudiante.saludar();  
        estudiante.estudiar(); 
    }
}
