package jeu

import personnage.Personnage



class Jeu(monstres: List<Personnage>) {
    //Le personage du joueur
    lateinit var joueur: Personnage
    //La liste des monstre a combatre
     var combats: MutableList<Combat> = mutableListOf()
    //Le score
    var score: Int = 0

    // Corps du constructeur
    init {
        // Lancement de la création du personage du joueur
        this.creerPersonnage()
        // Pour chaque monstre dans la liste de monstres
        for (unMonstre in monstres){
            // On créer un combat
            val unCombat = Combat(this,unMonstre, this.joueur)
            combats.add(unCombat)
        }
    }

    fun lancerCombat() {
        for (unCombat in this.combats) {
            unCombat.executerCombat()
            // Mettre à jour le score en fonction du nombre de tours
            val tours = unCombat.nombreTours
            score += calculerScore(tours)
        }
        println("Score final du joueur: $score")
    }

    private fun calculerScore(tours: Int): Int {
        // Par exemple, vous pouvez attribuer plus de points pour moins de tours
        return 500 - tours * 10
    }

    /**
     *  Méthode pour créer le personnage du joueur en demandant les informations à l'utilisateur
     *
     */
    fun creerPersonnage(): Personnage {
        println("Création votre personnage:")
        // TODO Mission 1.1
        val nom = readln().toString()
        val attaque = readln().toInt()
        val defense = readln().toInt()
        val endurance = readln().toInt()
        val vitesse = readln().toInt()

        var total = attaque + defense + endurance + vitesse //Total des points
        if(total > 40) total = 0 //Si le total des points depasse 40, les points se réinitialisent

        var pointDeVie = 50 //Total des points
        var pointDeVieMax = pointDeVie + 10*endurance // Point de vie max

        val hero = Personnage("YYY",150,150,12,8,8,12)
        this.joueur= hero

        return hero
    }

}