package com.xworkz.softwarename.service;

import com.xworkz.softwarename.repository.SoftwareNameRepo;

public class SoftwareNameServiceImp implements SoftwareNameService {
	private SoftwareNameRepo repository;

	public SoftwareNameServiceImp(SoftwareNameRepo repository) {
		this.repository = repository;
	}

	@Override
	public boolean validateSave(String softwareName) {
		if (softwareName.isEmpty() || softwareName.isBlank()
				|| (softwareName.length() < 2 && softwareName.length() > 25) || softwareName == null) {
			System.out.println("give correct name");
		}
		if (!(softwareName.contains("a"))) {
			System.out.println("software name contains 'a' character");
			return false;
		} else {
			boolean exist = isExist(softwareName);
			if (exist != true) {

				boolean save = repository.onSave(softwareName);
				if (save) {
					System.out.println("added successfully");
					return true;
				} else {
					System.out.println("not added successfully");
					return false;
				}

			} else {
				System.out.println("software name is already existsry enukke ");
			}
		}
		return false;
	}

	@Override
	public boolean isExist(String softwareName) {
		String[] list = repository.read();
		if (list != null) {
			for (String name : list) {
				if (name != null) {
					if (name.equals(softwareName)) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@Override
	public boolean validateUpdate(String oldName, String newName) {
		if (oldName != null && newName != null) {
			boolean checkOldname = isExist(oldName);
			boolean checkNewName=validateNewName(newName);
			if (checkOldname == true&&checkNewName) {
				boolean checkUpdate = repository.update(oldName, newName);
				if (checkUpdate == true) {
					System.out.println("updated successfully");
					return true;
				} else {
					System.out.println("not updated successfully");
					return false;
				}
			} else {
				System.out.println("old name not present:" + oldName);
			}
		}
		return false;
	}

	@Override
	public boolean validateNewName(String newName) {
		if (newName.isEmpty()) {
			System.out.println("is empty");
			return false;
		}
		if(newName.isBlank()) {
			System.out.println("is Blank");
			return false;
		}
	
		return true;
	}

}
