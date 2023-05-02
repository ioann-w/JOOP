package homework.hw4.src.Controllers;

import homework.hw4.src.StudentDomen.User;

// интерфейс контроллера за пользователем
public interface iUserController<T extends User> {
    // метод создания экземпляра типа Т
    void create(String firstName, String secondName, int age);
}
Footer
© 2023 GitHub, Inc.
Footer navigation
Terms