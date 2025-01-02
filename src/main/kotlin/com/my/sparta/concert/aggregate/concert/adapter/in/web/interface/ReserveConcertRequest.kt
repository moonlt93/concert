package com.my.sparta.concert.aggregate.concert.adapter.`in`.web.`interface`

import lombok.Data

@Data
class ReserveConcertRequest(
    val userId: String,
    val concertId: String,
) {

}
