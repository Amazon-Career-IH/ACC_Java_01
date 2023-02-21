import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

/*

        Scanner input = new Scanner(System.in);
        System.out.println("Por favor, introduce tu nombre");
        String name = input.nextLine();

        System.out.println("Bienvenido, " + name);
        System.out.println("Introduce tu edad:");


        int age = Integer.parseInt(input.nextLine());

        while (age < 0) {
            System.out.println("La edad no puede ser negativa");
            age = Integer.parseInt(input.nextLine());
        }
 */

        /*

        int age2 = input.nextInt();
        input.nextLine();

        //Jaume\n
        //34
        //\n


        System.out.println("Tu edad es " + age);

        System.out.println("Introduce tu ciudad de nacimiento:");
        String city = input.nextLine();
        System.out.println("Has nacido en " + city);

        input.close();

        //Para crear archivos, utilizamos la clase FileWriter

        FileWriter writer = new FileWriter("alumnos.txt", true);

        for (int i = 0; i < 10; i++) {
            writer.write(name + i + " , " + age++ + ", " + city + "\n");
        }

        writer.close();

        File alumnos = new File("alumnos.txt");
        Scanner fileReader = new Scanner(alumnos);

        while (fileReader.hasNextLine()) {
            System.out.println(fileReader.nextLine());
        }
         */

        Car myAudi = new Car("Red", 1200.40, 210, "Audi Q3");
        Car myCitroen = new Car("Citroen C4");

        System.out.println(myAudi.getColor());
        System.out.println(myCitroen.getColor());

        System.out.println(myAudi.getId());
        System.out.println(myCitroen.getId());

        System.out.println(Car.getCounter());

        Mamifero perro = new Mamifero("Toby", 10, "Masculino", false, 4);

        Animal generico = new Animal("Pepe", 20, "Femenino");

        System.out.println(perro.getName());

        Animal[] misAnimales = new Animal[2];
        misAnimales[0] = perro;
        misAnimales[1] = generico;






    }

    public static int sumar(int x, int y) {
        return x + y;
    }
}
