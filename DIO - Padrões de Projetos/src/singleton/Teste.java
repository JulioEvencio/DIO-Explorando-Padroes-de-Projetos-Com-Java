package singleton;

public class Teste {

    public static void main(String[] args) {
        Lazy lazy1 = Lazy.getInstancia();
        Lazy lazy2 = Lazy.getInstancia();
        if (lazy1 == lazy2) System.out.println("As instâncias são iguais!");
        else System.out.println("As instâncias são diferentes!");

        Eager eager1 = Eager.getInstancia();
        Eager eager2 = Eager.getInstancia();
        if (eager1 == eager2) System.out.println("As instâncias são iguais!");
        else System.out.println("As instâncias são diferentes!");

        LazyHolder lazyHolder1 = LazyHolder.getInstancia();
        LazyHolder lazyHolder2 = LazyHolder.getInstancia();
        if (lazyHolder1 == lazyHolder2) System.out.println("As instâncias são iguais!");
        else System.out.println("As instâncias são diferentes!");
    }

}
