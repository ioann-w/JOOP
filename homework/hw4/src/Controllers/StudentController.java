package homework.hw4.src.Controllers;

import homework.hw4.src.StudentDomen.Student;
import homework.hw4.src.StudentService.StudentGroupService;
import homework.hw4.src.StudentService.StudentService;

/**
 * Класс Контроллер Стедентов, имплементированный интерфейсом контроллера за
 * пользователями
 */
public class StudentController implements iUserController<Student> {
    // поле данные сервиса студентов
    private final StudentService dataService = new StudentService();
    // поле данные сервиса группы студентов
    private final StudentGroupService groupService = new StudentGroupService();

    // перегрузка метода создания экземпляра
    @Override
    public void create(String firstName, String secondName, int age) {
        dataService.create(firstName, secondName, age);
    }

}