package com.xworkz.zomato.repository;

import com.xworkz.zomato.dto.ZomatoDto;

public class ZomatoRepositoryImp implements ZomatoRepository {
      private ZomatoDto[] details=new ZomatoDto[4];
      private int index=0;
	@Override
	public boolean onSave(ZomatoDto zomatoDto) {
		if(zomatoDto!=null) {
			if(index<details.length) {
				details[index]=zomatoDto;
				index++;
				return true;
			}
		}
		return false;
	}
	@Override
	public ZomatoDto[] read() {
		return details;
	}
	@Override
	public boolean update(String email, ZomatoDto zomatoDto) {
		if(email!=null&&zomatoDto!=null) {
			for(int i=0;i<details.length;i++) {
				if(details[i]!=null) {
					if(details[i].getEmail().equalsIgnoreCase(email)) {
						details[i]=zomatoDto;
						return true;
					}
				}
			}
		}
		return false;
	}
	@Override
	public boolean delete(String email) {
		for(int i=0;i<details.length;i++) {
			if(details[i]!=null) {
				if(details[i].getEmail().equalsIgnoreCase(email)) {
					details[i]=null;
					return true;
				}
			}
		}
		return false;
	}
	@Override
	public boolean contactDelete(long number) {
		for(int i=0;i<details.length;i++) {
			if(details[i]!=null) {
				if(details[i].getNumber()==number) {
					details[i]=null;
					return true;
				}
			}
		}
		return false;
	}
	
	

}
