package practiePac.practice1;

public class Bird {
    private String type;
    private int wingspan;

    public Bird(String n, int a) {
        type = n;
        wingspan = a;
    }

    public Bird(String n) {
        type = n;
        wingspan = 0;
    }

    public Bird() {
        type = "Craw";
        wingspan = 0;
    }

    public void setType(String type){
        this.type = type;
    }

    public void setWingspan(int wingspan){
        this.wingspan = wingspan;
    }

    public String getType() {
        return type;
    }

    public int getWingspan() {
        return wingspan;
    }

    public String toString() {
        return this.type+": wingspan - "+this.wingspan;
    }
}
