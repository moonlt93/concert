    src
     -── main
          -── kotlin
         │    -── com
         │        -── my
         │            -── sparta
         │                -── concert
         │                    -── ConcertApplication.kt
         │                    -── aggregate
         │                   │    -── concert
         │                   │   │    -── adapter
         │                   │   │   │    -── in
         │                   │   │   │   │    -── web
         │                   │   │   │   │        -── controller
         │                   │   │   │   │       │    -── ConcertCommandController.kt
         │                   │   │   │   │        -── interface
         │                   │   │   │   │       │    -── GetReservableSeatsResponse.kt
         │                   │   │   │   │       │    -── ReserveConcertRequest.kt
         │                   │   │   │   │       │    -── ReservedTicketResponse.kt
         │                   │   │   │   │        -── mapper
         │                   │   │   │    -── out
         │                   │   │   │        -── persistence
         │                   │   │   │            -── entity
         │                   │   │   │            -── mapper
         │                   │   │   │            -── repository
         │                   │   │    -── application
         │                   │   │        -── domain
         │                   │   │        -── service
         │                   │    -── user
         │                   │        -── adapter
         │                   │       │    -── in
         │                   │       │   │    -── controller
         │                   │       │   │   │    -── UserCommandController.kt
         │                   │       │   │    -── interface
         │                   │       │   │   │    -── ChargeMoneyRequest.kt
         │                   │       │   │   │    -── TokenResponse.kt
         │                   │       │   │   │    -── UserWalletInfoResponse.kt
         │                   │       │   │    -── mapper
         │                   │       │    -── out
         │                   │       │        -── persistence
         │                   │       │            -── entity
         │                   │       │            -── mapper
         │                   │       │            -── repository
         │                   │        -── application
         │                   │            -── domain
         │                   │            -── service
         │                    -── config
         │                        -── ApiControllerAdvice.kt
         │                        -── OpenApiConfig.kt
          -── resources
              -── application.yaml
              -── static
             │    -── image 1.png
             │    -── image 2.png
             │    -── image.png
             │    -── img.png
             │    -── sequence.png
              -── templates
     -── test
         -── kotlin
             -── com
                 -── my
                     -── sparta
                         -── concert
                             -── ConcertApplicationTests.kt
                             -── TestcontainersConfiguration.kt
    
    47 directories, 19 files
