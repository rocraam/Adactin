package com.adactin.properties;

import java.io.IOException;

public class File_Reader {
	private File_Reader() {
		
	}
	public static File_Reader getinstance() {
		File_Reader fr=new File_Reader();
		return fr;
	}
public  Configuration_Reader getCR() throws IOException {
	Configuration_Reader cr=new Configuration_Reader();
	return cr;
}
 
}
