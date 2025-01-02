package com.my.sparta.concert.aggregate.concert.adapter.`in`.web.`interface`

import lombok.Builder
import lombok.Data
import java.time.LocalDateTime

@Data
@Builder
class ReservedTicketResponse(
    val ticketId: String,
    val userId: String,
    val expectedTime: LocalDateTime,
    val concertName: String,
    val reservedSeat: Map<String, Int>
) {

}
