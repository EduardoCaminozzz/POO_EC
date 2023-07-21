//MAIN
//agregar un límite de 10 matrias para el docente, si llegó temprano, y ambiente laboral (para los demás trabajores tmb)
//
package GestionPagos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Variables para almacenar los datos ingresados por el usuario
        String nombre, apellido, cedula, genero = null;
        int edad, asignatura, soluciones, horasExtra, habitaciones;
        int sueldoBase;
        System.out.println("Bienvenido");
        System.out.println("Presione [1] para empezar");
        System.out.println("-----------------------------------");
        int opcion = Integer.parseInt(sc.nextLine());
        // Menú para seleccionar el tipo de personal y calcular el sueldo
        System.out.println("Bienvenido");
        do {

            System.out.println("Seleccione el tipo de personal:");
            System.out.println("[1] Docente");
            System.out.println("[2] Técnico");
            System.out.println("[3] Administrativo");
            System.out.println("[4] Limpieza");
            System.out.println("[5] Salir");
            opcion = Integer.parseInt(sc.nextLine());
            switch (opcion) {
                case 1:
                    // Ingresar información del docente
                    System.out.println("-----------------------------------");
                    System.out.println("Ingrese nombre del docente:");
                    nombre = sc.nextLine();
                    System.out.println("Ingrese apellido del docente:");
                    apellido = sc.nextLine();
                    System.out.println("Ingrese edad del docente:");
                    edad = Integer.parseInt(sc.nextLine());
                    System.out.println("Ingrese cédula del docente:");
                    cedula = sc.nextLine();
                    System.out.println("Ingrese género del docente M[masculino] o F[femenino]:");
                    genero = sc.nextLine();
                    
                    do {
                        System.out.println("Ingrese sueldo base del docente:");
                        sueldoBase = (int) Double.parseDouble(sc.nextLine());
                    } while (sueldoBase <= 0);

                    System.out.println("Ingrese número de asignaturas que imparte el docente:");
                    System.out.println("[El sueldo del docente se incrementará en un 20% por cada asignatura impartida]");
                    asignatura = obtenerDatoValido(sc, 10);

                    // Crear objeto Docente y calcular sueldo
                    Docente docente = new Docente(nombre, apellido, edad, cedula, genero, asignatura, sueldoBase);
                    double sueldoDocente = docente.calcularSueldo();

                    // Mostrar información y sueldo del docente
                    docente.mostrarInfo();
                    System.out.println("Asignaturas impartidas por el docente: " + asignatura);
                    System.out.println("Sueldo del docente: $" + sueldoDocente);
                    System.out.println("-----------------------------------");
                    break;

                case 2:
                    // Ingresar información del técnico
                    System.out.println("-----------------------------------");
                    System.out.println("Ingrese nombre del técnico:");
                    nombre = sc.nextLine();
                    System.out.println("Ingrese apellido del técnico:");
                    apellido = sc.nextLine();
                    System.out.println("Ingrese edad del técnico:");
                    edad = Integer.parseInt(sc.nextLine());
                    System.out.println("Ingrese cédula del técnico:");
                    cedula = sc.nextLine();
                    System.out.println("Ingrese género del técnico M[masculino] o F[femenino]:");
                    do {
                        System.out.println("Ingrese sueldo base del docente:");
                        sueldoBase = (int) Double.parseDouble(sc.nextLine());
                    } while (sueldoBase <= 0);

                    System.out.println("Ingrese número de asignaturas que imparte el docente:");
                    System.out.println("[El sueldo del tecnico se incrementará en un 15% por cada solucion brindada]");
                     soluciones=obtenerDatoValido(sc, 200);

                    // Crear objeto Docente y calcular sueldo
                    Tecnico tecnico = new Tecnico(nombre, apellido, edad, cedula, genero, soluciones,sueldoBase);
                    double sueldoTecnico = tecnico.calcularSueldo();

                    // Mostrar información y sueldo del docente
                    tecnico.mostrarInfo();
                    System.out.println("Asignaturas impartidas por el docente: " + soluciones);
                    System.out.println("Sueldo del docente: $" + sueldoTecnico);
                    System.out.println("-----------------------------------");
                    break;
                case 3:
                    // Ingresar información del administrativo
                    System.out.println("-----------------------------------");
                    System.out.println("Ingrese nombre del administrativo:");
                    nombre = sc.nextLine();
                    System.out.println("Ingrese apellido del administrativo:");
                    apellido = sc.nextLine();
                    System.out.println("Ingrese edad del administrativo:");
                    edad = Integer.parseInt(sc.nextLine());
                    System.out.println("Ingrese cédula del administrativo:");
                    cedula = sc.nextLine();
                    System.out.println("Ingrese género del administrativo M[masculino] o F[femenino]:");
                    genero = sc.nextLine();
                    System.out.println("Ingrese número de horas extra trabajadas por el administrativo:");
                    horasExtra = obtenerDatoValido(sc, 250);
                    
                    do {
                        System.out.println("Ingrese sueldo base del administrativo");
                        sueldoBase = (int) Double.parseDouble(sc.nextLine());
                    } while (sueldoBase <= 0);

                    // Crear objeto Administrativo y calcular sueldo
                    Administrativo administrativo = new Administrativo(nombre, apellido, edad, cedula, genero, horasExtra,sueldoBase);
                    double sueldoAdministrativo = administrativo.calcularSueldo();

                    // Mostrar información y sueldo del administrativo
                    administrativo.mostrarInfo();
                    System.out.println("Horas extras trabajadas por el administrativo: " + horasExtra);
                    System.out.println("Sueldo del administrativo: $" + sueldoAdministrativo);
                    System.out.println("-----------------------------------");
                    break;

                case 4:
                    // Ingresar información del personal de limpieza
                    System.out.println("-----------------------------------");
                    System.out.println("Ingrese nombre del personal de limpieza:");
                    nombre = sc.nextLine();
                    System.out.println("Ingrese apellido del personal de limpieza:");
                    apellido = sc.nextLine();
                    System.out.println("Ingrese edad del personal de limpieza:");
                    edad = Integer.parseInt(sc.nextLine());
                    System.out.println("Ingrese cédula del personal de limpieza:");
                    cedula = sc.nextLine();
                    System.out.println("Ingrese género del personal de limpieza M[masculino] o F[femenino]:");
                    genero = sc.nextLine();
                    System.out.println("Ingrese número de habitaciones aseadas por el personal de limpieza:");
                    habitaciones = obtenerDatoValido(sc, 300);
                    do {
                        System.out.println("Ingrese sueldo base del personal de limpiea:");
                        sueldoBase = (int) Double.parseDouble(sc.nextLine());
                    } while (sueldoBase <= 0);
                    // Crear objeto Limpieza y calcular sueldo
                    Limpieza limpieza = new Limpieza(nombre, apellido, edad, cedula, genero, habitaciones,sueldoBase);
                    double sueldoLimpieza = limpieza.calcularSueldo();

                    // Mostrar información y sueldo del personal de limpieza
                    limpieza.mostrarInfo();
                    System.out.println("Habitaciones aseadas por el personal: " + habitaciones);
                    System.out.println("Sueldo del personal de limpieza: $" + sueldoLimpieza);
                    System.out.println("-----------------------------------");
                    break;
                case 5:
                    System.out.println("Gracias por usar el programa");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    System.out.println("-----------------------------------");
            }

        } while (5 != opcion);
    }

    public static int obtenerDatoValido(Scanner sc, int limite) {
        int dato;
        do {
            dato = Integer.parseInt(sc.nextLine());
            if (dato > limite) {
                System.out.println("El dato ingresado supera el límite de " + limite + ", inténtelo nuevamente.");
            }
        } while (dato > limite);
        return dato;
    }
}


