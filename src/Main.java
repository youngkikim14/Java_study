interface Weapon {
    void attack();
}

class Sword implements Weapon {
    public void attack() {
        System.out.println("Swish!");
    }
}

class Axe implements Weapon {
    public void attack() {
        System.out.println("Chop!");
    }
}

class Bow implements Weapon {
    public void attack() {
        System.out.println("Twang!");
    }
}

class Player {
    private Weapon weapon;

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack() {
        if (weapon != null) {
            weapon.attack();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Player player = new Player();

        player.setWeapon(new Sword());
        player.attack();  // 출력: "Swish!"

        player.setWeapon(new Axe());
        player.attack();  // 출력: "Chop!"

        player.setWeapon(new Bow());
        player.attack();  // 출력: "Twang!"
    }
}