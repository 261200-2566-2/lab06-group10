//เราจะสามารถกำหนด ชื่อ, hp, def, mana, speed ซึ่ง Accessory สามารถใส่กับอาชีพใดก็ได้
//จะถูกคำนวณใน Character
public class Accessoryy implements Accessory {
    private String name;
    private int hp;
    private int defUp;
    private int maxManaUp;
    private int speed;

    private Accessoryy(String name, int hp, int defUp, int maxManaUp, int speed) {
        this.name = name;
        this.hp = Math.max(0, hp);
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

    //ฟังก์ชั่นสร้างตัวละคร
    public static Accessoryy createAccessory(String name, int hp, int defUp, int maxManaUp, int speed) {
        return new Accessoryy(name, hp, defUp, maxManaUp, speed);
    }
}
