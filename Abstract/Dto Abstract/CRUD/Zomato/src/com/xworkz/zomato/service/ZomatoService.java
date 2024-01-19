package com.xworkz.zomato.service;

import com.xworkz.zomato.dto.ZomatoDto;

public interface ZomatoService {
     boolean validateOnsave(ZomatoDto zomatoDto);
     boolean read();
     boolean validateUpdate(String email,ZomatoDto zomatoDto);
     
}
