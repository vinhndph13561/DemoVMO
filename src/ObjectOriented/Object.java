package ObjectOriented;

public class Object {
     String name;
     int number;
     String color;

    public Object(String name, int number, String color) {
        this.name = name;
        this.number = number;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Object{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", color='" + color + '\'' +
                '}';
    }
}
