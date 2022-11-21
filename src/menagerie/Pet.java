package menagerie;
import java.util.Random;
public abstract class Pet implements Comparable<Pet> {
    private String name;
    private int age;
    private double weight;
    protected int foodCutoff;
    protected int attentionCutoff;
    protected int sleepCutoff;
    protected Random rnd;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age < 0) {
            age = 0;
        } else {
            this.age = age;
        }
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        if (weight < 0) {
            weight = 0;
        } else {
            this.weight=weight;
        }
    }
    public Pet() {
        this("",0,0);
    }
    public Pet(String name, int age, double weight) {
        setName(name);
        setAge(age);
        setWeight(weight);
        initializeCutoffs();
        rnd = new Random();
    }
    public boolean needsAttention() {
        return rnd.nextInt(24) < attentionCutoff;
    }
    public boolean needsFood() {
        return rnd.nextInt(24) < foodCutoff;
    }
    public boolean isSleeping() {
        return rnd.nextInt(24) < sleepCutoff;
    }
    public String act() {
        String result = "";
        if (needsAttention()) {
            if (!result.isBlank()) {
                result = result + "\n";
            }
            result = result + String.format("The %s, %s, sought your attention.", getType(), name);
        }
        if (needsFood()) {
            if (!result.isBlank()) {
                result = result + "\n";
            }
            result = result + String.format("The %s, %s, was hungry and ate.", getType(),name);
        }
        if (isSleeping()) {
            if (!result.isBlank()) {
                result = result + "\n";
            }
            result = result + String.format("The %s, %s, was sleepy and took a nap.", getType(), name);
        }
        return result;
    }
    public abstract String getType();
    public abstract void initializeCutoffs();
    @Override
    public String toString() {
        return String.format("%s\t%s\t%2d\t%6.2f", getType(),name,age,weight);
    }
    @Override
    public int compareTo(Pet other) {
        return name.compareTo(other.name);
    }
}
