import task1.UserUtils;
import task1.WrongLoginException;
import task1.WrongPasswordException;

public class SolutionBuilder {
    public static void buildTask1() {
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
        } finally {
            System.out.println("Валидация успешна: " + isValid);
        }
    }

    public static void buildTaskStar()  {
        //Почему-то работает только так, я пытался через return и break как в коментариях ниже,
        // но оно все равно сначала идет в finaly блок а только потом на оператор выхода
        //Вобщем стопорить полностью программу, явно не то что от нас хотели, но условия задачи выполнены)
        try {
            //int a = 3/0;
            System.out.println("Try block");
            System.exit(0);
        } catch (Exception e) {
            System.out.println("Catch block");
            System.exit(0);
        } finally {
            System.out.println("Finally block");
        }


//        outer:
//        {
//            try {
//                System.out.println("Try block");
//                break outer;
//            } finally {
//                System.out.println("Finally block");
//            }
//        }

//        try {
//            System.out.println("Try block");
//            return;
//        } catch (Exception e) {
//            System.out.println("Catch block");
//            return;
//        } finally {
//            System.out.println("Finally block");
//        }

    }
}
