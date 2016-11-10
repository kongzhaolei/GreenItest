package com.needle.greenitest.teardown;

import java.io.File;

import com.needle.greenitest.dto.Config;
import com.needle.greenitest.template.VariableGenerator;

public interface TearDownWithServiceInterface {
	
	public boolean cleanTestDataByHttpRequest(File file,Config config,VariableGenerator vargen);
	
	public boolean cleanTestDataBySoapRequest(File file,Config config,VariableGenerator vargen);
	

}
