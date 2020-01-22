package strategy.adventure.model.character

import strategy.adventure.behavior.weapon.AxeBehavior
import strategy.adventure.behavior.weapon.WeaponBehavior

class Troll(override var weapon: WeaponBehavior) : Character() {
    constructor() : this(AxeBehavior())
}