package com.genestack.profile.infra

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ProfileApplication

fun main(args: Array<String>) {
	runApplication<ProfileApplication>(*args)
}
