public class Main {


    public static void main(String[] args) {

        System.out.println("Hello world!");

        // Tipos de datos en java

        //DATOS PRIMITIVOS
        //Bytes - entre -128 a 127
        byte myByte = 50;
        //Shorts - entre -32,768 hasta 32,767
        short myShort = 30000;
        //Int - entre -2,147,483,648 hasta 2,147,483,647
        int myInt = 224576334;
        //Long - entre -9,223,372,036,854,775,808 hasta
        // 9,223,372,036,854,775,807
        long myLong = 92342342332l;

        int my_short = 12;

        //Declaración de una variable
        long milesFromDestination;

        //Inicialización
        milesFromDestination = 100000l;

        // float | 4 bytes | Almacena números con decimales. Suficiente para almacenar 6 a 7 dígitos decimales

        float myFloat = 25.6767875f;

        //double | 8 bytes | Almacena números con decimales. Suficiente para almacenar 15 dígitos decimales

        double myDouble = 25.234234234234234;

        //Caracter
        char myChar = 'a';

        // booleans
        boolean isEmpty = true;
        boolean isHard = false;

        //DATOS NO PRIMITIVOS

        //Cadenas de texto
        String myName = "Jaume Sánchez Torres";
        System.out.println(myName);

        //Operadores más comunes
        System.out.println(5 + 10);
        System.out.println(10-5);
        System.out.println(10*5);
        System.out.println(10/5);
        System.out.println(10%5);

        myInt = 1;
        System.out.println("MY INT");
        System.out.println(++myInt);
        System.out.println(myInt);

        myInt += 5; // myInt = myInt + 5
        myInt *= 10;
        myInt /= 7;

        int age = 17;
        if(age >= 18) {
            System.out.println("Eres mayor de edad");
        } else if(age > 16 && age < 18) {
            System.out.println("Tienes 17 años");
        }
        else {
            System.out.println("Eres menor de edad");
        }


        int day = 4;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Weekend!");
                break;
        }

    }

}
