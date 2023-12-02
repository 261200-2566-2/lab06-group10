public class Accessoryy implements Accessory {
    private String name;
    private int hp;
    private int defUp;
    private int maxManaUp;
    private int speed;

    private Accessoryy(String name, int hp, int defUp, int maxManaUp, int speed) {
        this.name = name;
        this.hp = Math.max(0, hp);  // Ensure non-negative values
        this.defUp = Math.max(0, defUp);
        this.maxManaUp = Math.max(0, maxManaUp);
        this.speed = Math.max(0, speed);
    }

    @Override
    public int getHp() {
        return hp;
    }

    @Override
    public int getDefense() {
        return defUp;
    }

    @Override
    public int getMana() {
        return maxManaUp;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public String getName() {
        return name;
    }

    public static Accessoryy createAccessory(String name, int hp, int defUp, int maxManaUp, int speed) {
        return new Accessoryy(name, hp, defUp, maxManaUp, speed);
    }
}
