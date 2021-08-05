package com.genestack.profile.core

import java.util.*

/**
 * interactor
 * service
 * use case
 */
class UserService(val userPort: UserPort, val gitHubPort: GitHubPort) {

    fun getUserData(id: UUID): Profile {
        val user = userPort.getUserById(id)
        val prs = gitHubPort.getMergedPRsCount(id)
        val profile = Profile(user, prs)
        return profile
    }

}
