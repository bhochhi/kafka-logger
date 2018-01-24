package com.bhochhi.kafka.utils

import org.apache.kafka.clients.consumer.KafkaConsumer
import org.apache.kafka.common.PartitionInfo
import java.util.*


class KafkaUtils

fun listTopics(topicName: String): List<String> {

    if(topicName.isBlank()){
        return listOf("test1", "test2", "first-kafka-topic")
    }

    val topics: Map<String, List<PartitionInfo>>

    val props = Properties()
    props.put("bootstrap.servers", "1.2.3.4:9092")
    props.put("group.id", "test-consumer-group")
    props.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer")
    props.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer")

    val consumer = KafkaConsumer<String, String>(props)
    topics = consumer.listTopics()
    consumer.close()
    return topics.keys.toList()
}

