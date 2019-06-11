package atj.rest;

import javax.ws.rs.BadRequestException;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/hello")
public class Hello {
	static Calculate calculator = new Calculate();
		
	@POST
	@Produces(javax.ws.rs.core.MediaType.TEXT_PLAIN)
	public Double calculate(String request) {
		
		Double result = null;
		try {
			result = calculator.calc(request);
		} catch (ArithmeticException e) {
			throw new ArithmeticException("You cannot divide by zero.");
		}
		return result;
	}
}