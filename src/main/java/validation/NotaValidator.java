package validation;


import domain.Nota;
import domain.Student;
import domain.Tema;
import repository.*;

public class NotaValidator implements Validator<Nota> {
    private StudentXMLRepo studentFileRepository;
    private TemaXMLRepo temaFileRepository;

    private CrudRepository studentRepository;
    private CrudRepository temaRepository;

    /**
     * Class constructor
     * @param studentFileRepository - repository student
     * @param temaFileRepository - repository tema
     */
    public NotaValidator(StudentXMLRepo studentFileRepository, TemaXMLRepo temaFileRepository) {
        this.studentFileRepository = studentFileRepository;
        this.temaFileRepository = temaFileRepository;
    }

    public NotaValidator(CrudRepository studentRepository, CrudRepository temaRepository) {
        this.studentRepository = studentRepository;
        this.temaRepository = temaRepository;
    }

    /**
     * Valideaza o nota
     * @param nota - nota pe care o valideaza
     * @throws ValidationException daca nota nu e valida
     */
    @Override
    public void validate(Nota nota) throws ValidationException {
        Student student = studentFileRepository.findOne(nota.getIdStudent());
        if (student == null) {
            throw new ValidationException("Studentul nu exista!");
        }
        Tema tema = temaFileRepository.findOne(nota.getIdTema());
        if (tema == null) {
            throw new ValidationException("Tema nu exista!");
        }
        double notaC = nota.getNota();
        if (notaC > 10.00 || notaC < 0.00) {
            throw new ValidationException("Valoarea notei nu este corecta!");
        }

    }


}
