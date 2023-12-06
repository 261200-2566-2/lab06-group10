public interface Fight {
    void attack(Fight opponent);
    void takeDamage(int damage);
    String getName();
    boolean isAlive();
}
