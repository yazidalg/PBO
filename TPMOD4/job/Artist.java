package job;

import java.util.Date;
import java.time.format.DateTimeFormatter;

public class Artist {
    private String name;
    private String birthdate;

    public Artist(String name, String birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public  String getBirthdate() {
        return birthdate;
    }

    public int getAge() {
        int born = Integer.parseInt(birthdate.substring(0,4));
        int yearNow = 2024;
        return yearNow - born;
    }

    public void displayInfo() {
        System.out.println("Artist name : " + this.name);
        System.out.println("Birthdate   : " + this.birthdate);
        System.out.println("Age         : " + this.getAge());
    }
}
