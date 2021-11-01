package ru.mephi.lab3;

public enum Role {
    STAFF(0.1d), MANAGER(0.2d), EXECUTIVE(0.3d);
    private double role;
    Role(double role){
        this.role = role;
    }
    public double getRole() {return role;}

}
