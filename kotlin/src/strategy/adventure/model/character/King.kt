package strategy.adventure.model.character

import strategy.adventure.behavior.weapon.SwordBehavior
import strategy.adventure.behavior.weapon.WeaponBehavior

class King(override var weapon: WeaponBehavior) : Character() {
    constructor() : this(SwordBehavior())
}