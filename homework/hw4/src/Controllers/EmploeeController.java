package homework.hw4.src.Controllers;

import homework.hw4.src.StudentDomen.Emploee;
import homework.hw4.src.StudentDomen.User;
import homework.hw4.src.StudentService.EmploeeService;

/**
 * Класс Контроллер Работников, имплементированный интерфейсом контроллера за
 * пользователями
 */
public class EmploeeController implements iUserController<Emploee> {
    // поле данные сервиса работников
    private final EmploeeService empService = new EmploeeService();

    // перегрузка метода создания экземпляра
    @Override
    public void create(String firstName, String secondName, int age) {
        empService.create(firstName, secondName, age);
    }

    // создаем статический метод выплаты з.п. работнику , тип которого я вляется
    // наследником класса Работник
    static public <T extends Emploee> void paySalary(T person) {
        System.out.println(((User) person).getFirstName() + " зп 10000р ");
    }

    // обобщенный статический метод высчитывания среднего арифметического значения
    // переданного массива,
    // тип чисел массива должен быть дочерним от Numbers
    static public <T extends Number> Double mean(T[] num) {
        double sum = 0.0;
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i].doubleValue();
        }
        sum = sum / num.length;
        return sum;
    }
}