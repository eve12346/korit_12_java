package ch14_casting.game.system;

import ch14_casting.game.item.Bow;
import ch14_casting.game.item.Staff;
import ch14_casting.game.item.Sword;
import ch14_casting.game.item.Weapon;

public class GameMain {
    public static void main(String[] args) {
        Inventory inventory = new Inventory(new Weapon[8]);
        Weapon weapon = new Weapon();
        Sword sword = new Sword();
        Bow bow = new Bow();
        Staff staff = new Staff();

        Weapon[] weapons = {new Sword(), new Bow(), new Staff()};

        System.out.println();
        System.out.println("-----무기 장착-----");
        inventory.addWeapon(sword);
        inventory.addWeapon(bow);
        inventory.addWeapon(staff);

        System.out.println();
        System.out.println("-----모든 무기 공격-----");
        inventory.attackAll();

        System.out.println();
        System.out.println("-----특수 공격-----");
        inventory.useSpecialAbilities();
    }
}
