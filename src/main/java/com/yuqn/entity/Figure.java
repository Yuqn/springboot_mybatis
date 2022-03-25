package com.yuqn.entity;

public class Figure {
    private Integer id;
    private String name;
    private String type;
    private Integer pri;

    public Figure() {
    }

    public Figure(Integer id, String name, String type, Integer pri) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.pri = pri;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getPri() {
        return pri;
    }

    public void setPri(Integer pri) {
        this.pri = pri;
    }

    @Override
    public String toString() {
        return "Figure{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", pri=" + pri +
                '}';
    }
}
