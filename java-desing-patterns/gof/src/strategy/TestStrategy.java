package strategy;

public class TestStrategy {

    public static void main(String[] args) {

        // Testes relacionados ao Design Pattern Strategy
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento ofensivo = new ComportamentoOfensivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();

        robo.setComportamento(defensivo);
        robo.mover();

        robo.setComportamento(ofensivo);
        robo.mover();
        
    }
    
}
