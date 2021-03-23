package fr.uphf.ntr.restDemos.resources;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;

import fr.uphf.ntr.restDemos.dao.TodoDao;
import fr.uphf.ntr.restDemos.model.Todo;


// Will map the resource to the URL todos
@Path("/todos")
public class TodosResource {

	// Allows to insert contextual objects into the class,
	// e.g. ServletContext, Request, Response, UriInfo
	@Context
	UriInfo uriInfo;
	@Context
	Request request;

	// Return the list of todos to the user in the browser
	@GET
	@Produces(MediaType.TEXT_XML)
	public List<Todo> getTodosBrowser() {
		System.out.println("getTodosBrowser");
		List<Todo> todos = new ArrayList<Todo>();
		todos.addAll(TodoDao.instance.getModel().values());
		System.out.println(todos);
		return todos;
	}
	

	// Return the list of todos for applications
	//@GET
	//@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public List<Todo> getTodos() {
		System.out.println("getTodos");
		List<Todo> todos = new ArrayList<Todo>();
		todos.addAll(TodoDao.instance.getModel().values());
		System.out.println(todos);
		return todos;
	}

	
	@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public String getTodos1() {
		System.out.println("getTodos");
		List<Todo> todos = new ArrayList<Todo>();
		todos.addAll(TodoDao.instance.getModel().values());
		System.out.println(todos);
		return "<x>Hola</x>";
	}
	
	// retuns the number of todos
	// Use http://localhost:8080/de.vogella.jersey.todo/rest/todos/count
	// to get the total number of records
	@GET
	@Path("count")
	@Produces(MediaType.TEXT_PLAIN)
	public String getCount() {
		System.out.println("getCount");
		int count = TodoDao.instance.getModel().size();
		return String.valueOf(count);
	}

	@POST
	@Produces(MediaType.TEXT_HTML)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public void newTodo(@FormParam("id") String id,
			@FormParam("summary") String summary,
			@FormParam("description") String description,
			@Context HttpServletResponse servletResponse) throws IOException {
		System.out.println("newTodo");
		Todo todo = new Todo(id, summary);
		if (description != null) {
			todo.setDescription(description);
		}
		TodoDao.instance.getModel().put(id, todo);

		servletResponse.sendRedirect("../create_todo.html");
	}

	// Defines that the next path parameter after todos is
	// treated as a parameter and passed to the TodoResources
	// Allows to type http://localhost:8080/de.vogella.jersey.todo/rest/todos/1
	// 1 will be treaded as parameter todo and passed to TodoResource
	@Path("{todo}")
	public TodoResource getTodo(@PathParam("todo") String id) {
		System.out.println("getTodo");
		return new TodoResource(uriInfo, request, id);
	}

}