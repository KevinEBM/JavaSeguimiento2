package Ejercicio10;

class Libro {
    String titulo;

    Libro(String titulo) {
        this.titulo = titulo;
    }
}

class Biblioteca {
    Libro libro;

    Biblioteca(Libro libro) {
        this.libro = libro;
    }
}

class Main {
    public static void main(String[] args) {
        Libro miLibro = new Libro("Cien años de soledad");
        Biblioteca miBiblioteca = new Biblioteca(miLibro);

        System.out.println("El libro en la biblioteca es: " + miBiblioteca.libro.titulo);
    }
}
