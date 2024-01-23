package com.xworkz.crud1operation.service;

import com.xworkz.crud1operation.dto.ConsultancyDto;

public interface ConsultancyService {
      boolean validateAndSave(ConsultancyDto consultancyDto);
      void readAll();
      boolean update(String name,ConsultancyDto consultancyDto);
}
