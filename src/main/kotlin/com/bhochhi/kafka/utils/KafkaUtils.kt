package com.bhochhi.kafka.utils

import org.apache.kafka.clients.consumer.KafkaConsumer
import org.apache.kafka.common.PartitionInfo
import java.util.*


class KafkaUtils

fun listTopics(): List<String> {
    val topics: Map<String, List<PartitionInfo>>

    val props = Properties()
    props.put("bootstrap.servers", "127.0.0.1:9092")
    props.put("group.id", "test-consumer-group")
    props.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer")
    props.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer")

    val consumer = KafkaConsumer<String, String>(props)
    topics = consumer.listTopics()
    consumer.close()
    return topics.keys.toList()
}

