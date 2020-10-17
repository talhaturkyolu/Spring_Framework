import implementation.Mentor;
import service.FulltimeMentor;
import service.MentorAccount;

public class SchoolApp {

    public static void main(String[] args) {
        FulltimeMentor fullTime = new FulltimeMentor();

        MentorAccount mentor = new MentorAccount(fullTime);

        mentor.manageAccount();


    }
}
