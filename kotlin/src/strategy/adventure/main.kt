package strategy.adventure

import strategy.adventure.behavior.weapon.BowAndArrowBehavior
import strategy.adventure.model.character.King
import strategy.adventure.model.character.Character

fun main() {
    val character: Character = King()
    character.fight()
    character.changeWeapon(BowAndArrowBehavior())
    character.fight()
}