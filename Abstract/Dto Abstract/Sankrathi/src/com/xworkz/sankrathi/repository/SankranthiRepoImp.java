package com.xworkz.sankrathi.repository;

import com.xworkz.sankrathi.dto.SankrathiDto;

public class SankranthiRepoImp implements SankranthiRepo {
      private SankrathiDto[] dto=new SankrathiDto[5];
      private int index=0;
	@Override
	public boolean onSave(SankrathiDto sankrathiDto) {
		if(index<dto.length) {
			dto[index]=sankrathiDto;
			index++;
			return true;
		}
		return false;
	}
	@Override
	public SankrathiDto[] read() {
		return dto;
	}
	@Override
	public boolean upDate(String state, SankrathiDto sankrathiDto) {
		if(state!=null) {
			for(int i=0;i<dto.length;i++) {
				if(dto[i]!=null) {
					if(dto[i].getState().equalsIgnoreCase(state)) {
						dto[i]=sankrathiDto;
						System.out.println(dto[i]);
						return true;
					}
				}
			}
		}
		return false;
	}
	@Override
	public boolean delete(String state) {
		if(state!=null) {
			for(int i=0;i<dto.length;i++) {
				if(dto[i]!=null) {
					if(dto[i].getState().equals(state)) {
						dto[i]=null;
						return true;
						//System.out.println(dto[i]);
					}
				}
			}
		}
		return false;
	}

}
