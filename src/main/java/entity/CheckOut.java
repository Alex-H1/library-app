package entity;

import entity.readingmaterial.ReadingMaterial;
import user.User;

import java.time.LocalDate;

public class CheckOut {
    private ReadingMaterial article;
    private LocalDate checkout;
    private LocalDate checkIn;
    private final User person;


    public CheckOut(LocalDate checkout, LocalDate checkIn, User person) {
        this.checkout = checkout;
        this.checkIn = checkIn;
        this.person = person;
    }

    public LocalDate getCheckout() {
        return this.checkout;
    }

    public LocalDate getCheckIn() {
        return this.checkIn;
    }


    public void setCheckout() {
        this.checkout = checkout;
    }

    public void setCheckIn() {
        this.checkIn = checkIn;
    }


}
