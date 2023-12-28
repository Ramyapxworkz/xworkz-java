package com.xworkz.softwarename.repository;

public interface SoftwareNameRepo {
     boolean onSave(String softwareName);
     String[] read();
     boolean update(String oldName,String newName);
}
