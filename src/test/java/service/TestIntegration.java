package service;

import domain.Nota;
import domain.Student;
import domain.Tema;
import org.testng.annotations.Test;
import repository.CrudRepository;
import validation.NotaValidator;
import validation.StudentValidator;
import validation.TemaValidator;
import validation.ValidationException;
import java.time.LocalDate;

import static org.mockito.Mockito.*;

public class TestIntegration {

    @Test()
    public void integration1()
    {
        StudentValidator studentValidator = new StudentValidator();
        TemaValidator temaValidator = new TemaValidator();
        NotaValidator notaValidator = mock(NotaValidator.class);

        String filenameStudent = "fisiere/Studenti_teste.xml";
        String filenameTema = "fisiere/Teme_teste.xml";
        String filenameNota = "fisiere/Note_teste.xml";

        CrudRepository studentRepo=mock(CrudRepository.class);
        CrudRepository temaRepo=mock(CrudRepository.class);
        CrudRepository notaRepo=mock(CrudRepository.class);


        Service service = new Service(studentRepo, studentValidator, temaRepo, temaValidator, notaRepo, notaValidator);

        Student s=new Student("1","Luci",937,"luci@gmail.com");
        Tema t = new Tema("1", "tema saptamana 6", 3, 1);

        try{

            when(studentRepo.save(s)).thenReturn(s);
            when(temaRepo.save(t)).thenReturn(t);
        }

        catch (Exception ex)
        {
            ex.printStackTrace();
        }

        service.addStudent(s);
        service.addTema(t);

    }



    @Test(expectedExceptions = ValidationException.class)
    public void integration2()
    {
        StudentValidator studentValidator = new StudentValidator();
        TemaValidator temaValidator = new TemaValidator();
        NotaValidator notaValidator = mock(NotaValidator.class);

        String filenameStudent = "fisiere/Studenti_teste.xml";
        String filenameTema = "fisiere/Teme_teste.xml";
        String filenameNota = "fisiere/Note_teste.xml";

        CrudRepository studentRepo=mock(CrudRepository.class);
        CrudRepository temaRepo=mock(CrudRepository.class);
        CrudRepository notaRepo=mock(CrudRepository.class);



        Service service = new Service(studentRepo, studentValidator, temaRepo, temaValidator, notaRepo, notaValidator);

        Student s=new Student("1","Luci",937,"luci@gmail.com");
        Tema t = new Tema("1", "tema saptamana 6", 3, 1);
        Nota n=new Nota("1",s.getID(),t.getID(),1,LocalDate.now());

        try{
            doThrow(new ValidationException("Eroare!!!")).when(notaValidator).validate(n);
            when(studentRepo.save(s)).thenReturn(s);
            when(temaRepo.save(t)).thenReturn(t);
        }

        catch (Exception ex)
        {
            ex.printStackTrace();
        }



        service.addStudent(s);
        service.addTema(t);
        service.addNota(n,"slabut");


    }



}
