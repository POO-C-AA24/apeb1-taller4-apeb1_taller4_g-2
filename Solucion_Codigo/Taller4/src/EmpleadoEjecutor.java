
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Carlos Sánchez
 */
public class EmpleadoEjecutor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de empleados que va a añadir");
        int cantidadEmpleados = sc.nextInt();
        sc.nextLine(); //Limpiar buffer
        while(cantidadEmpleados <=  0){ //Forzar a que ingrese mayores a 0.
            cantidadEmpleados = sc.nextInt();
        }
        String nombre;
        double salario;
        int edad;
        double salariosAcumulados = 0;
        
        Empleado empleados[] = new Empleado[cantidadEmpleados];
        
        
        for(int i = 0; i < cantidadEmpleados; i++){            
            System.out.println("Ingrese nombre del empleado: " + (i+1));
            nombre = sc.nextLine();
            System.out.println("Ingrese edad del empleado:");
            edad = sc.nextInt();
            System.out.println("Ingrese salario del empleado: ");
            salario = sc.nextDouble();
            salariosAcumulados += salario; //Acumular para despues sacar promedio
            
            //Agregar empleado a la lista
            empleados[i] = new Empleado(nombre, edad, salario);
            sc.nextLine(); //Limpiar buffer
            
            System.out.println("Empleado agregado exitosamente.");
        }
        
        //Mostrar información de los empleados:
        mostrarInformacion(empleados);
        
        //Calcular aumento salarial con el promedio
        double promedioSalarial = salariosAcumulados / cantidadEmpleados;
        
        System.out.println("Ingrese en porcentaje del aumento salarial: ");
        int porcentajeAumento = sc.nextInt();
        
        //Aumentar salarios
        aumentarSalario(empleados, promedioSalarial, porcentajeAumento);
        
        //Mostrar nueva informacion con salarios actualizados:
        System.out.println("Salarios actualizados: ");
        mostrarInformacion(empleados);
        
    }

    private static void mostrarInformacion(Empleado[] empleados) {
        for(int i = 0; i < empleados.length; i++){
            System.out.println("----Empleado " + (i+1) + " ----");
            System.out.println(empleados[i].toString());
            
        }
    }

    private static void aumentarSalario(Empleado[] empleados, double promedioSalarial, int aumento) {
        double salarioActual;
        for(int i = 0; i < empleados.length; i++){
            salarioActual = empleados[i].getSalario();
       
            if(salarioActual < promedioSalarial)
                empleados[i].aumentarSalario(aumento);     
        }
    }
}
