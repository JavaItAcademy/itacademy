package Db;

import Models.Application;

import java.util.ArrayList;

public class DatabaseConnector {
    public static ArrayList<Application> applications = new ArrayList<>();

    public static boolean addApplication(Application application) {
        applications.add(application);
        return true;
    }
    public static ArrayList<Application> getAll() {
        return applications;
    }
}
