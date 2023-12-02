public class Weapon implements Equipment {
    private String name;
    private String jobWeapon;
    private int AtkUp;
    private int DefUp;
    private int Max_manaUp;
    private int down_speed;

    public Weapon(String name, String jobWeapon, int AtkUp, int DefUp, int Max_manaUp, int down_speed) {
        this.name = name;
        this.jobWeapon = jobWeapon;
        this.AtkUp = AtkUp;
        this.DefUp = DefUp;
        this.Max_manaUp = Max_manaUp;
        this.down_speed = down_speed;
    }

    @Override
    public int getDamage() {
        return AtkUp;
    }

    @Override
    public int getDefense() {
        return DefUp;
    }

    @Override
    public int getMana() {
        return Max_manaUp;
    }

    @Override
    public int getSpeed() {
        return down_speed;
    }

    @Override
    public String getJob() {
        return this.jobWeapon;
    }

    @Override
    public String getName() {
        return name;
    }

    public static Weapon createWeapon(String name, String jobWeapon, int AtkUp, int DefUp, int Max_manaUp, int down_speed) {
        return new Weapon(name, jobWeapon, AtkUp, DefUp, Max_manaUp, down_speed);
    }
}