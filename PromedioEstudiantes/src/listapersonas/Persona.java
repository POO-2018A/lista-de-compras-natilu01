/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listapersonas;

/**
 *
 * @author ESFOT
 */
public class Persona {
    private String nombre;
    private String apellido;
    private float nota1;
    private float nota2;
    private float nota3;

    public Persona(String nombre, String apellido, float nota1, float nota2, float nota3) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }

    @Override
    public String toString() {
        float promedio;
        promedio=((nota1+nota2+nota3)/3);
        return nombre + "       " + apellido + "           " + nota1 + "    " + nota2 + "      " + nota3 + "      " + promedio;
    }
    
    
    
}
