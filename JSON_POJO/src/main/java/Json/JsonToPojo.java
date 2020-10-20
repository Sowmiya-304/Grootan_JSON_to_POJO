package Json;

import java.io.File;
import java.io.IOException;

import com.Pojo.PojoClass;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToPojo {
public static void main(String args[]) throws IOException
	{
		String jsonValues= "{\r\n"+
							"\"about\" : \"Grootan\",\r\n"+
							"\"created\" : 1173923446,\r\n"+
							"\"id\" : \"grootan_123\",\r\n"+
							"\"likes\" : 4229,\r\n"+
							"\"submitted\" : [123.00,1.00]\r\n"+
							"}";
		
	
		ObjectMapper objectMapper=new ObjectMapper();
		try {
			PojoClass pojoClass=objectMapper.readValue(jsonValues,PojoClass.class);
			//PojoClass pojoClass=objectMapper.readValue(new File("demo.json"),PojoClass.class);
			System.out.println(pojoClass.getAbout());
		} 
		catch (JsonMappingException e) 
		{
			e.printStackTrace();
		} 
		catch (JsonProcessingException e) 
		{
			e.printStackTrace();
		}
		 
	}
}

