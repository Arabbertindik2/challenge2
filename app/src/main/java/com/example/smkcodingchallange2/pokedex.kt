package com.example.smkcodingchallange2


import com.google.gson.annotations.SerializedName

data class  pokedex(
    @SerializedName("ability")
    val ability: String = "",
    @SerializedName("berry")
    val berry: String = "",
    @SerializedName("berry-firmness")
    val berryFirmness: String = "",
    @SerializedName("berry-flavor")
    val berryFlavor: String = "",
    @SerializedName("characteristic")
    val characteristic: String = "",
    @SerializedName("contest-effect")
    val contestEffect: String = "",
    @SerializedName("contest-type")
    val contestType: String = "",
    @SerializedName("egg-group")
    val eggGroup: String = "",
    @SerializedName("encounter-condition")
    val encounterCondition: String = "",
    @SerializedName("encounter-condition-value")
    val encounterConditionValue: String = "",
    @SerializedName("encounter-method")
    val encounterMethod: String = "",
    @SerializedName("evolution-chain")
    val evolutionChain: String = "",
    @SerializedName("evolution-trigger")
    val evolutionTrigger: String = "",
    @SerializedName("gender")
    val gender: String = "",
    @SerializedName("generation")
    val generation: String = "",
    @SerializedName("growth-rate")
    val growthRate: String = "",
    @SerializedName("item")
    val item: String = "",
    @SerializedName("item-attribute")
    val itemAttribute: String = "",
    @SerializedName("item-category")
    val itemCategory: String = "",
    @SerializedName("item-fling-effect")
    val itemFlingEffect: String = "",
    @SerializedName("item-pocket")
    val itemPocket: String = "",
    @SerializedName("language")
    val language: String = "",
    @SerializedName("location")
    val location: String = "",
    @SerializedName("location-area")
    val locationArea: String = "",
    @SerializedName("machine")
    val machine: String = "",
    @SerializedName("move")
    val move: String = "",
    @SerializedName("move-ailment")
    val moveAilment: String = "",
    @SerializedName("move-battle-style")
    val moveBattleStyle: String = "",
    @SerializedName("move-category")
    val moveCategory: String = "",
    @SerializedName("move-damage-class")
    val moveDamageClass: String = "",
    @SerializedName("move-learn-method")
    val moveLearnMethod: String = "",
    @SerializedName("move-target")
    val moveTarget: String = "",
    @SerializedName("nature")
    val nature: String = "",
    @SerializedName("pal-park-area")
    val palParkArea: String = "",
    @SerializedName("pokeathlon-stat")
    val pokeathlonStat: String = "",
    @SerializedName("pokedex")
    val pokedex: String = "",
    @SerializedName("pokemon")
    val pokemon: String = "",
    @SerializedName("pokemon-color")
    val pokemonColor: String = "",
    @SerializedName("pokemon-form")
    val pokemonForm: String = "",
    @SerializedName("pokemon-habitat")
    val pokemonHabitat: String = "",
    @SerializedName("pokemon-shape")
    val pokemonShape: String = "",
    @SerializedName("pokemon-species")
    val pokemonSpecies: String = "",
    @SerializedName("region")
    val region: String = "",
    @SerializedName("stat")
    val stat: String = "",
    @SerializedName("super-contest-effect")
    val superContestEffect: String = "",
    @SerializedName("type")
    val type: String = "",
    @SerializedName("version")
    val version: String = "",
    @SerializedName("version-group")
    val versionGroup: String = ""
)