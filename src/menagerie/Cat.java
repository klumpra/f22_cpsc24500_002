package menagerie;

public class Cat extends Pet {
    @Override
    public void initializeCutoffs() {
        foodCutoff = 2;
        attentionCutoff = 4;
        sleepCutoff = 16;
    }
    @Override
    public String act() {
        int num = rnd.nextInt(5);
        String extra;
        if (num == 1) {
            extra = "The cat, " + getName() + ", played with a ball of yarn.";
        } else if (num == 2) {
            extra = "The cat, " + getName() + ", jumped onto the bookshelf.";
        } else if (num == 3) {
            extra = "The cat, " + getName() + ", chased its tail";
        } else if (num == 4) {
            extra = "The cat, " + getName() + ", had some catnip.";
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
    public Cat(String name, int age, double weight) {
        super(name,age,weight);
    }
    @Override
    public String getType() {
        return "cat";
    }
}
