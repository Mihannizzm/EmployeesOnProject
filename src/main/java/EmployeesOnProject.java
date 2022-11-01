public class EmployeesOnProject {

    public static void main(String[] args) {

        final int amountProgrammers = 10;
        System.out.println("Колличество программистов: " + amountProgrammers);

        final int amountTestersForCheckCodeOneProgrammer = 2;
        System.out.println("Колличество тестировщиков для тестирования кода одного программиста: "
                + amountTestersForCheckCodeOneProgrammer);

        final int amountSupportsForanswersOnQuestionsForCodeOneProgrammer = 1;
        System.out.println("Количество специалистов поддержки, необходимое, чтобы " +
                "обработать вопросы пользователей по поводу кода," +
                " написанного одним программистом: " + amountSupportsForanswersOnQuestionsForCodeOneProgrammer);

        final int amountTestersOnProject = amountTestersForCheckCodeOneProgrammer * amountProgrammers;
        System.out.println("Колличество тестировщиков необходимых на проекте: " + amountTestersOnProject);

        final int amountSupportsOnProject = amountSupportsForanswersOnQuestionsForCodeOneProgrammer * amountProgrammers;
        System.out.println("Колличество специалистов поддержки небходимых на проекте: " + amountSupportsOnProject);

        final int amountItSpecialistOnProject = amountProgrammers + amountTestersOnProject
                + amountSupportsOnProject;
        System.out.println("Общее колличество It специалистов на проекте: " + amountItSpecialistOnProject);



    }
}
