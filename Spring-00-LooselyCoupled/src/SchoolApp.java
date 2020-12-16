import implementation.Mentor;
import service.FulltimeMentor;
import service.MentorAccount;
import service.PartTimeMentor;

public class SchoolApp {

    public static void main(String[] args) {
        // FulltimeMentor fullTime = new FulltimeMentor();.

        PartTimeMentor partTime = new PartTimeMentor();

        MentorAccount mentor = new MentorAccount(partTime);

        mentor.manageAccount();


    }
}
