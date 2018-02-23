
package tarea3_201503402;

import java.util.Scanner;


public class Acciones {
    int seleccion;
    int contador=5;
    int number;
    int contador1=0;
    String texto;
    Scanner entrada = new Scanner(System.in);
    String [] usuarios = new String [5];
    int [] Numeros = new int [3];
    
     public void usuarios()
    {
        do {
       
            System.out.println("1. Ingresar Usuarios");
            System.out.println("2. Mostrar Usuarios ascendente");
            System.out.println("3. Mostrar Usuarios descendentes");
            System.out.println("4. Menu Principal");
            seleccion = Integer.parseInt(entrada.nextLine());
            seleccion (seleccion);
        }while(seleccion == 4);  
    }
     public void Digitos()
    {
        do {
       
            System.out.println("1. Ingresar numero");
            System.out.println("2. Mostrar numero de digitos");
            System.out.println("3. Menu principal");
            seleccion = Integer.parseInt(entrada.nextLine());
            select (seleccion);
        }while(seleccion == 3);  
    }
     
     public void Numeros()
    {
        do {
       
            System.out.println("1. Ingresar numero");
            System.out.println("2. Mostrar ordenados");
            System.out.println("3. Menu principal");
            seleccion = Integer.parseInt(entrada.nextLine());
            select1 (seleccion);
        }while(seleccion == 3);  
    }
     public void Promedio()
    {
        do {
      
            System.out.println("1. Mostrar promedio");
            System.out.println("2. Menu principal");
            seleccion = Integer.parseInt(entrada.nextLine());
            select2 (seleccion);
        }while(seleccion == 2);  
    }
     
     public void seleccion (int numero) 
    {
        switch (numero)
        {
            case 1:
                for(int i = 0; i < usuarios.length; i++ )
                {
                    if(contador==0){
                        System.out.println("Lista llena.");
                        usuarios();
                    }else{
                        System.out.println("Ingresar Usuarios ");
                        texto=entrada.nextLine();
                        if (usuarios[i]!= null)
                        { 
                            if(verificacion(texto)){

                                usuarios[i]= texto;
                            }else 
                            {
                                System.out.println("Usuario Ya Existe");
                                usuarios();
                            }
                        }
                        else if(usuarios [i]== null)
                        {
                           if(verificacion(texto)){

                                usuarios[i]= texto;
                            }else 
                            {
                                System.out.println("Usuario Ya Existe");
                                usuarios();
                            }
                        }
                        contador--;
                    }
                }
                usuarios();
            break;
            case 2:
                for(int i=0;i<usuarios.length;i++){
                    if(usuarios[i]!=null){
                        System.out.println((i+1)+" "+usuarios[i]);
                    }else{
                        System.out.println("Ingrese usuario.");
                        break;
                    }
                }
                usuarios();
            break;
            case 3:
                for(int i=4;i<usuarios.length;i--){
                    if(i>=0){
                        if(usuarios[i]!=null){
                            System.out.println((i+1)+" "+usuarios[i]);
                        }else{
                            System.out.println("Ingrese usuario.");
                            break;
                        }
                    }
                }
                usuarios();
            break;
            case 4: 
                Menu retorno = new Menu ();
                retorno.mostrarMenu();
        }
    }

     public void select (int numero) 
    {
        switch (numero)
        {
            case 1:
                System.out.println("Ingresar Numero");
                number = Integer.parseInt(entrada.nextLine());
                Digitos();
            break;
            case 2:
                while(number>=1)
                {
                    number=number/10;
                    contador1 = contador1 + 1;
                }
                System.out.println("El numero de digitos es: " + contador1);
                Digitos();
            break;
            case 3:
                Menu retorno = new Menu ();
                retorno.mostrarMenu();
        }
    }
     public void select1 (int numero) 
    {
        switch (numero)
        {
            case 1:
                for(int a = 0; a < Numeros.length; a++)
                { 
                    System.out.println("Ingresar Numeros");
                    ordenar();
                    Numeros[a] = Integer.parseInt(entrada.nextLine());
                }
                Numeros();
            break;
            case 2:
                for(int a = 0; a < Numeros.length; a++)
                {
                    System.out.println((a+1)+ " " + Numeros[a]);
                }
                Numeros();
            break;
            case 3:
                Menu retorno = new Menu ();
                retorno.mostrarMenu();
        }
    }
     public void select2 (int numero) 
    {
        switch (numero)
        {
            case 1:
            break;
            case 2:
                Menu retorno = new Menu ();
                retorno.mostrarMenu();
        }
    }
     public boolean verificacion(String nombre)
     {
         boolean resultado = true;
         for(int a = 0; a < usuarios.length; a++)
         {  
            if(usuarios [a]!=null){
                if(usuarios [a].equalsIgnoreCase(nombre))
                {
                    resultado= false;        
                }else 
                {
                    resultado= true;
                }
            }
         }
        return resultado;
     }
     public void ordenar ()
     {
        for(int i=0; i<2; i++)
        {
            for(int j=0; j<2-1; j++)
            {
                if(Numeros[j]>Numeros[j+1])
                {
                    int aux;
                    aux = Numeros[j];
                    Numeros[j]= Numeros [j+1];
                    Numeros[j+1]= aux;
                }
            }
        } 
     }
}
