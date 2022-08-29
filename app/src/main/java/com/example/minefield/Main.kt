package com.example.minefield

fun main() {

    val aidKits = listOf(AidKit(), AidKit(), AidKit())
    val mines = listOf(Mine(), Mine(), Mine())
    var health = 100

    print("ENTER THE SIZE OF THE ROW:(10-30)")
    val row = readln().toInt()
    print("ENTER THE SIZE OF COL:(10-30)")
    val col = readln().toInt()

    while (true) {
        val positionx = readln().toInt()
        val positiony = readln().toInt()

        for (i in 0..row) {
            for (y in 0..col) {

                if (i == positionx && y == positiony) {
                    print("|X")

                    mines.forEach { if (it.x == positionx && it.y == positiony) health -= it.health }
                    aidKits.forEach { if (it.x == positionx && it.y == positiony) health += it.health }

                } else {
                    print("| ")
                }
            }
            println()
        }
        println("health$health")
    }
}

