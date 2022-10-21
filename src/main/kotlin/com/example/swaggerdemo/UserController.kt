package com.example.swaggerdemo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController


@RestController("user")
class UserController {

    @RequestMapping(method = [RequestMethod.POST])
    fun save(): String {
        return "custom"
    }

    @GetMapping
    fun get(): String {
        return "get test"
    }
}