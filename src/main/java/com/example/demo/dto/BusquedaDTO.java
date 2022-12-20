package com.example.demo.dto;

public class BusquedaDTO {
    private int id_busqueda;
    private int id_hotel;
    private long id_usuary;

    public int getId_busqueda() {
        return id_busqueda;
    }

    public void setId_busqueda(int id_busqueda) {
        this.id_busqueda = id_busqueda;
    }

    public int getId_hotel() {
        return id_hotel;
    }

    public void setId_hotel(int id_hotel) {
        this.id_hotel = id_hotel;
    }

    public long getId_usuary() {
        return id_usuary;
    }

    public void setId_usuary(long id_usuary) {
        this.id_usuary = id_usuary;
    }

    public void setId_usuary(int id_usuary) {
        this.id_usuary = id_usuary;
    }

    public BusquedaDTO(int id_busqueda, int id_hotel, long id_usuary) {
        this.id_busqueda = id_busqueda;
        this.id_hotel = id_hotel;
        this.id_usuary = id_usuary;
    }
}
