package com.needle.greenitest.teardown;

import java.io.File;

import com.needle.greenitest.dto.Config;


public interface TearDownWithCsv {
	
		
	public boolean teardownTestDataWithCSV(File file,Config config);

	
}
