	import net.sf.json.JSONArray;
  
  public static String toJson(Object resultobj)   {
		if (resultobj != null) {
			JSONArray obj = JSONArray.fromObject(resultobj);  
			return (obj.toString());
		}
		return "";
    }                  


    	public void toJson(Object resultobj) throws Exception {
			if (resultobj != null) {
				// ����json�ַ���
				HttpServletResponse response = ServletActionContext.getResponse();
				response.setContentType("text/html; charset=utf-8");
				JSONArray obj = JSONArray.fromObject(resultobj); // ����תΪjson
				PrintWriter out = response.getWriter();
				out.println(obj.toString());
				out.flush();
				out.close();
			}
	}




        //����
   ArrayList<StRain> list2=getData.StPptnRToStRain();
    	// ����json�ַ���
      toJson( list2);






 public class StRain {
	//ʱ��
   String time;
   //����
   double val;       


}