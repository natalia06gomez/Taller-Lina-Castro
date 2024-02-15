/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unipiloto.estDatos.generics.date;

/**
 *
 * @author USUARIO
 */
public class Date implements Datable, ComparableDate {

    //Atributos
    private int dia, mes, anho;
    

// Constructores
    public Date() {
        this.dia=1;
        this.mes=1;
        this.anho=1900;
        
    }

    public Date(int dia, int mes, int anho) {
        this.dia = dia;
        this.mes = mes;
        this.anho = anho;
    }

    @Override
    public int month() {
        return mes;
    }

    @Override
    public int day() {
        return dia;
    }

    @Override
    public int year() {
        return anho;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnho(int anho) {
        this.anho = anho;
    }

    @Override
    public String toString() {
        return "Date{" + "dia=" + dia + ", mes=" + mes + ", anho=" + anho + '}';
    }

    @Override
    public int compareTo(Date d) {
        //Si es menor retorna valor negativo
        
        if (anho < d.year()) {
            return -1;
        }
        //Si es mayor retorna un valor positivo
        if (anho > d.year()) {
            return 1;
        }
        //Son iguales los anos
        if (mes < d.month()) {
            return -1;
        }
        if (mes > d.month()) {
            return 1;
        }
        //Son iguales los anos y meses
        if (dia < d.day()) {
            return -1;
        }
        if (dia > d.day()) {
            return 1;
        }
        //Son iguales
        return 0;
    }

    public boolean equals(Date x) {
        if (this == x) {
            return true;
        }
        if (x == null) {
            return false;
        }
        if (this.getClass() != x.getClass()) {
            return false;
        }
        Date that = (Date) x;
        if (this.dia != that.dia) {
            return false;
        }
        if (this.mes != that.mes) {
            return false;
        }
        if (this.anho != that.anho) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Date f1 = new Date(8, 02, 2024);
        Date f2 = new Date(8, 02, 2024);
        System.out.println("La comparación de " + f2.toString() + " con " + f1.toString() + " es " + f2.compareTo(f1));
        System.out.println(f1.toString()+" es igual a"+f2.toString()+" es "+f1.equals(f2));
        
      }

    @Override
    public int compareTo(java.util.Date d) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}