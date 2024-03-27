package br.com.corrapp.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "treinos")
public class Treino {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome", length = 255)
    private String nome;

    @Column(name = "descricao", columnDefinition = "text")
    private String descricao;

    @Column(name = "data_treino")
    private Date dataTreino;

    @Enumerated(EnumType.STRING)
    @Column(name = "objetivo")
    private ObjetivoTreino objetivo;

    @Enumerated(EnumType.STRING)
    @Column(name = "nivel")
    private NivelTreino nivel;

    @Column(name = "duracao")
    private int duracao;

    @ManyToOne
    @JoinColumn(name = "id_treinador")
    private Usuario treinador;



    public enum NivelTreino{
        INICIANTE,
        INTERMEDIARIO,
        AVANCADO
    }

    public enum ObjetivoTreino{
        CONDICIONAMENTO,
        VELOCIDADE,
        RESISTENCIA,
        MARATONAS,
        ULTRAMARATONAS,
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataTreino() {
        return dataTreino;
    }

    public void setDataTreino(Date dataTreino) {
        this.dataTreino = dataTreino;
    }

    public ObjetivoTreino getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(ObjetivoTreino objetivo) {
        this.objetivo = objetivo;
    }

    public NivelTreino getNivel() {
        return nivel;
    }

    public void setNivel(NivelTreino nivel) {
        this.nivel = nivel;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public Usuario getTreinador() {
        return treinador;
    }

    public void setTreinador(Usuario treinador) {
        this.treinador = treinador;
    }

    @Override
    public String toString() {
        return "Treino{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", dataTreino=" + dataTreino +
                ", objetivo=" + objetivo +
                ", nivel=" + nivel +
                ", duracao=" + duracao +
                ", treinador=" + treinador +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Treino treino = (Treino) o;
        return Objects.equals(id, treino.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
