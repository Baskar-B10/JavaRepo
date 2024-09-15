package com.learnings.miscellaneous.nashorn;

import javax.script.*;
import java.io.*; 
  
public class ExecuteNashornScripts {
    public static void main(String[] args) 
        throws Exception 
    { 
  
        // Here we are generating Nashorn JavaScript Engine 
        ScriptEngine ee = new ScriptEngineManager() 
                              .getEngineByName("Nashorn"); 
  
        // Reading JavaScript file create in first approach 
        ee.eval(new FileReader("C:\\Users\\Admin\\Desktop\\demo\\src\\main\\java\\com\\learnings\\miscellaneous\\nashorn\\nashornScripts.js"));
        // Instead of reading JavaScript code from a file.
        // We can directly paste the JavaScript
        // code inside Java Code
        ee.eval("print('Welcome to BindName!!!"
                + " Executing JavaScript code with the"
                + " help of Nashorn engine');");
    }
} 