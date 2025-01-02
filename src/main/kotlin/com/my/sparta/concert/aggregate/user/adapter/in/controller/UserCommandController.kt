package com.my.sparta.concert.aggregate.user.adapter.`in`.controller

import com.my.sparta.concert.aggregate.user.adapter.`in`.`interface`.ChargeMoneyRequest
import com.my.sparta.concert.aggregate.user.adapter.`in`.`interface`.TokenResponse
import com.my.sparta.concert.aggregate.user.adapter.`in`.`interface`.UserWalletInfoResponse
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses
import lombok.RequiredArgsConstructor
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
class UserCommandController {


    @Operation(summary = "콘서트를 예매한다.", description = "콘서트 예매정보를 반환한다.")
    @ApiResponses(
        value = [
            ApiResponse(responseCode = "200", description = "Successful Operation"),
            ApiResponse(responseCode = "500", description = "회원으로 등록된 userId가 아닙니다."),
        ]
    )
    @GetMapping("/token/{userId}")
    fun getToken(
        @PathVariable(required = true) userId: String
    ): TokenResponse {

        if (userId != "userId1") {
            throw IllegalArgumentException("회원으로 등록된 userId가 아닙니다.")
        }

        return TokenResponse(
            "testToken"
        )
    }


    @Operation(summary = "내 남은 잔고가 얼마인지 확인", description = "내 잔고정보를 반환한다.")
    @ApiResponses(
        value = [
            ApiResponse(responseCode = "200", description = "Successful Operation"),
            ApiResponse(responseCode = "500", description = "등록되어있는 유저의 id가 아닙니다."),
        ]
    )
    @GetMapping("/charge/{userId}")
    fun findChargedMoney(
        @PathVariable userId: String
    ): UserWalletInfoResponse {

        if (userId != "abcdef") {
            throw IllegalArgumentException("등록되어있는 유저의 id가 아닙니다.")
        }

        return UserWalletInfoResponse(
            "abcdef",
            3000.0
        )
    }


    @Operation(summary = "해당 유저 잔고를 충전한다.", description = "유저의 잔고를 추가한다.")
    @ApiResponses(
        value = [
            ApiResponse(responseCode = "200", description = "Successful Operation"),
            ApiResponse(responseCode = "500", description = "등록되어있는 유저의 id가 아닙니다."),
        ]
    )
    @PostMapping("/charge/{userId}")
    fun chargeMoney(
        @PathVariable userId: String,
        @RequestBody request: ChargeMoneyRequest
    ): UserWalletInfoResponse {

        if (userId != "userId1") {
            throw IllegalArgumentException("등록되어있는 유저의 id가 아닙니다.")
        }

        return UserWalletInfoResponse(
            "userId1",
            3000.0
        )
    }


}