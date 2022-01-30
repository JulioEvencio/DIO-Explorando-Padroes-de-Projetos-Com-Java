package facade;

public class Facade {

    public void migrarCliente(String nome, String cep) {
        String cidade = Sistema2.getInstancia().recuperarCidade(cep);
        String estado = Sistema2.getInstancia().recuperarEstado(cep);

        Sistema1.gravarCliente(nome, cep, cidade, estado);
    }

}
