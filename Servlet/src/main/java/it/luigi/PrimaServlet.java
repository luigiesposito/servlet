package it.luigi;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PrimaServlet extends HttpServlet {


	private static final long serialVersionUID = 1L;

	@Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        
        Writer w = resp.getWriter();
        
        w.write("<html>\r\n"
        		+ "	<head>\r\n"
        		+ "		<title>Primo sito statico con Servlet</title>\r\n"
        		+ "	</head>\r\n"
        		+ "	\r\n"
        		+ "	<body>\r\n"
        		+ "	<center><table>\r\n"
        		+ "			<caption>Gestionale persone</caption>\r\n"
        		+ "			<tr>\r\n"
        		+ "				<td><a href=\"nome.php\">INSERIMENTO</a></td>\r\n"
        		+ "				<td><a href=\"ricerca.php\">RICERCA</a></td>\r\n"
        		+ "				<td><a href=\"modifica.php\">MODIFICA</a></td>\r\n"
        		+ "				<td><a href=\"elimina.php\">ELIMINA</a></td>\r\n"
        		+ "			</tr>\r\n"
        		+ "		</table></center>\r\n"
        		+ "		<h2>HOME SITO SERVLET</h2>\r\n"
        		+ "<img src=\"https://thumbs.dreamstime.com/b/modern-computer-programming-code-screen-showing-random-scripts-113805394.jpg\">"
        		+ "		<footer><center>Copyright Luigi Esposito - All rights are reserved</center></footer>\r\n"
        		+ "	</body>"
        		+ "</html>");		 
        w.flush();
        w.close();
    }
}