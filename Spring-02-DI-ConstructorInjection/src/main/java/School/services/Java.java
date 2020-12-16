package School.services;

import School.Interfaces.Course;
import School.Interfaces.ExtraSessions;

public class Java implements Course {

    //OfficeHours officeHours;
    ExtraSessions extraSessions;  // with that structure no need to change anything.

    public Java(OfficeHours officeHours) {
        this.extraSessions = officeHours;
    }


    @Override
    public void getTeachingHours() {
        System.out.println("Weekly Teaching Hours : " + (20 + extraSessions.getHours()));
    }
}
