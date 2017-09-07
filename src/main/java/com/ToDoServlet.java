package com;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.*;

public class ToDoServlet extends HttpServlet {
    //private ToDoRepository toDoRepository = new InMemoryToDoRepository();

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String servletPath = request.getServletPath();
        String view = processRequest(servletPath, request);
        RequestDispatcher dispatcher = request.getRequestDispatcher(view);
        dispatcher.forward(request, response);

    }

    private String processRequest(String servletPath, HttpServletRequest request) {

        if(servletPath.equals("/all")) {
            //List<ToDoItem> toDoItems = toDoRepository.findAll();
            //request.setAttribute("toDoItems", toDoItems);
            return "/jsp/todo-list.jsp";
        }
        else if(servletPath.equals("/delete")) {
            //(...)
            return "/jsp/delete.jsp";
        }
		else if(servletPath.equals("/index")) {
            //(...)
            return "/jsp/index.jsp";
        }
		else if(servletPath.equals("/hello")) {
            //(...)
            return "/jsp/hello.jsp";
        }
        //(...)
        return "/all";
    }

}
