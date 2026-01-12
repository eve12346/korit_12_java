package ch14_casting.game.system;

import ch14_casting.game.item.Bow;
import ch14_casting.game.item.Staff;
import ch14_casting.game.item.Sword;
import ch14_casting.game.item.Weapon;

public class Inventory {

    private Weapon[] weaponSlots;
    public Inventory(Weapon[] weaponSlots) {
        this.weaponSlots = weaponSlots;
    }

    // addWeapon
    public void addWeapon(Weapon weapon) {
        int emptyIndex = checkEmpty();
        if ( emptyIndex == -1) {
            System.out.println("인벤토리가 가득 찼습니다.");
            return;
        }
        weaponSlots[emptyIndex] = weapon;
        System.out.println(weapon.getClass().getSimpleName() + "가 장착 되었습니다.");
    }
    private int checkEmpty() {
        for (int i = 0; i < weaponSlots.length; i++) {
            if (weaponSlots[i] == null) return i;
        }
        return -1;
    }

    // attackAll
    public void attackAll() {
        for ( int i = 0 ; i < weaponSlots.length ; i++) {
            if ( weaponSlots[i] == null) {
                continue;
            }
            weaponSlots[i].attack();
        }
    }

    // useSpecialAbilities
    public void useSpecialAbilities() {
        for ( Weapon useSpecialAbilities : weaponSlots) {
            if (useSpecialAbilities instanceof Sword) {
                Sword sword = (Sword) useSpecialAbilities;
                sword.parry();
            } else if (useSpecialAbilities instanceof Bow) {
                Bow bow = (Bow) useSpecialAbilities;
                bow.snipe();
            } else if (useSpecialAbilities instanceof Staff) {
                Staff staff = (Staff) useSpecialAbilities;
                staff.castSpell();
            }
        }
    }

}
