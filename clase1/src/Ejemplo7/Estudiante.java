package Ejemplo7;

class Estudiante {
    String nombre;

    Estudiante(String nombre) {
        this.nombre = nombre;
    }
}

class Universidad {
    Estudiante estudiante;

    Universidad(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
}

class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Carlos");
        Universidad universidad = new Universidad(estudiante);

        System.out.println("Estudiante en la universidad: " + universidad.estudiante.nombre);
    }
}

