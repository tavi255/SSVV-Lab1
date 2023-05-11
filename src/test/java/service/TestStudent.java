package service;

import domain.Student;

import org.testng.annotations.Test;
import repository.*;
import validation.NotaValidator;
import validation.StudentValidator;
import validation.TemaValidator;
import validation.ValidationException;

import static org.testng.AssertJUnit.*;


public class TestStudent {



    @Test(expectedExceptions = ValidationException.class)
    public void addStudent1()
    {
        StudentValidator studentValidator = new StudentValidator();
        TemaValidator temaValidator = new TemaValidator();
        String filenameStudent = "fisiere/Studenti_teste.xml";
        String filenameTema = "fisiere/Teme_teste.xml";
        String filenameNota = "fisiere/Note_teste.xml";



        StudentXMLRepo studentXMLRepository = new StudentXMLRepo(filenameStudent);
        TemaXMLRepo temaXMLRepository = new TemaXMLRepo(filenameTema);
        NotaValidator notaValidator = new NotaValidator(studentXMLRepository, temaXMLRepository);
        NotaXMLRepo notaXMLRepository = new NotaXMLRepo(filenameNota);
        Service service = new Service(studentXMLRepository, studentValidator, temaXMLRepository, temaValidator, notaXMLRepository, notaValidator);

        Student s=new Student("0","Luci",937,"luci@gmail.com");




     service.addStudent(s);





    }

    @Test()
    public void addStudent2()
    {
        StudentValidator studentValidator = new StudentValidator();
        TemaValidator temaValidator = new TemaValidator();
        String filenameStudent = "fisiere/Studenti_teste.xml";
        String filenameTema = "fisiere/Teme_teste.xml";
        String filenameNota = "fisiere/Note_teste.xml";



        StudentXMLRepo studentXMLRepository = new StudentXMLRepo(filenameStudent);
        TemaXMLRepo temaXMLRepository = new TemaXMLRepo(filenameTema);
        NotaValidator notaValidator = new NotaValidator(studentXMLRepository, temaXMLRepository);
        NotaXMLRepo notaXMLRepository = new NotaXMLRepo(filenameNota);
        Service service = new Service(studentXMLRepository, studentValidator, temaXMLRepository, temaValidator, notaXMLRepository, notaValidator);

        Student s=new Student("1","Luci",937,"luci@gmail.com");

        Student s2=new Student("10000","Luci",937,"luci@gmail.com");





       service.addStudent(s);
      service.addStudent(s2);


    }

    @Test(expectedExceptions = ValidationException.class)
    public void addStudent3()
    {
        StudentValidator studentValidator = new StudentValidator();
        TemaValidator temaValidator = new TemaValidator();
        String filenameStudent = "fisiere/Studenti_teste.xml";
        String filenameTema = "fisiere/Teme_teste.xml";
        String filenameNota = "fisiere/Note_teste.xml";




        StudentXMLRepo studentXMLRepository = new StudentXMLRepo(filenameStudent);
        TemaXMLRepo temaXMLRepository = new TemaXMLRepo(filenameTema);
        NotaValidator notaValidator = new NotaValidator(studentXMLRepository, temaXMLRepository);
        NotaXMLRepo notaXMLRepository = new NotaXMLRepo(filenameNota);
        Service service = new Service(studentXMLRepository, studentValidator, temaXMLRepository, temaValidator, notaXMLRepository, notaValidator);

        Student s=new Student("10001","Luci",937,"luci@gmail.com");



       service.addStudent(s);


    }

    @Test(expectedExceptions = ValidationException.class)
    public void addStudent4()
    {
        StudentValidator studentValidator = new StudentValidator();
        TemaValidator temaValidator = new TemaValidator();
        String filenameStudent = "fisiere/Studenti_teste.xml";
        String filenameTema = "fisiere/Teme_teste.xml";
        String filenameNota = "fisiere/Note_teste.xml";




        StudentXMLRepo studentXMLRepository = new StudentXMLRepo(filenameStudent);
        TemaXMLRepo temaXMLRepository = new TemaXMLRepo(filenameTema);
        NotaValidator notaValidator = new NotaValidator(studentXMLRepository, temaXMLRepository);
        NotaXMLRepo notaXMLRepository = new NotaXMLRepo(filenameNota);
        Service service = new Service(studentXMLRepository, studentValidator, temaXMLRepository, temaValidator, notaXMLRepository, notaValidator);

        Student s=new Student("5","",937,"luci@gmail.com");



        service.addStudent(s);
    }

    @Test()
    public void addStudent5()
    {
        StudentValidator studentValidator = new StudentValidator();
        TemaValidator temaValidator = new TemaValidator();
        String filenameStudent = "fisiere/Studenti_teste.xml";
        String filenameTema = "fisiere/Teme_teste.xml";
        String filenameNota = "fisiere/Note_teste.xml";



        StudentXMLRepo studentXMLRepository = new StudentXMLRepo(filenameStudent);
        TemaXMLRepo temaXMLRepository = new TemaXMLRepo(filenameTema);
        NotaValidator notaValidator = new NotaValidator(studentXMLRepository, temaXMLRepository);
        NotaXMLRepo notaXMLRepository = new NotaXMLRepo(filenameNota);
        Service service = new Service(studentXMLRepository, studentValidator, temaXMLRepository, temaValidator, notaXMLRepository, notaValidator);

        Student s=new Student("5","N",937,"luci@gmail.com");

        Student s2=new Student("7","Pablo Diego José Francisco de Paula Juan Nepomuceno María de los Remedios Cipriano de la Santísima Trinidad Ruiz y Picasso",937,"luci@gmail.com");


        service.addStudent(s);
        service.addStudent(s2);
    }

    @Test(expectedExceptions = ValidationException.class)
    public void addStudent6()
    {
        StudentValidator studentValidator = new StudentValidator();
        TemaValidator temaValidator = new TemaValidator();
        String filenameStudent = "fisiere/Studenti_teste.xml";
        String filenameTema = "fisiere/Teme_teste.xml";
        String filenameNota = "fisiere/Note_teste.xml";



        StudentXMLRepo studentXMLRepository = new StudentXMLRepo(filenameStudent);
        TemaXMLRepo temaXMLRepository = new TemaXMLRepo(filenameTema);
        NotaValidator notaValidator = new NotaValidator(studentXMLRepository, temaXMLRepository);
        NotaXMLRepo notaXMLRepository = new NotaXMLRepo(filenameNota);
        Service service = new Service(studentXMLRepository, studentValidator, temaXMLRepository, temaValidator, notaXMLRepository, notaValidator);

        Student s=new Student("7","Pablo Diego José Francisco de Paula Juan Nepomuceno María de los Remedios Cipriano de la Santísima Trinidad Ruiz y Picassoo",937,"luci@gmail.com");

        service.addStudent(s);


    }

    @Test
    public void addStudent()
    {
        StudentValidator studentValidator = new StudentValidator();
        TemaValidator temaValidator = new TemaValidator();
        String filenameStudent = "fisiere/Studenti_teste.xml";
        String filenameTema = "fisiere/Teme_teste.xml";
        String filenameNota = "fisiere/Note_teste.xml";




        StudentXMLRepo studentXMLRepository = new StudentXMLRepo(filenameStudent);
        TemaXMLRepo temaXMLRepository = new TemaXMLRepo(filenameTema);
        NotaValidator notaValidator = new NotaValidator(studentXMLRepository, temaXMLRepository);
        NotaXMLRepo notaXMLRepository = new NotaXMLRepo(filenameNota);
        Service service = new Service(studentXMLRepository, studentValidator, temaXMLRepository, temaValidator, notaXMLRepository, notaValidator);

        Student s=new Student("43","Luci",937,"luci@gmail.com");

        Student s2=new Student("44","Richard",937,"richard@gmail.com");


      service.addStudent(s);
     service.addStudent(s2);


    }



    @Test
    public void deleteStudent()
    {
        StudentValidator studentValidator = new StudentValidator();
        TemaValidator temaValidator = new TemaValidator();
        String filenameStudent = "fisiere/Studenti_teste.xml";
        String filenameTema = "fisiere/Teme_teste.xml";
        String filenameNota = "fisiere/Note_teste.xml";



        StudentXMLRepo studentXMLRepository = new StudentXMLRepo(filenameStudent);
        TemaXMLRepo temaXMLRepository = new TemaXMLRepo(filenameTema);
        NotaValidator notaValidator = new NotaValidator(studentXMLRepository, temaXMLRepository);
        NotaXMLRepo notaXMLRepository = new NotaXMLRepo(filenameNota);
        Service service = new Service(studentXMLRepository, studentValidator, temaXMLRepository, temaValidator, notaXMLRepository, notaValidator);

        Student s=new Student("1","Luci",937,"luci@gmail.com");
        Student s2=new Student("10000","Richard",937,"richard@gmail.com");

        Student s3=new Student("5","Luci",937,"luci@gmail.com");
        Student s4=new Student("7","Richard",937,"richard@gmail.com");

        Student s5=new Student("43","Luci",937,"luci@gmail.com");
        Student s6=new Student("44","Richard",937,"richard@gmail.com");

        service.deleteStudent(s.getID());
        service.deleteStudent(s2.getID());
        service.deleteStudent(s3.getID());
        service.deleteStudent(s4.getID());
        service.deleteStudent(s5.getID());
        service.deleteStudent(s6.getID());
    }
}
