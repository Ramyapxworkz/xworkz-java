package com.xworkz.zomato.service;

import com.xworkz.zomato.dto.ZomatoDto;
import com.xworkz.zomato.repository.ZomatoRepository;

public class ZomatoServiceImp implements ZomatoService {
	private ZomatoRepository repository;

	public ZomatoServiceImp(ZomatoRepository repository) {
		this.repository = repository;
	}

	@Override
	public boolean validateOnsave(ZomatoDto zomatoDto) {
		if (zomatoDto != null) {
			boolean exist = isExist(zomatoDto);
			if (exist != true) {

				boolean checkname = validateCustomername(zomatoDto.getCustomerName());
				boolean checkNumber = validateNumber(zomatoDto.getNumber());
				boolean checkEmail = valiadteEmail(zomatoDto.getEmail());
				boolean checkCost = validateCost(zomatoDto.getCost());
				if (checkname && checkNumber && checkEmail && checkCost) {
					boolean save = repository.onSave(zomatoDto);

					if (save) {
						System.out.println("saved successfully");
						return true;
					} else {
						System.out.println("not saved successfully");
					}
				}
			}
		}
		return false;
	}

	private boolean isExist(ZomatoDto zomatoDto) {
		ZomatoDto[] dto = repository.read();
		if (zomatoDto != null) {
			for (ZomatoDto dtos : dto) {
				if (dtos != null) {
					if (dtos.getCustomerName().equalsIgnoreCase(zomatoDto.getCustomerName())) {
						return true;
					}
					if (dtos.getNumber() == zomatoDto.getNumber()) {
						return true;
					}
					if (dtos.getEmail().equalsIgnoreCase(zomatoDto.getEmail())) {
						return true;
					}
					if (dtos.getCost() == zomatoDto.getCost()) {
						return true;
					}

				}
			}

		}
		return false;
	}

	private boolean validateCustomername(String customerName) {
		if (customerName.isEmpty() || customerName.isBlank()) {
			System.out.println("null");
			return false;
		}
		if ((customerName.length() < 3 && customerName.length() > 40)) {
			System.out.println("length");
			return false;
		}
		return true;
	}

	private boolean validateNumber(long number) {
		int count = 0;
		while (number > 0) {
			number = number / 10;
			count++;
		}
		if (count != 10) {
			System.out.println("length should be 10");
			return false;
		}
		return true;
	}

	private boolean valiadteEmail(String email) {
		if (email.isEmpty() || email.isBlank()) {
			System.out.println("give correct name");
			return false;
		}
		if (!(email.contains("@"))) {
			return false;
		}
		return true;
	}

	private boolean validateCost(int cost) {
		if (cost == 0) {
			return false;
		}
		return true;
	}

	@Override
	public boolean read() {
		ZomatoDto[] dto = repository.read();

		for (ZomatoDto dtos : dto) {
			System.out.println(dtos);
		}

		return false;
	}

	@Override
	public boolean validateUpdate(String email, ZomatoDto zomatoDto) {
		ZomatoDto[] dto = repository.read();
		if (dto != null) {
			for (ZomatoDto dtos : dto) {
				if (dtos != null) {
					boolean update = repository.update(email, zomatoDto);
					if (update) {
						System.out.println("updated successfully");
						return true;
					} else {
						System.out.println("not updated successfully");
					}
				}
			}
		}
		return false;
	}

}
