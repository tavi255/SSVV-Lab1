package service;

import domain.Student;
import domain.Tema;
import org.testng.annotations.Test;
import repository.NotaXMLRepo;
import repository.StudentXMLRepo;
import repository.TemaXMLRepo;
import validation.NotaValidator;
import validation.StudentValidator;
import validation.TemaValidator;
import validation.ValidationException;


public class TestTema {

    @Test
    public void addTema1() {
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

        Tema t = new Tema("1", "tema saptamana 6", 3, 1);
        service.addTema(t);


    }

    @Test(expectedExceptions = ValidationException.class)
    public void addTema2()
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

        Tema t=new Tema("","tema saptamana 6",3,1);
        service.addTema(t);
    }




    @Test(expectedExceptions=ValidationException.class)
    public void addTema3()
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

        Tema t1=new Tema("7","",3,1);

        service.addTema(t1);



    }

    @Test(expectedExceptions=ValidationException.class)
    public void addTema4()
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

        Tema t1=new Tema("7","dfsdfsd",-3,1);

        service.addTema(t1);



    }


    @Test(expectedExceptions = ValidationException.class)
    public void addTema5()
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

        Tema t1=new Tema("7","dfdfsd",3,-5);

        service.addTema(t1);

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

        Tema t = new Tema("1", "tema saptamana 6", 3, 1);

        service.deleteTema(t.getID());
    }

}
