package singleton;

public class Eager {

    private static final Eager instancia = new Eager();

    private Eager() {
        super();
    }

    public static Eager getInstancia() {
        return instancia;
    }

}
