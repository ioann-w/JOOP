package homework.hw4.src.StudentService;

import java.util.ArrayList;
import java.util.List;

import homework.hw4.src.StudentDomen.Emploee;
import homework.hw4.src.StudentDomen.UserComparator;

/**
 * Класс Сервис рабочих имплементирует интерфейс Сервис Пользователей
 */
public class EmploeeService implements iUserService<Emploee> {
    // счетчик количества элементов типа Emploee, так же используется в качестве
    // идентификатора для элементов
    private int count;
    // список рабочих, созданных внутри сервиса
    private List<Emploee> emploees;

    // конструктор класса, парпметры не принимает, определяет поле emploees как
    // пустой
    // массив
    public EmploeeService() {
        this.emploees = new ArrayList<Emploee>();
    }

    // перегрузка метода создания элемента
    @Override
    public void create(String firstName, String secondName, int age) {
        Emploee per = new Emploee(firstName, secondName, age, count);
        count++;
        emploees.add(per);
    }

    // перегрузка метода получения всех элементов
    @Override
    public List<Emploee> getAll() {
        return emploees;
    }

    // метод получения отсортированных работников по ФИО
    public List<Emploee> getSortedByFIOStudentGroup() {
        List<Emploee> emps = new ArrayList<>(emploees);
        emps.sort(new UserComparator<Emploee>());
        return emps;
    }
}