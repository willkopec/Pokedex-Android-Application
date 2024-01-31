package com.plcoding.jetpackcomposepokedex.util

import android.util.Log
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.toLowerCase
import com.plcoding.jetpackcomposepokedex.data.remote.responses.Stat
import com.plcoding.jetpackcomposepokedex.data.remote.responses.Type
import com.plcoding.jetpackcomposepokedex.ui.theme.*
import java.util.Locale

fun parseTypeToColor(type: Type): Color {

    return when(type.type.name.lowercase(Locale.ROOT)) {
        "normal" -> TypeNormal
        "fire" -> TypeFire
        "water" -> TypeWater
        "electric" -> TypeElectric
        "grass" -> TypeGrass
        "ice" -> TypeIce
        "fighting" -> TypeFighting
        "poison" -> TypePoison
        "ground" -> TypeGround
        "flying" -> TypeFlying
        "psychic" -> TypePsychic
        "bug" -> TypeBug
        "rock" -> TypeRock
        "ghost" -> TypeGhost
        "dragon" -> TypeDragon
        "dark" -> TypeDark
        "steel" -> TypeSteel
        "fairy" -> TypeFairy
        else -> Color.Black
    }

}

fun parseStatToColor(stat: Stat): Color {
    Log.d("PokemonParse", (stat.stat.name))
    return when(stat.stat.name.lowercase(Locale.getDefault())) {
        "hp" -> HPColor
        "attack" -> AtkColor
        "defense" -> DefColor
        "special-attack" -> SpAtkColor
        "special-defense" -> SpDefColor
        "speed" -> SpdColor
        else -> Color.White
    }


}

fun parseStatToAbbr(stat: Stat): String {

    return when(stat.stat.name.lowercase(Locale.ROOT)) {
        "hp" -> "HP"
        "attack" -> "Atk"
        "defence" -> "Def"
        "special-attack" -> "SpAtk"
        "special-defence" -> "SpDef"
        "speed" -> "Spd"
        else -> ""
    }

}