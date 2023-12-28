package com.xworkz.softwarename.repository;

public class SoftwareNameRepoImp implements SoftwareNameRepo{
private String[] list=new String[5];
private int index=0;
	@Override
	public boolean onSave(String softwareName) {
		if(list==null||index>=list.length) {
			System.out.println("Array list is null");
		}else {
			if(index<list.length) {
				list[index]=softwareName;
				index++;
				return true;
			}
		}
		return false;
	}
	@Override
	public String[] read() {
		for(String name:list) {
			if(name!=null) {
				System.out.println(name);
			}
		}
		return list;
	}
	@Override
	public boolean update(String oldName, String newName) {
        for(int i=0;i<list.length;i++) {
        	if(list[i]!=null) {
        		if(list[i].equalsIgnoreCase(oldName)) {
        			list[i]=newName;
        			return true;
        		}
        	}
        }
		return false;
	}
	
	

}
