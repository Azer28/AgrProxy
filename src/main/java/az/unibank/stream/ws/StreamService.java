package az.unibank.stream.ws;

import az.unibank.stream.implementation.Service;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * Created by azarm on 2/17/2018.
 */
@WebServlet(urlPatterns = "/StreamService")
public class StreamService extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Hello");
        processRequest(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("start writing to response");
        response.setContentType("application/xml;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("bitches");
        String requestBody = sendRequestToStream(request, response);
        System.out.println(requestBody);
        out.close();
    }

    public String sendRequestToStream(HttpServletRequest request, HttpServletResponse response) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(request.getInputStream()));
            String s;
            while (( s = br.readLine())!= null) {
                sb.append(s);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
