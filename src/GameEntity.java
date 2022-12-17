public class GameEntity {
    private int health;
    private int damage;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        health = health;
    }

    public int getDamage() {
        return damage;
    }

    public GameEntity(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
