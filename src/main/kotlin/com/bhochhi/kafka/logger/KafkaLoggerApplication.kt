package com.bhochhi.kafka.logger

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.kafka.annotation.EnableKafka

@SpringBootApplication
@EnableKafka
class KafkaLoggerApplication

fun main(args: Array<String>) {
    runApplication<KafkaLoggerApplication>(*args)
}
