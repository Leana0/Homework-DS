package assignment1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Artist {
    private  int id;

    private  String name;

    private  String artisticName;

   private  LocalDate bDate;

    private  String role;

    private  String country;

    private  String city;

    public Artist(int id, String name, String artisticName, String role, String country, String  city,LocalDate bDate) {
        this.id = id;
        this.name = name;
        this.artisticName = artisticName;
        this.role = role;
        this.country = country;
        this.city = city;
        this.bDate=bDate;
    }

    public Artist() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getArtisticName() {
        return artisticName;
    }

    public LocalDate getbDate() {
        return bDate;
    }

    public void setbDate(LocalDate bDate) {
        this.bDate = bDate;
    }

    public String getRole() {
        return role;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArtisticName(String artisticName) {
        this.artisticName = artisticName;
    }


    public void setRole(String role) {
        this.role = role;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }


}
