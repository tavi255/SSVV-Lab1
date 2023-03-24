import domain.Student;

import org.junit.Test;
import repository.NotaXMLRepo;
import repository.StudentXMLRepo;
import repository.TemaXMLRepo;
import service.Service;
import validation.NotaValidator;
import validation.StudentValidator;
import validation.TemaValidator;

import static org.testng.AssertJUnit.assertEquals;


public class TestStudent {



    @Test
    public void addStudent()
    {
        StudentValidator studentValidator = new StudentValidator();
        TemaValidator temaValidator = new TemaValidator();
        String filenameStudent = "fisiere/Studenti.xml";
        String filenameTema = "fisiere/Teme.xml";
        String filenameNota = "fisiere/Note.xml";



        StudentXMLRepo studentXMLRepository = new StudentXMLRepo(filenameStudent);
        TemaXMLRepo temaXMLRepository = new TemaXMLRepo(filenameTema);
        NotaValidator notaValidator = new NotaValidator(studentXMLRepository, temaXMLRepository);
        NotaXMLRepo notaXMLRepository = new NotaXMLRepo(filenameNota);
        Service service = new Service(studentXMLRepository, studentValidator, temaXMLRepository, temaValidator, notaXMLRepository, notaValidator);

        Student s=new Student("43","Luci",937,"luci@gmail.com");

        Student s2=new Student("44","Richard",937,"richard@gmail.com");


        assertEquals(service.addStudent(s),null);
        assertEquals(service.addStudent(s2),null);


    }

    @Test
    public void deleteStudent()
    {
        StudentValidator studentValidator = new StudentValidator();
        TemaValidator temaValidator = new TemaValidator();
        String filenameStudent = "fisiere/Studenti.xml";
        String filenameTema = "fisiere/Teme.xml";
        String filenameNota = "fisiere/Note.xml";



        StudentXMLRepo studentXMLRepository = new StudentXMLRepo(filenameStudent);
        TemaXMLRepo temaXMLRepository = new TemaXMLRepo(filenameTema);
        NotaValidator notaValidator = new NotaValidator(studentXMLRepository, temaXMLRepository);
        NotaXMLRepo notaXMLRepository = new NotaXMLRepo(filenameNota);
        Service service = new Service(studentXMLRepository, studentValidator, temaXMLRepository, temaValidator, notaXMLRepository, notaValidator);

        Student s=new Student("43","Luci",937,"luci@gmail.com");
        Student s2=new Student("44","Richard",937,"richard@gmail.com");

        assertEquals(service.deleteStudent(s.getID()).toString(),new Student("43","Luci",937,"luci@gmail.com").toString());
        assertEquals(service.deleteStudent(s2.getID()).toString(),new Student("44","Richard",937,"richard@gmail.com").toString());
    }
}
