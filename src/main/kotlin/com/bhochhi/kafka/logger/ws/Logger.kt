package com.bhochhi.kafka.logger.ws

import com.bhochhi.kafka.utils.*
import org.springframework.web.bind.annotation.*
import java.util.concurrent.atomic.AtomicLong


data class Log(val id: Long, val message: String)



@RestController
@RequestMapping("/logger")
class LogController{
    private val  counter = AtomicLong()


    /**
     * Get the details about available topics
     */
    @GetMapping("/topics/{name}")
    fun getTopics(@RequestAttribute("name") name: String) = "Hello world $name"//listTopics(name)
}





