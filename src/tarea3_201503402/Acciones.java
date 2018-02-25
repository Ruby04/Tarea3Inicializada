
package tarea3_201503402;

import java.util.Scanner;


public class Acciones {
    int seleccion;      //Creando variables de tipo int, string, y scanner .
    int contador=5;
    int number;
    int contador1=0;
    String texto;
    Scanner entrada = new Scanner(System.in);
    String [] usuarios = new String [5];
    int [] Numeros = new int [3];
    //int notas [][] = new int [4][4];
    float notas [][] = new float [6][6]; //se crea un arreglo float para poder ingresar decimales y que sea màs flexible el dato.
    
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
                for(int i = 0; i < usuarios.length; i++ )  //recorre el usuario
                {
                    if(contador==0){    //contador inicia en cero
                        System.out.println("Lista llena."); //muestra lista llena
                        usuarios();     //regresa al menu usuarios
                    }else{
                        System.out.println("Ingresar Usuarios ");   //si no es igual a cero, ingresar dato
                        texto=entrada.nextLine();   //ingresar datos
                        if (usuarios[i]!= null)     //los usuarios no son iguales
                        { 
                            if(verificacion(texto)){    //verificacion del texto
                                usuarios[i]= texto;   //usuarios debe ser igual al texto
                            }else 
                            {
                                System.out.println("Usuario Ya Existe"); //si el texto fue ingresado anteriormente, mostar mensaje
                                usuarios();     // regresar al menu usuarios
                            }
                        }
                        else if(usuarios [i]== null)    // sino son iguales a nulo
                        {
                           if(verificacion(texto)){ //verificacion del texto
                                usuarios[i]= texto; //usuarios igual a texto
                            }else 
                            {
                                System.out.println("Usuario Ya Existe");    //si ya existe mostar mensaje
                                usuarios();     //regresar al menu usuarios
                            }
                        }
                        contador--; //mientras se ingresan los usuarios, el contador ira disminuyendo en 1 hasta no quedar ningun espacio que llenar
                    }
                }
                usuarios(); //regresar al menu usuarios
            break;
            case 2:
                for(int i=0;i<usuarios.length;i++){ //ciclo que recorre los usuarios
                    if(usuarios[i]!=null){  //los usuarios no tienen que ser igual a nulo
                        System.out.println((i+1)+" "+usuarios[i]);  //salida de usuarios de menor a mayor
                    }else{
                        System.out.println("Ingrese usuario."); //ingresar usuarios
                        break;
                    }
                }
                usuarios(); //regresar al menu usuarios
            break;
            case 3:
                for(int i=4;i<usuarios.length;i--){ //ciclo que recorre los usuarios
                    if(i>=0){   //si los usuarios son mayor o igual cero
                        if(usuarios[i]!=null){  //si los usuarios no son igual a nulo
                            System.out.println((i+1)+" "+usuarios[i]);  //imprimir los usuarios de mayor a menor
                        }else{
                            System.out.println("Ingrese usuario."); //ingresar usuarios
                            break;
                        }
                    }
                }
                usuarios(); //regresar al menu usuarios
            break;
            case 4: 
                Menu retorno = new Menu (); //regresar al menu principal
                retorno.mostrarMenu();
        }
    }

     public void select (int numero) 
    {
        switch (numero)
        {
            case 1:
                System.out.println("Ingresar Numero"); 
                texto = entrada.nextLine();     //Entrada
                if (comprobar (texto)){     //comprueba la entrada, en el cual debe haber un numero
                    texto = texto;
                }else{
                    System.out.println("No es un numero");  //En caso contrario, muestra mensaje
                }
                Digitos();  //Regresa a menu digitos
                if (number > 100000){       //si el numero es mayor que 100000
                    System.out.println("Error");    //mostrar error
                }
                Digitos();  //regresar al menu digitos
            break;
            case 2:
                while(number>=1)       //el numero tiene que se mayor o igual 1
                {
                    number=number/10;   //para poder obtener decimal se divide el numero ingresado en 10
                    contador1 = contador1 + 1;  //el contador ira aumentado en 1
                }
                System.out.println("El numero de digitos es: " + contador1);
                Digitos();  //regresar al menu digitos
            break;
            case 3:
                Menu retorno = new Menu ();
                retorno.mostrarMenu();  //regresar al menu principal
        }
    }
     public void select1 (int numero) 
    {
        switch (numero)
        {
            case 1:
                 for(int i = 0; i < Numeros.length; i++)     
                { 
                    System.out.println("Ingresar Numeros");
                    texto = entrada.nextLine();  
                    if (comprobar (texto)){     //comprueba texto de entrada
                        Numeros[i] = Integer.parseInt(texto);
                    }else{
                        System.out.println("No es un numero");      //Si no son numeros muestra mensaje
                        Numeros();  //regresa al menu numeros
                    }
                }
                ordenar();  //llama el metodo ordenar
                Numeros();  //regresa al menu numeros
            break;
            case 2:
                for(int i = 0; i < Numeros.length; i++)     //Recorre la fila
                {
                    System.out.println((i+1)+ " " + Numeros[i]);    //Muestra los numeros de mayor a menor
                }
                Numeros();  //regresa al menu numeros
            break;
            case 3:
                Menu retorno = new Menu ();
                retorno.mostrarMenu();  //Regresa al menu principal
        }
    }
     public void select2 (int numero) 
    {
        switch (numero)
        {
            case 1:
                notes();
                for(int i = 0; i <= 5; i ++){ // Recorre las filas
                    for (int j = 0; j <= 5; j ++){ // Recorre las columnas
                        if(j == 0){ // Cuando la columna sea 0 que contiene los ID's
                            System.out.print("ID: " + notas[i][j]); // Muesta cuando la columna sea 0 los ID's
                        }
                        if(j >= 1 && j <= 4){ // Cuando la columna sea >=1 y <=4 que contiene las notas
                            System.out.print("   " + notas[i][j]); // Muestra las notas con unos cuantos espacios para que no se ofusque
                        }
                        if(j == 5){ // si la columna es igual a la ultima posicion que en este caso es 5, contiene el promedio
                            System.out.print("   Promedio:" + notas[i][j] + "\t"); // Muestra el promedio y baja de linea
                        }
                    }
                    System.out.println(" "); //Separacion
                }
                Promedio(); //Regresa al menu promedio
            break;
            case 2:
                Menu retorno = new Menu ();
                retorno.mostrarMenu();  //Regresa al menu principal
        }
    }
     public boolean verificacion(String nombre)
     {
         boolean resultado = true;  // El resultado tiene que ser verdadero
         for(int a = 0; a < usuarios.length; a++)   //Recorre los usuarios
         {  
            if(usuarios [a]!=null){ //Si los usuarios no son nulos
                if(usuarios [a].equalsIgnoreCase(nombre)) //Ignora los case para encontrar el nombre ingresado
                {
                    resultado= false;  //si no se encuentra el resultado sera falso
                }else 
                {
                    resultado= true;    //de lo contrario, serà verdader
                }
            }
         }
        return resultado;   //Regresar a resultado
     }
     public void ordenar ()
     {
        int aux;    //variable llamada auziliar
        for(int i=0; i<Numeros.length-1; i++)   //Recorre las filas
        {
            for(int j=0; j<Numeros.length-1-i; j++) //Recorre las columnas
            {
                if(Numeros[j+1]<Numeros[j]) //Si aumenta en uno
                {
                    aux = Numeros[j+1]; //la variable aumentara en uno
                    Numeros[j+1]= Numeros [j];  //ek numero tiene que ser al numero mas uno
                    Numeros[j]= aux;    //sera igual a la variable 
                }
            }
        } 
     }
     public void notes ()
     {
        Scanner entrada = new Scanner(System.in);
        //float notas [][] = new float [4][4];
        float suma = 0;
        /*la matriz se define 6*6 pero la maquina reconoce de 0 a 5 tomando como 0 la posicion 1*/
        for(int i = 0; i <= 5; i++){ // Ciclo que recorre las filas
            for( int j = 0; j <= 5; j++){ // Ciclo que recorre las columnas
                if(j == 0){ // si la columna es igual a 0 en (x,y) = (x,0)
                    System.out.println("Ingrese ID del Estudiante");
                    notas[i][j] = entrada.nextInt(); //Guarda el Id que el usuario ingrese
                }
                if(j >= 1 && j <= 4){ //Columas desde 1 hasta 4 
                    System.out.println("Ingresar Nota");
                    notas[i][j] = entrada.nextInt(); // Almacena las notas
                    suma = suma + notas[i][j]; // Almacena la suma de las notas(primero ID0 luego ID1 y asi sicesivamente)
                }
                if(j == 5){
                    notas[i][j] = suma/4; // Almacena en la ultima columna de la matriz el promedio
                }
            }
            suma = 0; // Borra la variable suma para volver a sumar las notas del siguente ID
        }
     }
     private boolean comprobar (String texto){
         try {
             Integer.parseInt(texto);
             return true;
         }catch (NumberFormatException ex){ //Excepcion de letras en donde deben ingresar numeros
             return false;
         } 
     }
}