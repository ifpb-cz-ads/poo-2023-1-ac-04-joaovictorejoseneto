public class BMExercicio05 {
    public static void main(String[] args) {

        Time time = new Time("");
        Jogador jogador = new Jogador("Jorge", 1);
        Jogador jogador2 = new Jogador("Antonio", 2);
        time.addJogador(jogador);
        time.addJogador(jogador2);
        System.out.println(time.getJogadores());
        time.removeJogador(jogador);
        time.removeJogador(jogador2);
        System.out.println(time.getJogadores());
    }
}