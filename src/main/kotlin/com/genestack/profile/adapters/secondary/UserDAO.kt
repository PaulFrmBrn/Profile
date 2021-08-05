package com.genestack.profile.adapters.secondary

import java.util.*

/**
 * driven adapter
 */
class UserDAO {
    fun getUser(id: UUID) =
            Triple(UUID.randomUUID(), "John", "john@example.com")
}
