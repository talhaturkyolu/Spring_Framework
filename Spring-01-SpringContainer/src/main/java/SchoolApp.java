import Interfaces.Mentor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.beans.factory.BeanFactory;
import services.FullTimeMentor;

public class SchoolApp {
    public static void main(String[] args)  {

        // Where we save in our beans ( whatever we save in the xml).
        //    <bean id ="fullTimeMentor" class = "services.FullTimeMentor"></bean>
        BeanFactory container = new ClassPathXmlApplicationContext("config.xml"); // since we are using xml

       // Mentor mentor = new FullTimeMentor();
        Mentor mentor = (Mentor) container.getBean("fullTimeMentor");

        mentor.createAccount(); //Full Time Mentor account is created... ( Spring way creation)

        Mentor partTimeMentor = (Mentor) container.getBean("partTimeMentor");
        partTimeMentor.createAccount(); // Part Time Mentor account is created...




        ApplicationContext container2 = new ClassPathXmlApplicationContext("config.xml");
        //Other way to create. Returning whatever you need from mentor. No need downcasting here
        Mentor mentor1 = container2.getBean("fullTimeMentor",Mentor.class);
        mentor1.createAccount(); // Full Time Mentor account is created...
    }
}
