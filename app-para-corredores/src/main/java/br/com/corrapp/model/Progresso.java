package br.com.corrapp.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "progresso")
public class Progresso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "id_treino")
    private Treino treino;

    @Column(name = "data_treino")
    private Date dataTreino;

    @Column(name = "distancia")
    private float distancia;

    @Column(name = "tempo")
    private int tempo;

    @Column(name = "observacoes", columnDefinition = "text")
    private String observacoes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Treino getTreino() {
        return treino;
    }

    public void setTreino(Treino treino) {
        this.treino = treino;
    }

    public Date getDataTreino() {
        return dataTreino;
    }

    public void setDataTreino(Date dataTreino) {
        this.dataTreino = dataTreino;
    }

    public float getDistancia() {
        return distancia;
    }

    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    @Override
    public String toString() {
        return "Progresso{" +
                "id=" + id +
                ", usuario=" + usuario +
                ", treino=" + treino +
                ", dataTreino=" + dataTreino +
                ", distancia=" + distancia +
                ", tempo=" + tempo +
                ", observacoes='" + observacoes + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Progresso progresso = (Progresso) o;
        return Objects.equals(id, progresso.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
