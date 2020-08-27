package au.com.midibak.service;

import au.com.midibak.model.ApiLogModel;

public class RestApiHeaderService {
	
	public ApiLogModel parseJsonHeader(String jsonHeader)
	{
		ApiLogModel model=null;
		
		/*
		 * JSONParser parser = new JSONParser(); 
		 * JSONObject json = (JSONObject).parser.parse(jsonHeader);
		 */
		
		return model;
	}
	
	public ApiLogModel parseXmlHeader(String xmlHeader)
	{
		ApiLogModel model=null;
		
		/*
		 * //Parser that produces DOM object trees from XML content
		 * DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		 * 
		 * //API to obtain DOM Document instance DocumentBuilder builder = null; try {
		 * //Create DocumentBuilder with default configuration builder =
		 * factory.newDocumentBuilder();
		 * 
		 * //Parse the content to Document object Document doc = builder.parse(new
		 * InputSource(new StringReader(xmlString))); return doc; } catch (Exception e)
		 * { e.printStackTrace(); }
		 */
		
		return model;
	}

}
