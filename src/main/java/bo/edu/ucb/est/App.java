package bo.edu.ucb.est;

import java.util.Date;
import bo.edu.ucb.est.listaV2.Node;
import bo.edu.ucb.est.listaV2.SimpleList;
import bo.edu.ucb.est.listaV2.Student;
import bo.edu.ucb.est.listaV2.Teacher;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args ) {
        Teacher teacher1 = new Teacher("Orlando Rivera", "Ing. de Sistemas ");
        Teacher teacher2 = new Teacher("Miguel Villarroel", "Lic. en Informatica");
        Node<Teacher> nodeTeacher1 = new Node<Teacher> (teacher1, null);
        Node<Teacher> nodeTeacher2 = new Node<Teacher> (teacher2, null);
/*
        SimpleList teacherList = new SimpleList();
        teacherList.add(nodeTeacher1);
        teacherList.add(nodeTeacher2);
        teacherList.print();
*/
        System.out.println(" ====================  ");

        Student student1 = new Student("Juan ");
        Student student2 = new Student("Pedro ");
        Student student3 = new Student("Maria ");

        Node<Student> node1 = new Node<Student>(student1, null);
        Node<Student> node2 = new Node<Student>(student2, null);
        Node<Student> node3 = new Node<Student>(student3, null);

        SimpleList<Student> list = new SimpleList<>();
        list.add(node1);
        list.add(node2);
        list.add(node3);
//        list.add(nodeTeacher1);  No es posible debido a los generics
//        list.add(nodeTeacher2);  No es posible debido a los generics
        list.print();

        SimpleList<Date> dateList = new SimpleList<>();
        Node<Date> dateNode1 = new Node<>(new Date(), null);
        dateList.add(dateNode1);
        Node<Date> dateNode2 = new Node<>(new Date(), null);
        dateList.add(dateNode2);

        dateList.print();
    }

 //   public static void main( String[] args )
    public static void listaSimple()
    {
       Lista listaAlumnos  = new Lista();
       
       listaAlumnos.agregar(new Alumno("Melany Aranibar", "11222333")); // Agregar elemento
       listaAlumnos.agregar(new Alumno("Horacio Esprella", "222331122")); // Agregar elemento
       listaAlumnos.agregar(new Alumno("Jonathan Jared", "7723424")); // Agregar elemento
       listaAlumnos.agregar(new Alumno("Manuel Segaline", "231234555")); // Agregar elemento
       listaAlumnos.agregar(new Alumno("Bernad Gutierrez", "2010292335")); // Agregar elemento
       System.out.println("El tamanio de la lista es: " + listaAlumnos.getTamanio());
       listaAlumnos.imprimir(); // Imprimir el contenido
       //listaAlumnos.obtener(3); // Obtener un elemento por una posicion
       // listaAlumnos.eliminar(0); // Elimnar un elemento por una posicion

    }

    public void ejemploVector() {
        Alumno [] alumnos = new Alumno[3];
        alumnos[0] = new Alumno("Alejandra Pacheco", "1023123123");
        alumnos[1] = new Alumno("Naomi Tacachira", "1231233");
        alumnos[2] = new Alumno("Sebastian Belmonte", "123312312");
        // alumnos[3] = new Alumno("Melany Aranibar", "21123332");

        Alumno otro =  alumnos[1];
        System.out.println(otro.getNombreCompleto());
        otro.setCedulaItentidad("1123581321");
        System.out.println(alumnos[1].getCedulaItentidad());
    }
}
