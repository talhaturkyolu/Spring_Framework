package School.services;

import School.interfaces.Course;
import org.springframework.stereotype.Component;

@Component
public class Selenium implements Course {
    @Override
    public void getTeachingHourse() {
        System.out.println("Teaching hours : 20");
    }
}
