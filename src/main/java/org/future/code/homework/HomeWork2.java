package org.future.code.homework;
import java.util.Scanner;

public class AuthenticationException {

    /**
     * Создать статический метод который принимает на вход три параметра: login, password.
     * Login должен содержать только латинские буквы, цифры и знак подчеркивания.
     * Длина login должна быть меньше 20 символов. Если login не соответствует этим требованиям, необходимо выбросить WrongLoginException.
     * Password должен содержать только латинские буквы, цифры и знак подчеркивания. Длина password должна быть меньше 20 символов.
     * Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.
     * Обработка исключений проводится внутри метода.
     * Метод возвращает true, если значения верны или false в другом случае.
     * Реализавать основную работу в классе Main
     */
    public static boolean isValidLogin(String login) throws WrongLoginException{
      //Ваш код
    }
    public static boolean isValidPassword(String login) throws WrongPasswordException{
      //Ваш код
    }
}
