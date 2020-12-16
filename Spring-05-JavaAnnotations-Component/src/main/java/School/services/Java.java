package School.services;

import School.School.interfaces.Course;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {
    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours : 30");
    }
}
