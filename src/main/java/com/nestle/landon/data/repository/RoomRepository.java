package com.nestle.landon.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nestle.landon.data.entity.Room;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long>{
    Room findByNumber(String number);
}
