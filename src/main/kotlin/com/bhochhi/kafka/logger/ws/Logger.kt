package com.bhochhi.kafka.logger.ws

import com.bhochhi.kafka.utils.*
import org.springframework.web.bind.annotation.*
import java.util.concurrent.atomic.AtomicLong


data class Log(val id: Long, val message: String)



@RestController
class LogController{
    private val  counter = AtomicLong()



    /**
     * Get the list of topics available in cluster
     */
    @GetMapping("topics")
    fun getTopics() = listTopics()
}





