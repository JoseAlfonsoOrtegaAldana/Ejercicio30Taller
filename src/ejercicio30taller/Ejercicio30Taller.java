/*
Utilizando arreglos (vectores o matrices) realizar una agenda telefónica la cual
permita almacenar: nombre, teléfono fijo, teléfono celular y fecha de nacimiento.
La agenda debe desplegar un menú que permita: 1. Agregar Contacto, 2 Buscar
Contacto 3. Ver contactos, 4 Eliminar Contactos, 5. Salir. Todos los datos deben
estar validados para que se entren datos erróneos, por ejemplo números de
teléfono con letras y nombres con números.
 */
package ejercicio30taller;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Jose Ortega Aldana
 */
public class Ejercicio30Taller {
    
    public static void main(String[] args) {
        //Definir Variables
        Scanner entrada = new Scanner(System.in);
        Scanner entrada1 = new Scanner(System.in);
        
        ArrayList<String> nombre = new ArrayList<String>();
        ArrayList<String> telefono = new ArrayList<String>();
        ArrayList<String> celular = new ArrayList<String>();
        ArrayList<String> nacim = new ArrayList<String>();
        
        int opcion;
        String name;
        boolean encontrado = false;
        do{
            System.out.println("AGENDA \n"
                    + "1. AGREGAR CONTACTO \n"
                    + "2. BUSCAR CONTACTO \n"
                    + "3. VER CONTACTO \n"
                    + "4. ELIMINAR \n"
                    + "5. SALIR");
            System.out.print("SELECCIONE UNA OPCION: ");
            opcion = entrada.nextInt();
            System.out.println(" ");
            switch (opcion){
                case 1:
                    System.out.println("AGREGAR CONTACTO");
                    System.out.println(" ");
                    System.out.print("NOMBRE: ");
                    nombre.add(entrada1.nextLine());
                    System.out.print("TELEFONO: ");
                    telefono.add(entrada1.nextLine());
                    System.out.print("CELULAR: ");
                    celular.add(entrada1.nextLine());
                    System.out.print("NACIMIENTO: ");
                    nacim.add(entrada1.nextLine());
                    System.out.println(" ");
                    System.out.println("CONTACTO ASIGNANDO CORRECTAMENTE");
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.println("BUSCAR CONTACTO");
                    System.out.println(" ");
                    System.out.print("NOMBRE: ");
                    name = entrada1.nextLine();
                    for (int i=0; i < nombre.size(); i++){
                        if (nombre.get(i).equals(name)){
                            System.out.println("NOMBRE: "+nombre.get(i));
                            System.out.println("TELEFONO: "+telefono.get(i));
                            System.out.println("CELULAR: "+celular.get(i));
                            System.out.println("NACIMIENTO: "+nacim.get(i));
                            System.out.println(" ");
                            encontrado = true;
                        }
                    }
                    if (!encontrado){
                        System.out.println("CONTACTO NO ENCONTRADO");
                        encontrado = false;    
                        System.out.println(" ");
                    }else{
                        encontrado = false;
                    }
                    break;
                case 3:
                    System.out.println("VER CONTACTO");
                    System.out.println(" ");
                    for (int i=0; i < nombre.size(); i++){
                        System.out.println("CONTACTO NO: "+(i+1));
                        System.out.println(" ");
                        System.out.println("NOMBRE: "+nombre.get(i));
                        System.out.println("TELEFONO: "+telefono.get(i));
                        System.out.println("CELULAR: "+celular.get(i));
                        System.out.println("NACIMIENTO: "+nacim.get(i));
                        System.out.println(" ");
                    }
                    break;
                case 4:
                    System.out.println("ELIMINAR CONTACTO");
                    System.out.println(" ");
                    System.out.print("NOMBRE: ");
                    name = entrada1.nextLine();
                    for (int i=0; i < nombre.size(); i++){
                        if (nombre.get(i).equals(name)){
                            nombre.remove(i);
                            telefono.remove(i);
                            celular.remove(i);
                            nacim.remove(i);
                            encontrado = true;
                        }
                    }
                    if (encontrado){
                        System.out.println("Contacto eliminado");
                        System.out.println(" ");
                        encontrado = false;
                    }
                    break;
                case 5:
                    System.out.println("Fin del programa");
                    System.out.println(" ");
                    break;
                default:
                    System.out.println(" ");
                    System.out.println("OPCION NO VALIDA");
                    System.out.println(" ");
                    break;
            }
            
        }while(opcion != 5);
    }
    
}
