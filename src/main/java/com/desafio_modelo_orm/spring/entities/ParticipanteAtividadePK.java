package com.desafio_modelo_orm.spring.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Objects;

@Embeddable
public class ParticipanteAtividadePK {

    @ManyToOne
    @JoinColumn(name = "participantes_id")
    private Participante participantes;


    @ManyToOne
    @JoinColumn(name = "atividades_id")
    private Atividade atividades;

    public ParticipanteAtividadePK(){}

    public Participante getParticipantes() {
        return participantes;
    }

    public void setParticipantes(Participante participantes) {
        this.participantes = participantes;
    }

    public Atividade getAtividades() {
        return atividades;
    }

    public void setAtividades(Atividade atividades) {
        this.atividades = atividades;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ParticipanteAtividadePK that = (ParticipanteAtividadePK) o;
        return Objects.equals(participantes, that.participantes) && Objects.equals(atividades, that.atividades);
    }

    @Override
    public int hashCode() {
        return Objects.hash(participantes, atividades);
    }
}
