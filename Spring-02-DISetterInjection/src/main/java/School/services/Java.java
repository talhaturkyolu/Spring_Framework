package School.services;

import School.School.School.interfaces.Course;

public class Java implements Course {

    private OfficeHours OfficeHours;

    public void setGetOfficeHours(OfficeHours getOfficeHours) {   //set + officeHours
        this.OfficeHours = getOfficeHours;
    }

    public OfficeHours getGetOfficeHours() {
        return OfficeHours;
    }

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly Teaching Hours : " + (20 + OfficeHours.getHours()));
    }
}
