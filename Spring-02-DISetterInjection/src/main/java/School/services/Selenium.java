package School.services;


import School.School.School.interfaces.Course;

public class Selenium implements Course {
    OfficeHours officeHours;

    public Selenium(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly Teaching Hours : 15");
    }
}
