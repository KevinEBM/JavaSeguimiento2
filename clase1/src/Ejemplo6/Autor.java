package Ejemplo6;

class Autor {
    String nombre = "Gabriel García Márquez";
}

class Libro {
    Autor autor;

    Libro(Autor autor) {
        this.autor = autor;
    }
}

class Main {
    public static void main(String[] args) {
        Autor miAutor = new Autor();
        Libro miLibro = new Libro(miAutor);

        System.out.println("Autor del libro: " + miLibro.autor.nombre);
    }
}

