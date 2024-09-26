package src.item

import jeu.TirageDes
import personnage.Personnage
import item.*

class Arme(  nom :String = "",
            description :String = ""): Item(nom,description){


    fun calculerDegats( nombreDes:Int ,  valeurDeMax:Int): Int{
        //création de l'object TirageDes(parametres ou args)
        var objTirage = TirageDes(nombreDes,valeurDeMax).lance()
        return objTirage
    }

    fun utiliser(cible: Personnage):Unit{
        return cible.equipe(this)
    }
}