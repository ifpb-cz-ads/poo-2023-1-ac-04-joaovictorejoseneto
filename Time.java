import java.util.ArrayList;
import java.util.List;

public class Time {
    private String nome;
    private List<Jogador> jogadores = new ArrayList<>();

    public Time(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public void addJogador(Jogador jogador){
        boolean isNotInTime = true;
        for(Jogador o: jogadores){
            if(o.equals(jogador)){
                isNotInTime = false;
            }
        }
        if(isNotInTime){
            jogadores.add(jogador);
        }
    }

    public void removeJogador(Jogador jogador){
        boolean isInTime = false;
        for(Jogador o: jogadores){
            if(o.equals(jogador)){
                isInTime = true;
            }
        }
        if(isInTime){
            jogadores.remove(jogador);
        }
    }
}
