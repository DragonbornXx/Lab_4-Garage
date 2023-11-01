package org.example.beans;

public class Tool {
    private String name;

    public Tool(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Tool [name=" + name + "]";
    }
}