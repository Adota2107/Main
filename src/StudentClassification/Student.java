package StudentClassification;

public class Student {
    String name;
    String classes;
    double maths;
    double chemistry;
    double physics; 
    double average;
    String rank;

    public Student(){
    }

    public Student(String name, String classes, double maths, double chemistry, double physics, double average, String rank){
        this.name = name;
        this.classes = classes;
        this.maths = maths;
        this.chemistry = chemistry;
        this.physics = physics;
        this.average = average;
        this.rank = rank;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getClasses(){
        return classes;
    }

    public void setClasses(String classes){
        this.classes = classes;
    }

    public double getMaths(){
        return maths;
    }

    public void setMaths(double maths){
        this.maths = maths;
    }

    public double getChemistry(){
        return chemistry;
    }

    public void setChemistry(double chemistry){
        this.chemistry = chemistry;
    }

    public double getPhysics(){
        return physics;
    }

    public void setPhysics(double physics){
        this.physics = physics;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}
