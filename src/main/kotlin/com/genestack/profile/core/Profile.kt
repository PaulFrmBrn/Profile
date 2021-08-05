package com.genestack.profile.core

import java.util.*

/**
 * entity
 */
data class Profile(val user: User, val prsCount: Int) {

    fun getMedal(): MedalType? = when {
        prsCount >= 1000 -> MedalType.GOLD
        prsCount >= 100 -> MedalType.SILVER
        prsCount >= 10 -> MedalType.BRONZE
        else -> null
    }

}

enum class MedalType {
    GOLD, SILVER, BRONZE
}
