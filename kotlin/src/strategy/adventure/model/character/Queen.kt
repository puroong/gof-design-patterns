package strategy.adventure.model.character

import strategy.adventure.behavior.weapon.KnifeBehavior
import strategy.adventure.behavior.weapon.WeaponBehavior

class Queen(override var weapon: WeaponBehavior) : Character() {
    constructor() : this(KnifeBehavior())
}