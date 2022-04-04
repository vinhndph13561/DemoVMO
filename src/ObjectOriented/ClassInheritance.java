package ObjectOriented;

import Method.Static;

public class ClassInheritance extends Object{
    public int Weight;

    ClassInheritance(String name, int number, String color, int Weight){
        super(name,number,color);
        this.Weight = Weight;
    }

    public int getWeight() {
        return Weight;
    }

    public void setWeight(int weight) {
        Weight = weight;
    }

    @Override
    public String toString() {
        return super.toString() + Weight;
    }

    public static void main(String args[]){

        ClassInheritance c1 = new ClassInheritance("Vinh",11,"Black",60);

        System.out.println(c1.toString());
    }
}
