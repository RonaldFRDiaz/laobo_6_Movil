package com.example.laboratorio05.data

import com.example.laboratorio05.data.models.MovieModel

val name = "batman: The Dark knight"
val category = "Action"
val description = "Batman tiene que mantener el equilibrio entre el heroísmo y el vigilantismo para pelear contra un vil criminal conocido como el Guasón, que pretende sumir Ciudad Gótica en la anarquía."
val calification = "10"


val name2 = "blade Runner 2049"
val category2 = "Action"
val description2 = "En el año 2049 el oficial K, un nuevo replicante de la policía de Los Ángeles, emprende la búsqueda del replicante Rick Deckard, desaparecido 30 años antes. K piensa que en Deckard reside la clave que podría permitir salvar a la sociedad del caos en el que está inmersa."
val calification2 = "8.1"


val movies = mutableListOf(
    MovieModel(name, category, description, calification),
    MovieModel(name2, category2, description2, calification2)
)
