package School.services;

import School.School.interfaces.Course;
import org.springframework.stereotype.Component;

@Component
public class Selenium implements Course {
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours : 23");
    }
}
