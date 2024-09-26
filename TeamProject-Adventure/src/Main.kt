import item.Qualite
import jeu.Jeu
import personnage.Personnage

//Créattion des qualités des objets
val qualiteCommun = Qualite("commun", 0, "\u001B[32m")
val qualiteRare = Qualite("rare", 1, couleur = "\u001B[34m")
val qualiteEpic = Qualite("epic", 2, "\u001B[35m")
val qualiteLegendaire = Qualite("legendaire", 3, "\u001B[33m")

//TODO Sprint 1 Mission 2A et 2B Création des types d'armes/armures

//TODO Sprint 2 : Création de sorts

fun main(args: Array<String>) {
    // TODO Intemission 4 : Création des items ( armes, armures potions, bombes )

    //Création des monstres
    val gobelin = Personnage(
        "Gob le gobelin",
        pointDeVie = 20,
        pointDeVieMax = 20,
        attaque = 5,
        defense = 4,
        vitesse = 11,
        endurance = 6)

    // TODO Intermission 1 : Ajouter d'autres monstres
   var listeDeMonstre : MutableList<Personnage> = mutableListOf<Personnage>(
       Personnage("Ame en peine", 30 , 67 ,10, 12, 14, 0),
    Personnage("Armure animée", 20 , 33 ,8, 15, 8, 6),
    Personnage("Ettin", 44 , 88 ,16, 12, 14, 8),
    Personnage("Elementaire du feu", 51 , 102 ,12, 10, 8, 16),
    Personnage("Flagelleyr mental", 35 , 71 ,15, 7, 10, 12),
    Personnage("Gelée ocre", 22 , 45 ,9, 14, 7, 10)
   )


    //TODO On ajoute les monstres a la liste de monstres du jeu
    val jeu = Jeu(listeDeMonstre)
    //Lancement du jeu
    jeu.lancerCombat()
}