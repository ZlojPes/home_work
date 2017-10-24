package jv17_05.pavliuk.lesson11.animals;

public class Cat extends Animal {
    private int mouseCatchSkillLevel;

    public Cat(String food, String location, int mouseCatchSkillLevel) {
        super(food, location);
        this.mouseCatchSkillLevel = mouseCatchSkillLevel;
    }

    public void makeNoise() {
        System.out.println("Cat makes noise");
    }

    public void eat() {
        System.out.println("Cat eats " + getFood());
    }

    @Override
    public String toString() {
        return "Cat{" +
                "mouseCatchSkillLevel=" + mouseCatchSkillLevel +
                '}';
    }

    public void setMouseCatchSkillLevel(int mouseCatchSkillLevel) {
        this.mouseCatchSkillLevel = mouseCatchSkillLevel;
    }

    public int getMouseCatchSkillLevel() {
        return mouseCatchSkillLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cat cat = (Cat) o;

        return mouseCatchSkillLevel == cat.mouseCatchSkillLevel;
    }

    @Override
    public int hashCode() {
        return mouseCatchSkillLevel;
    }
}
