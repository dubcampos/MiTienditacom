package com.example.tecsup.mitienditacom;

import com.example.tecsup.mitienditacom.Entidades.Categoria;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ServicioTienda {
    @GET("/api/categorias/nivel/{nivel}/")
    Call<List<Categoria>> ObtenerCategoriasPorNivel(@Path("nivel") int nivel);

    @GET("/api/categorias/padre/{padre}/")
    Call<List<Categoria>> ObtenerCategoriasPorPadre(@Path("padre") int padre);
}
