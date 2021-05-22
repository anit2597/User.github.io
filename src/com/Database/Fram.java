package com.Database;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JButton;
import javax.swing.JFrame;


@WebServlet("/Fram")
public class Fram extends HttpServlet{
	
   
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");  
		PrintWriter out = response.getWriter();
		
		JFrame f=new JFrame("HELLO USER");
		
		f.setLayout(null);
       f. setSize(1000,1000);
       f. setVisible(true);
       JButton b1= new  JButton("Start");
       b1.setBounds(50, 100, 200, 100);
       f.add(b1);
       b1.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
                       
                      if(e.getSource().equals(b1))
                     {
                        
                 
                    	  MyCar o=new MyCar();
                    	  o.input();
                    	
                   }
           }
          
       });
       
       
     
		
	}

	
	
}
