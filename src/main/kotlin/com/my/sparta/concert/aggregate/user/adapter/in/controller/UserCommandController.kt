package com.my.sparta.concert.aggregate.user.adapter.`in`.controller

import com.my.sparta.concert.aggregate.user.adapter.`in`.`interface`.ChargeMoneyRequest
import com.my.sparta.concert.aggregate.user.adapter.`in`.`interface`.TokenResponse
import com.my.sparta.concert.aggregate.user.adapter.`in`.`interface`.UserWalletInfoResponse
import lombok.RequiredArgsConstructor
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
class UserCommandController {


    @GetMapping("/token/{userId}")
    fun getToken(
        @PathVariable userId: String
    ): TokenResponse {

        if (userId.isBlank()) {
            throw IllegalArgumentException("userId cannot be blank")
        }

        return TokenResponse(
            "testToken"
        )
    }

    @GetMapping("/charge/{userId}")
    fun findChargedMoney(
        @PathVariable userId: String
    ): UserWalletInfoResponse {

        if (userId != "abcdef") {
            throw IllegalArgumentException("userId cannot be equals")
        }

        return UserWalletInfoResponse(
            "abcdef",
            3000.0
        )
    }


    @PostMapping("/charge/{userId}")
    fun chargeMoney(
        @PathVariable userId: String,
        @RequestBody request: ChargeMoneyRequest
    ): UserWalletInfoResponse {

        if (userId != "userId1") {
            throw IllegalArgumentException("userId cannot be equals")
        }

        return UserWalletInfoResponse(
            "userId1",
            3000.0
        )
    }


}