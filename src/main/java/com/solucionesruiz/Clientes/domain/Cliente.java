package com.solucionesruiz.Clientes.domain;
// Clase POJO
public class Cliente {
    //atributos
    private int ID;
    private String name;
    private String username;
    private String message;

    //Constructor
    public Cliente(int ID, String name, String username, String message) {
        this.ID = ID;
        this.name = name;
        this.username = username;
        this.message = message;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
