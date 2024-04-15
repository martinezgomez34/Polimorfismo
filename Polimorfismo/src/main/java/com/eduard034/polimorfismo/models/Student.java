package com.eduard034.polimorfismo.models;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Student {
    private final StringProperty matricula;
    private final StringProperty nombre;
    private final StringProperty apellidoP;
    private final StringProperty apellidoM;

    public Student(String matricula, String nombre, String apellidoP, String apellidoM) {
        this.matricula = new SimpleStringProperty(matricula);
        this.nombre = new SimpleStringProperty(nombre);
        this.apellidoP = new SimpleStringProperty(apellidoP);
        this.apellidoM = new SimpleStringProperty(apellidoM);
    }

    public String getMatricula() {
        return matricula.get();
    }

    public StringProperty matriculaProperty() {
        return matricula;
    }

    public String getNombre() {
        return nombre.get();
    }

    public StringProperty nombreProperty() {
        return nombre;
    }

    public String getApellidoP() {
        return apellidoP.get();
    }

    public StringProperty apellidoPProperty() {
        return apellidoP;
    }

    public String getApellidoM() {
        return apellidoM.get();
    }

    public StringProperty apellidoMProperty() {
        return apellidoM;
    }

    public void setNombre(String nombre) {
        this.nombre.set(nombre);
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP.set(apellidoP);
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM.set(apellidoM);
    }
}
