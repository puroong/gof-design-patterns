package strategy.adventure.model.character

import strategy.adventure.behavior.weapon.WeaponBehavior

abstract class Character {
    protected abstract var weapon: WeaponBehavior

    fun changeWeapon(weaponBehavior: WeaponBehavior) {
        weapon = weaponBehavior
    }

    fun fight() {
        weapon.useWeapon()
    }
}