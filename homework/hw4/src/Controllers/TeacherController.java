package homework.hw4.src.Controllers;

import homework.hw4.src.StudentDomen.Emploee;
import homework.hw4.src.StudentDomen.User;
import homework.hw4.src.StudentService.TeacherService;

/**
 * Класс Контроллер Преподавателей, имплементированный интерфейсом контроллера
 * за
 * пользователями
 */
public class TeacherController implements iUserController<Emploee> {
    // поле данные сервиса преподавателей
    private final TeacherService teachService = new TeacherService();

    // перегрузка метода создания экземпляра
    @Override
    public void create(String firstName, String secondName, int age) {
        teachService.create(firstName, secondName, age);
    }

    // создание элемента с учетом ученой степени
    public void create(String firstName, String secondName, int age, String academicDegree) {
        teachService.create(firstName, secondName, age, academicDegree);
    }
}
