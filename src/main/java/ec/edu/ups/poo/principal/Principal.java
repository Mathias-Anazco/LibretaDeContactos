package ec.edu.ups.poo.principal;

import ec.edu.ups.poo.clases.Familiar;
import ec.edu.ups.poo.clases.Persona;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Compartiendo repositorio con Yandri Sanchez mensaje 1");
        System.out.println("Hola mundo");

        System.out.println("Probando el bransh");

        System.out.println("-----Libreta de contactos-----");
        System.out.println("Cuantas personas quieres ingresar");
        int numeroDePersona = sc.nextInt();

        Persona[] personas = new Persona[numeroDePersona];
        for (int i = 0; i < numeroDePersona; i++) {
            System.out.println("Persona " + (i+1) + ":");

            System.out.println("Ingrese el numero de cedula: ");
            String cedula = sc.next();
            System.out.println("Ingrese el nombre: ");
            String nombre = sc.next();
            System.out.println("Ingrese el apellido: ");
            String apellido = sc.next();
            System.out.println("Ingrese la direccion: ");
            String direccion = sc.next();

            Persona person = new Persona(cedula, nombre, apellido, direccion);
            personas[i] = person;
        }

        System.out.println("¿Cuantos familiares quieres ingresar?");
        int numeroFamiliares = sc.nextInt();
        sc.nextLine();

        Familiar[] familiares = new Familiar[numeroFamiliares];
        for (int i = 0; i < numeroFamiliares; i++) {
            Familiar familiar = new Familiar();

            System.out.println("Familiar " + (i + 1) + ":");

            System.out.println("Ingrese el numero de cedula: ");
            familiar.setCedula(sc.next());
            System.out.println("Ingrese el nombre: ");
            familiar.setNombre(sc.next());
            System.out.println("Ingrese el apellido: ");
            familiar.setApellido(sc.next());
            sc.nextLine();
            System.out.println("Ingrese la direccion: ");
            familiar.setDireccion(sc.nextLine());
            System.out.println("Ingrese el parentesco: ");
            familiar.setParentesco(sc.nextLine());
            System.out.println("Ingrese el tipo de sangre: ");
            familiar.setTipoDeSangre(sc.nextLine());
            System.out.println("Ingrese el año de nacimiento: ");
            int anio = sc.nextInt();
            System.out.println("Ingrese el mes de nacimiento entre 1 y 12: ");
            int mes = sc.nextInt();
            System.out.println("Ingrese el dia de nacimiento: ");
            int dia = sc.nextInt();
            sc.nextLine();


            GregorianCalendar fechaDeNacimiento = new GregorianCalendar(anio, mes, dia);
            familiar.setFechaDeNacimiento(fechaDeNacimiento);

            familiares[i] = familiar;
        }
        System.out.println("-----Lista de personas-----");
        for (int i = 0; i < numeroDePersona; i++) {
            System.out.println("Persona " + (i + 1) + ":");
            System.out.println(personas[i].toString());
        }
        //Para imprimir un arreglo de objetos
        System.out.println("-----Lista de familiares-----");
        for (int i = 0; i < numeroFamiliares; i++) {
            System.out.println("Familiar " + (i + 1) + ": ");
            System.out.println(familiares[i].toString());
        }
    }
}