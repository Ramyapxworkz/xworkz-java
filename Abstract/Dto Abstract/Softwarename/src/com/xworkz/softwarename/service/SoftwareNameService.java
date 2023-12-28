package com.xworkz.softwarename.service;

public interface SoftwareNameService {
  boolean validateSave(String softwareName);
  boolean isExist(String softwareName);
  boolean validateUpdate(String oldName,String newName);
  boolean  validateNewName(String newName);
}
