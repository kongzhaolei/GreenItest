package com.needle.greenitest.teardown;

import java.io.File;

import com.needle.greenitest.dto.Config;
import com.needle.greenitest.template.VariableGenerator;



public interface TearDownWithSql {

	
	public boolean cleanTestDataWithSql(File file,Config config);
	
	
	public boolean getTestResultFromMysql(File file,Config config,VariableGenerator vargen);
}
