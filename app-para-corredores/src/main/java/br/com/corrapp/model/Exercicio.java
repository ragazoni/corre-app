package br.com.corrapp.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "exercicios")
public class Exercicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome", length = 255)
    private String nome;

    @Column(name = "descricao", columnDefinition = "text")
    private String descricao;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo")
    private TipoExercicio tipo;

    @Enumerated(EnumType.STRING)
    @Column(name = "intensidade")
    private IntensidadeExercicio intensidade;

    @Column(name = "repeticoes")
    private int repeticoes;

    @Column(name = "series")
    private int series;

    @ManyToOne
    @JoinColumn(name = "id_treino")
    private Treino treino;

    public enum TipoExercicio{
        AEROBICO,
        FORCA,
        FLEXIBILIDADE,

    }

    public enum IntensidadeExercicio{
        LEVE,
        MODERADO,
        ALTO,

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

    public TipoExercicio getTipo() {
        return tipo;
    }

    public void setTipo(TipoExercicio tipo) {
        this.tipo = tipo;
    }

    public IntensidadeExercicio getIntensidade() {
        return intensidade;
    }

    public void setIntensidade(IntensidadeExercicio intensidade) {
        this.intensidade = intensidade;
    }

    public int getRepeticoes() {
        return repeticoes;
    }

    public void setRepeticoes(int repeticoes) {
        this.repeticoes = repeticoes;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public Treino getTreino() {
        return treino;
    }

    public void setTreino(Treino treino) {
        this.treino = treino;
    }

    @Override
    public String toString() {
        return "Exercicio{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", tipo=" + tipo +
                ", intensidade=" + intensidade +
                ", repeticoes=" + repeticoes +
                ", series=" + series +
                ", treino=" + treino +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Exercicio exercicio = (Exercicio) o;
        return Objects.equals(id, exercicio.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
