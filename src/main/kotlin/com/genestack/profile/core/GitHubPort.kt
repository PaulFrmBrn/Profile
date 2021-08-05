package com.genestack.profile.core

import com.genestack.profile.adapters.secondary.GitHubConnector
import java.util.*

/**
 * driven port
 * repository
 */
class GitHubPort(val gitHubConnector: GitHubConnector) {
    fun getMergedPRsCount(id: UUID): Int =
            gitHubConnector.getMergedPrsCount(id)
}
