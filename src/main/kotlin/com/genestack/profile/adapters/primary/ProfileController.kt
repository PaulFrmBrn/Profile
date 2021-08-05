package com.genestack.profile.adapters.primary

import com.genestack.profile.core.MedalType
import com.genestack.profile.core.UserService
import java.util.*

/**
 * driving adapter
 */
class ProfileController(val userService: UserService) {

    fun getProfileInfo(id: UUID): ProfileInfo {
        val profile = userService.getUserData(id)
        return ProfileInfo(
                profile.user.id,
                profile.user.name,
                profile.user.email,
                profile.getMedal()
        )
    }

}

data class ProfileInfo(val id: UUID, val name: String, val email: String, val medalType: MedalType?)
