import java.util.List;
import java.util.Objects;

public class Jogador {
    private String nome;
    private int id;

    public Jogador(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jogador jogador = (Jogador) o;
        return getId() == jogador.getId();
    }

    @Override
    public String toString(){
        return this.nome;
    }

}
