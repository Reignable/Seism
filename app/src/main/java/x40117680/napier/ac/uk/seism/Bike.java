package x40117680.napier.ac.uk.seism;

public class Bike {
    private String name;
    private String travel;
    private int image;

    public Bike(){}

    public Bike(String name, String travel, int image){
        setName(name);
        setTravel(travel);
        setImage(image);
    }

    public void setTravel(String travel) {
        this.travel = travel;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getTravel() {
        return travel;
    }
}
