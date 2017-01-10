package com.insa.notrehexa.drawer;

public class NotificationData {
    public String message;
    public boolean boutons;
    public int imageId;

    NotificationData(String message, boolean boutons, int imageId) {
        this.message = message;
        this.boutons = boutons;
        this.imageId = imageId;
    }
}
