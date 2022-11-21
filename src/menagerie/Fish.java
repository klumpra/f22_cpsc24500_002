package menagerie;

public class Fish extends Pet {
    @Override
    public void initializeCutoffs() {
        foodCutoff = 1;
        attentionCutoff = 1;
        sleepCutoff = 8;
    }
    @Override
    public String act() {
        int num = rnd.nextInt(4);
        String extra;
        if (num == 1) {
            extra = "The fish, " + getName() + " swam in circles.";
        } else if (num == 2) {
            extra = "The fish, " + getName() + " hung out in the castle.";
        } else if (num == 3) {
            extra = "The fish, " + getName() + " swam up to the surface.";
        } else {
            extra = "";
        }
        String base = super.act();
        if (extra.isBlank()) {
            return base;
        } else {
            if (base.isBlank()) {
                return extra;
            } else if (!extra.isBlank()) {
                return base + "\n" + extra;
            } else {
            	return "";
            }
        }
    }
    public Fish(String name, int age, double weight) {
        super(name,age,weight);
    }
    @Override
    public String getType() {
        return "fish";
    }
}
