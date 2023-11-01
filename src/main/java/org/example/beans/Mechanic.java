package org.example.beans;

public class Mechanic {
    private String name;
    private Tool tool;

    public Mechanic(String name) {
        this.name = name;
    }

    public void setTool(Tool tool) {
        this.tool = tool;
    }

    @Override
    public String toString() {
        return "Mechanic [name=" + name + ", tool=" + tool + "]";
    }
}