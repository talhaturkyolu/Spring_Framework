package School;

import School.configs.SchoolAppConfig;
import School.interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SchoolApp {
    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(SchoolAppConfig.class);

        Course course = container.getBean("java", Course.class);

        System.out.println(course.toString());

        course.getTeachingHours();


    }
}
