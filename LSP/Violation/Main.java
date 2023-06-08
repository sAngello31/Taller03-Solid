package ejemploLiskov;

public class Main {

    void hacerQueElAnimalHagaSonido(Animal pato) {
        pato.emitirsonido();
    }

    // Viola el principio de Liskov porque una clase derivada puede lanzar una excepcion que la 
    // clase base no
}
