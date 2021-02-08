package com.kodilla.good.patterns.challenges;

public class RentalDto {
    private boolean status;
    private User user;
    public RentalDto(User user, boolean status) {
        this.user = user;
        this.status = status;
    }

    public boolean isStatus() {
        return status;
    }

    public User getUser() {
        return user;
    }
}
