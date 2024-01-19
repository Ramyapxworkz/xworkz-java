package com.xworkz.crudoperation.repository;

import com.xworkz.crudoperation.dto.BlanketDto;

public class BlanketRepoImpl implements BlanketRepo{
  private BlanketDto[] list=new BlanketDto[3];
  private int index=0;
	@Override
	public boolean onSave(BlanketDto blanketDto) {
		if(index<list.length) {
			list[index]=blanketDto;
			index++;
			return true;
		}
		return false;
	}
	@Override
	public BlanketDto[] read() {
		return list;
	}
	@Override
	public boolean update(String blanketName, BlanketDto blanketDto) {
		for(int i=0;i<list.length;i++) {
			if(list[i]!=null) {
				if(list[i].getBlanketName().equals(blanketName)) {
					list[i]=blanketDto;
					return true;
				}
			}
		}
		return false;
	}
	@Override
	public boolean delete(int blacketsPrice) {
		for(int i=0;i<list.length;i++) {
			if(list[i]!=null) {
				if(list[i].getBlacketsPrice()==blacketsPrice) {
					list[i]=null;
					return true;
				}
			}
		}
		return false;
	}

}
