package School.services;

import School.interfaces.Course;
import School.interfaces.ExtraSessions;
import org.springframework.stereotype.Component;

@Component
public class OfficeHours implements ExtraSessions {
    @Override
    public int getHours() {
        return 4;
    }
}
