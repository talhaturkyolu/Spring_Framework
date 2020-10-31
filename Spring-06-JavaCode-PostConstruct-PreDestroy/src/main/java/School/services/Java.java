package School.services;

import School.interfaces.Course;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Java implements Course {
    @Override
    public void getTeachingHourse() {
        System.out.println("Teaching hours : 30");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("Execution post construct");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("Executing pre destroy");
    }
}
