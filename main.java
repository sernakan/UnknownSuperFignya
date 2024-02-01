import java.io.IOException;

public class main {
    public static void main(String[] args) {
        Magazin store = new Magazin();

        store.addToy(1, "Toy 1", 10, 20);
        store.addToy(2, "Toy 2", 5, 10);
        store.addToy(3, "Toy 3", 20, 70);

        store.setToyWeight(2, 30);
        store.play();
        try {
            store.getPrizeToy();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}