package strategy;

public class Teste {

    public static void main(String[] args) {
        Robo robo = new Robo();

        robo.setComportamento(new ComportamentoNormal());
        robo.mover();

        robo.setComportamento(new ComportamentoAgressivo());
        robo.mover();

        robo.setComportamento(new ComportamentoDefensivo());
        robo.mover();
    }

}
