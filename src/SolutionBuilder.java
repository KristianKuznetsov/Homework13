import task1.UserUtils;
import task1.WrongLoginException;
import task1.WrongPasswordException;

public class SolutionBuilder {
    public static void buildTask1(){
        String login = "mylogin";
        String password = "mypassword1";
        String confirmPassword = "mypassword1";

        boolean isValid = false;
        try {
            isValid = UserUtils.isDataValid(login, password, confirmPassword);
        } catch (WrongLoginException e) {
            System.out.println("Ошибка валидации логина: " + e.getMessage());
        } catch (WrongPasswordException e) {
            System.out.println("Ошибка валидации пароля: " + e.getMessage());
        }finally {
            System.out.println("Валидация успешна: " + isValid);
        }

    }
}
