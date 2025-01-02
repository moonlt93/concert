package com.my.sparta.concert.aggregate.concert.adapter.`in`.web.controller

import com.my.sparta.concert.aggregate.concert.adapter.`in`.web.`interface`.GetReservableSeatsResponse
import com.my.sparta.concert.aggregate.concert.adapter.`in`.web.`interface`.ReserveConcertRequest
import com.my.sparta.concert.aggregate.concert.adapter.`in`.web.`interface`.ReservedTicketResponse
import lombok.RequiredArgsConstructor
import org.springframework.web.bind.annotation.*
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime


@RestController
@RequiredArgsConstructor
@RequestMapping("/concert")
class ConcertCommandController(

) {

    /* 콘서트를 예매한다. */
    @PostMapping
    fun reserveConcert(
        @RequestBody reserveConcertRequest: ReserveConcertRequest
    ): ReservedTicketResponse {

        val map = mutableMapOf<String, Int>()
        map.put("H", 3);
        map.put("K", 4);

        if (reserveConcertRequest.userId == "user1") {
            val reservedTicketResponse = ReservedTicketResponse(
                "001-kr-0001",
                "user1",
                LocalDateTime.now(),
                "무장",
                map
            )

            return reservedTicketResponse

        } else {
            throw IllegalArgumentException("원하는 userId가 아닙니다. ")
        }

    }


    @GetMapping("{concertId}/reserve")
    fun getReservableSeats(
        @PathVariable("concertId") concertId: String
    ): GetReservableSeatsResponse {

        val map = mutableMapOf<String, List<Int>>()
        map.put("C", listOf(1, 2, 3, 4, 5, 6, 7, 8, 9));
        map.put("D", listOf(10, 11, 12, 13, 14, 15));

        if (concertId == "concertId1") {
            val getResponse = GetReservableSeatsResponse(
                LocalDate.now(),
                LocalTime.now(),
                map
            )

            return getResponse

        } else {
            throw IllegalArgumentException(" 해당하는 concert 정보를 찾을수 없습니다.");
        }

    }


}