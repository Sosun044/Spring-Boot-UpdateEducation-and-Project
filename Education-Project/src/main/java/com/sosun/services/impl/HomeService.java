package com.sosun.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sosun.dto.DtoHome;
import com.sosun.dto.DtoRoom;
import com.sosun.entities.Home;
import com.sosun.entities.Room;
import com.sosun.repository.IHomeRepository;
import com.sosun.services.IHomeService;

@Service
public class HomeService implements IHomeService{

	@Autowired
	private IHomeRepository homeRepository;

	@Override
	public DtoHome findHomeById(Long id) {
	    DtoHome dtoHome = new DtoHome();
	    Optional<Home> optional = homeRepository.findById(id);
	    System.out.println("Optional Home: " + optional);

	    if (optional.isEmpty()) {
	        return null;
	    }
	    Home dbHome = optional.get();
	    List<Room> dbRooms = dbHome.getRoom();

	    BeanUtils.copyProperties(dbHome, dtoHome);
	    if (dbRooms != null && !dbRooms.isEmpty()) {
	        for (Room room : dbRooms) {
	            DtoRoom dtoRoom = new DtoRoom();
	            BeanUtils.copyProperties(room, dtoRoom);
	            dtoHome.getRooms().add(dtoRoom); // Artık uyumlu
	            System.out.println("Rooms: " + dbRooms);
	        }
	    }
	    return dtoHome;
	}

}
