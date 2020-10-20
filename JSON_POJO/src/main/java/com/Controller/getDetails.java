package com.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Json.ToJson;




public class getDetails  extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String string=request.getParameter("details");
        
        String about=request.getParameter("about");
        int created =Integer.parseInt( request.getParameter("created"));
        String id=request.getParameter("id");
        int likes=Integer.parseInt(request.getParameter("likes"));
        String s=request.getParameter("submitted");
        
        String[] submitted=s.split(", ");
        ToJson t=new ToJson();
        t.putjson(about,created,id,likes,submitted);
        
		out.println("Entered Successfully");
		
	}

}
