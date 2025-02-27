package Ejemplo9;

class Curso {
    String nombre;

    Curso(String nombre) {
        this.nombre = nombre;
    }
}

class Profesor {
    Curso curso;

    Profesor(Curso curso) {
        this.curso = curso;
    }
}

class Main {
    public static void main(String[] args) {
        Curso miCurso = new Curso("Matemáticas");
        Profesor profesor = new Profesor(miCurso);

        System.out.println("El profesor enseña: " + profesor.curso.nombre);
    }
}

