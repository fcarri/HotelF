package com.example.demo.dao;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.dto.Hotel;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface IHotelDAO extends JpaRepository<Hotel, Integer>{

    List<Hotel> findAllByMunicipio(String city);
}
