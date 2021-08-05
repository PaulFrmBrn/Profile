package com.genestack.profile.core

import com.genestack.profile.adapters.secondary.UserDAO
import java.util.*

/**
 * driven port
 * repository
 */
class UserPort(val userDAO: UserDAO) {

    fun getUserById(id: UUID): User {
        val (id, name, email) = userDAO.getUser(id)
        return User(id, name, email)
    }

}
