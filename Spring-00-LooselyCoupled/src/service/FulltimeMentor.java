package service;

import implementation.Mentor;

public class FulltimeMentor implements Mentor {

    @Override
    public void createAccount() {
        System.out.println("Full Time Mentor Account is created...");
    }
}
