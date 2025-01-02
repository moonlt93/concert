package com.my.sparta.concert.config

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class ApiControllerAdvice {

    private val logger: Logger = LoggerFactory.getLogger(javaClass)


    @ExceptionHandler(Exception::class)
    fun handleException(e: Exception): ErrorResponse {
        return ErrorResponse(
            HttpStatus.INTERNAL_SERVER_ERROR.name,
            e.message.toString()
        )
    }

}

data class ErrorResponse(val code: String, val message: String)

