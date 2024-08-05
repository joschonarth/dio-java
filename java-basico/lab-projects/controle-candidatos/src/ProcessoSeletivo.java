import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class ProcessoSeletivo {

    public static void main(String[] args) {
        // analisarCandidato(1900.0);
        // analisarCandidato(2100.0);
        // analisarCandidato(2000.0);
        // selecaoCandidatos();
        // imprimirSelecionados();
        ligarParaCandidatos();

    }

    static void ligarParaCandidatos() {
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};

        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando)
                tentativasRealizadas++;
            else
                System.err.println("CONTATO REALIZADO COM SUCESSO");

        } while (continuarTentando && tentativasRealizadas < 3);

        if(atendeu)
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato +" NA " + tentativasRealizadas + "ª TENTATIVA");
        else
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato +", NÚMERO MAXIMO DE TENTATIVAS REALIZADAS: " + tentativasRealizadas);
    }

    static boolean atender() {
        return new Random().nextInt(3)==1;	
    }

    static void imprimirSelecionados() {
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
        System.err.println("Imprimindo a lista de candidatos informando o índice do elemento");

        for (int indice = 0; indice < candidatos.length; indice++) {
            System.err.println("O candidato de n° " + (indice + 1) + " é o " + candidatos[indice]);
        }

        System.err.println("Forma abreviada de interação (For Each)");

        for (String candidato : candidatos) {
            System.err.println("O candidato selecionado foi " + candidato);
        }
    }

    static void selecaoCandidatos() {
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.err.println("O candidato " + candidato + " solicitou este valor de salario R$ " + salarioPretendido);

            if (salarioBase >= salarioPretendido) {
                System.err.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.err.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.err.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.err.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}