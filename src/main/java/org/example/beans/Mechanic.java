package org.example.beans;

import javax.persistence.*;

@Entity
public class Mechanic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String tool;

    @ManyToOne
    @JoinColumn(name = "garage_id")
    private Garage garage;

    public Mechanic() {
    }

    public Mechanic(String name, String tool) {
        this.name = name;
        this.tool = tool;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTool() {
        return tool;
    }

    public void setTool(String tool) {
        this.tool = tool;
    }

    public Garage getGarage() {
        return garage;
    }

    public void setGarage(Garage garage) {
        this.garage = garage;
    }

    @Override
    public String toString() {
        return "Mechanic{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tool='" + tool + '\'' +
                '}';
    }
}