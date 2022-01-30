package facade;

public class Sistema2 {

    private static final Sistema2 instancia = new Sistema2();

    private Sistema2() {
        super();
    }

    public static Sistema2 getInstancia() {
        return instancia;
    }

    public String recuperarCidade(String cep) {
        return "São Luís";
    }

    public String recuperarEstado(String cep) {
        return "MA";
    }

}
