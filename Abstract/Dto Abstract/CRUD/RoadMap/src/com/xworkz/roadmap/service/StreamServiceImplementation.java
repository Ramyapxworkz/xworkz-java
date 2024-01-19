package com.xworkz.roadmap.service;

import com.xworkz.roadmap.repository.StreamRepository;

public class StreamServiceImplementation implements StreamService {

	private StreamRepository repository;

	public StreamServiceImplementation(StreamRepository repository) {
		this.repository = repository;
	}

	@Override
	public boolean validateAndSave(String streamName) {
		if (streamName.isEmpty() || streamName.isBlank() || (streamName.length() < 3 && streamName.length() > 25)
				|| streamName == null) {
			System.out.println("give the correct name");
		} else {
			// duplicate check
			boolean exists = isExists(streamName);
			if (exists != true) {

				// invoke the onsave() method
				boolean save = repository.onSave(streamName);
				if (save) {
					System.out.println("added stream successfully");
					return true;
				} else {
					System.out.println("not added stream successfully");
					return false;
				}
			}else {
				System.out.println("Stream name is Already Exists");
				return false;
			}
		}
		return false;
	}

	@Override
	public boolean isExists(String streamName) {
		String[] stream = repository.read();
		if (stream != null && streamName != null) {
			for (String name : stream) {
				if (name != null) {
					if (name.equals(streamName)) {
						return true;
					}
				}
			}
		}
		return false;
	}

}
