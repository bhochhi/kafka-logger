package com.bhochhi.kafka.logger

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KafkaLoggerApplication

fun main(args: Array<String>) {
    runApplication<KafkaLoggerApplication>(*args)
}
