package com.xworkz.sankrathi.service;

import com.xworkz.sankrathi.dto.SankrathiDto;

public interface SankranthiService {
     boolean validateSave(SankrathiDto sankrathiDto);
     void read() throws NullPointerException;
     void read(String foodName);
     void readByState(String state);
     void readGame(String games);
     boolean validateUpdate(String state,SankrathiDto sankrathiDto);
}
