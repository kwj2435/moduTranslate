package com.modu.modutranslate

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@EnableFeignClients
@SpringBootApplication
class ModuTranslateApplication

fun main(args: Array<String>) {
    runApplication<ModuTranslateApplication>(*args)
}
