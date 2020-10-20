package Json;

	 
	import java.io.File;
	import java.io.FileWriter;
	import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

	 
	
	 
	
	public class ToJson {
	   
	    	
	    	 public void putjson(String about, int created, String id, int likes, String submitted[]) {
				
	 
	        JSONObject detailsObj = new JSONObject();
	        detailsObj.put("About", about);
	        detailsObj.put("Created", created);
	        detailsObj.put("Id", id);
	        detailsObj.put("Likes", likes);
	      
	        
	 
	        JSONArray Submitted = new JSONArray();
	       for(int i=0;i<submitted.length;i++)
	    	   Submitted.add(submitted[i]);
	       detailsObj.put("Submitted", Submitted);
	 
	     
	 
	        try {
	            
	            
	           /* File file=new File("E:/details.json");
	            file.createNewFile();*/
	            FileWriter fileWriter = new FileWriter("C:\\Users\\sowmiya\\workspace\\JSON_POJO\\src\\main\\resources\\schema\\demo.json");
	            fileWriter.write(detailsObj.toJSONString());
	            fileWriter.close();
	           
	 
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	 
	    
	    

			
		}
	}