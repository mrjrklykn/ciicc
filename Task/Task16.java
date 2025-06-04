// Define the Animal interface
interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}

// Gorilla class implementing the Animal interface
class Gorilla implements Animal {
    private boolean hungry;

    public Gorilla(boolean hungry) {
        this.hungry = hungry;
    }

    @Override
    public boolean feed(boolean timeToEat) {
        if (timeToEat) {
            System.out.println("// put gorilla food into cage");
            hungry = false;
            return true;
        }
        System.out.println("Gorilla is not hungry right now.");
        return false;
    }

    @Override
    public void groom() {
        System.out.println("// lather, rinse, repeat");
        System.out.println("Gorilla is being groomed.");
    }

    @Override
    public void pet() {
        System.out.println("// pet at your own risk");
        System.out.println("Approach with caution before petting the gorilla.");
    }
}

// Main class to test the Gorilla class
public class Task16 {
    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla(true);

        System.out.println("Feeding the gorilla...");
        gorilla.feed(true);

        System.out.println("\nGrooming the gorilla...");
        gorilla.groom();

        System.out.println("\nTrying to pet the gorilla...");
        gorilla.pet();
    }
}
