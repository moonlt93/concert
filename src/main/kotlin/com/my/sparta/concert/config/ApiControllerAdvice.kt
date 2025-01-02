package com.my.sparta.concert.config

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice
import javax.naming.AuthenticationException

@RestControllerAdvice
class ApiControllerAdvice {

    @ExceptionHandler(Exception::class)
    fun handleException(e: Exception): ErrorResponse {
        return ErrorResponse(
            HttpStatus.INTERNAL_SERVER_ERROR.value().toString(),
            e.message.toString()
        )
    }

    @ExceptionHandler(AuthenticationException::class)
    fun handleException(e: AuthenticationException): ErrorResponse {
        return ErrorResponse(
            HttpStatus.UNAUTHORIZED.value().toString(),
            e.message.toString()
        )
    }

}

data class ErrorResponse(val code: String, val message: String)

