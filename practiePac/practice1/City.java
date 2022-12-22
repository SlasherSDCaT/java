package practiePac.practice1;

public class City {
    private String name;
    private int populationSize;

    public City(String n, int a) {
        name = n;
        populationSize = a;
    }

    public City(String n) {
        name = n;
        populationSize = 0;
    }

    public City() {
        name = "Moscow";
        populationSize = 12635466;
    }

    public void setName(String type){
        this.name = type;
    }

    public void setSize(int wingspan){
        this.populationSize = wingspan;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return populationSize;
    }

    public String toString() {
        return this.name+" - population size: "+this.populationSize;
    }
}
