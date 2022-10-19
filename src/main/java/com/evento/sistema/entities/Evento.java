package com.evento.sistema.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_evento")
public class Evento {
	
	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String local;
    private String data;
    private String horario;

    public Evento(){}

    public Evento(String name, String local, String data, String horario) {
        this.name = name;
        this.local = local;
        this.data = data;
        this.horario = horario;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", local='" + local + '\'' +
                ", data='" + data + '\'' +
                ", horario='" + horario + '\'' +
                '}';
    }

}
