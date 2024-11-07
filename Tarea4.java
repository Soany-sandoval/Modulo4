/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Tarea4 {
    
}

public class Empleados {
    private final String nombre;
    private final int edad;
    private final double salario;
    
    public Empleados(String nombre, int edad, double salario){
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }
    
    public String info(){
        return "Empleado: " + nombre + " , Edad: " + edad + ", Salario: " + salario;
        
    }
}

class Gestor{
    private final ArrayList<Empleado> lista = new ArrayList<>();
    
    public Gestor agregar(String nombre, int edad, double salario){
        return this;
    }
    public void mostrar() {
        for (int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i).info());
        }
    }
}

public class Main {
    public static void main(String[] args){
        new Gestor()
                .agregar("Ana", 28, 2800)
                .agregar("Carlos", 35, 3500)
                .mostrar();
    }
}
