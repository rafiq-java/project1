package Assignment;

public class Bal {
    public Bal(int i) {
        System.out.println("ONE");
    }

    public Bal() {
        this(1);

        System.out.println("TWO");
    }

    void Bal() {
        Bal(1);

        System.out.println("THREE");
    }

    void Bal(int i) {
        System.out.println("FOUR");
    }
}



