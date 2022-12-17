public class Main {
    public static void main(String[] args) {
    Boss boss = new Boss(250,30);
    boss.setHealth(250);
    boss.setDamage(30);
    boss.weapon.setName("kalashnikov");
    boss.weapon.setWeaponType(weaponType.PISTOL);
        System.out.println("health: " + boss.getHealth() + "\ndamage: " + boss.getDamage() +
                "\nname: " + boss.weapon.getName()+"\nWeaponType: " + boss.weapon.getWeaponType());


    }
}