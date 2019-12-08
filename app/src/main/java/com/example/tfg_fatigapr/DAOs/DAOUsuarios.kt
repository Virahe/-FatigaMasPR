package com.example.tfg_fatigapr.DAOs

import androidx.room.*
import com.example.tfg_fatigapr.clasesDatos.Usuario


@Dao
interface DAOUsuarios {
    @Query("SELECT * FROM tbUsuarios")
    fun seleccionarUsuarios():List<Usuario>

    @Insert
    fun nuevoUsuario(usuario: Usuario)

    @Delete
    fun eleiminarUsuario(usuario: Usuario)

    @Query("SELECT * FROM tbUsuarios WHERE Nombre=:nombre")
    fun seleccionarusuario(nombre:String):Usuario

    @Update
    fun actualizar(usuario:Usuario)

}