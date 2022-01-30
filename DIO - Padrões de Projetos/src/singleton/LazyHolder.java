package singleton;

public class LazyHolder {

    private static class Instancia {
        public static LazyHolder instancia = new LazyHolder();
    }

    private LazyHolder() {
        super();
    }

    public static LazyHolder getInstancia() {
        return Instancia.instancia;
    }

}
