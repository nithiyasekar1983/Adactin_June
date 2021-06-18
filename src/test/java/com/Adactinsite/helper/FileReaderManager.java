package com.Adactinsite.helper;

public class FileReaderManager {
	
	private FileReaderManager() {
	}
	
	public Configuration_Reader getInstanceCR() throws Throwable {
		
		Configuration_Reader  reader = new Configuration_Reader();
		return reader;

	}

	
	public static FileReaderManager getInstance() {
		FileReaderManager helper = new FileReaderManager();
		return helper;
		
	}
	

}
