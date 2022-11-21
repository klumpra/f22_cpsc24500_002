package menagerie;

public class Dog extends Pet {
    @Override
    public void initializeCutoffs() {
        foodCutoff = 3;
        attentionCutoff = 16;
        sleepCutoff = 12;
    }
    @Override
    public String act() {
        int num = rnd.nextInt(5);
        String extra;
        if (num == 1) {
            extra = "The dog, " + getName() + ", barked at the window.";
        } else if (num == 2) {
            extra = "The dog, " + getName() + ", played fetch.";
        } else if (num == 3) {
            extra = "The dog, " + getName() + ", whimpered at its water bowl.";
        } else if (num == 4) {
            extra = "The dog, " + getName() + ", tore the squeaker out of its toy.";
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
    public Dog(String name, int age, double weight) {
        super(name,age,weight);
    }
    @Override
    public String getType() {
        return "dog";
    }
}
