fun main(args: Array<String>) {

    println("Joueur 1 : Renseignez un nombre\n")
    val guessNumber = readLine()!!.toInt()

    var Joueur1: Int
    var tentatives=0

    while (true) {
        print("Joueur 2 : trouvez le bon nombre entre 0-100: ")
        Joueur1 = readLine()!!.toInt()

        when (Joueur1.compareTo(guessNumber)) {
            -1 -> { println("Plus grand"); tentatives++ }
            0 -> { tentatives++; println("Vous avez trouver en $tentatives tentatives, bravo"); return }
            1 -> { println("Plus petit"); tentatives++ }
        }
    }
}