package eus.ehu.domain;

public class Pilot {
    private String name;
    private String nationality;
    private int points;
    private int id;

    public Pilot(String name, String nat, int pts) {
        this.name = name;
        this.nationality = nat;
        this.points = pts;
    }

    public Pilot(int id, String name, String nat, int pts) {
        this.id = id;
        this.name = name;
        this.nationality = nat;
        this.points = pts;
    }

    public void addPoints(int morePoints) {
        this.points += morePoints;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("%s (%s) - %d points", name, nationality, points);
    }
}

