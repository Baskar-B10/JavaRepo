package com.learnings.miscellaneous.nashorn;// Program to illustrate passing of variable
// from java code to javascript file 

import javax.script.*; 
import java.io.*; 

public class BindName {
	public static void main(String[] args) 
		throws Exception 
	{ 
		ScriptEngine ee 
			= new ScriptEngineManager() 
				.getEngineByName("Nashorn"); 
		Bindings bind 
			= ee.getBindings( 
				ScriptContext.ENGINE_SCOPE); 
		bind.put("name", "Bishal Kumar Dubey"); 
		ee.eval(new FileReader("nashornScripts.js"));
	} 
} 
