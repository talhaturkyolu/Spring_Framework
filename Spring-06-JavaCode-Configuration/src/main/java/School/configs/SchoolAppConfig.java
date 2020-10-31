package School.configs;

import School.interfaces.ExtraSessions;
import School.services.Java;
import School.services.OfficeHours;
import School.services.Selenium;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("School")
@PropertySource("classpath:application.properties")
public class SchoolAppConfig {
    @Bean
    public Java java(){
        return new Java(extraSessions());
    }

    @Bean
    public Selenium selenium(){
        return new Selenium();
    }
/*
    //@Bean
    public OfficeHours officeHours(){
        return new OfficeHours();
    }
 */

    //@Bean
    public ExtraSessions extraSessions(){
        return new OfficeHours();
    }


}
