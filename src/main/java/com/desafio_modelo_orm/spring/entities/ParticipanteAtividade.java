package com.desafio_modelo_orm.spring.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "tb_participante_atividade")
public class ParticipanteAtividade {

    @EmbeddedId
    private ParticipanteAtividadePK id = new ParticipanteAtividadePK();

    public ParticipanteAtividade() {}

    public ParticipanteAtividade(Participante participantes, Atividade atividades) {
        id.setParticipantes(participantes);
        id.setAtividades(atividades);
    }

    public Participante getParticipante() {
        return id.getParticipantes();
    }

    public void setParticipante(Participante participante) {
        id.setParticipantes(participante);
    }

    public Atividade getAtividade() {
        return id.getAtividades();
    }

    public void setAtividade(Atividade atividade) {
        id.setAtividades(atividade);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ParticipanteAtividade that = (ParticipanteAtividade) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
