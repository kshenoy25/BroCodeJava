package packageCopyObjects;

public class Car {
    private String make;
    private String model;
    private int year;

    Car(String make, String model, int year) {
        this.setMake(make);
        this.model = model;
        this.year = year;



        //this.make = make;
        //this.model = model;
        //this.year = year;
    }
    Car(Car x){
        this.copy(x);

    }
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }

    public void setMake(String make) {
        this.make = make;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setYear(int year) {
        this.year = year;
    }
    // create method that passes a car x
    // call the setters using 'this'
    public void copy(Car x){
        this.setMake(x.make);
        this.setModel(x.model);
        this.setYear(x.year);

    }


}
