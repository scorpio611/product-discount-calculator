import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet", urlPatterns = "/display-discount")
public class DiscountServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String description = request.getParameter("txtDescription");
        Float listPrice = Float.parseFloat(request.getParameter("txtPrice"));
        Float discountPercent = Float.parseFloat(request.getParameter("txtDiscount"));

        double discountAmount = listPrice * discountPercent * 0.01;
        double discountPrice = listPrice-discountAmount;

        PrintWriter writer = response.getWriter();

        writer.println("<html>");
        writer.println("<h2>Product Discount Calculator</h2>");
        writer.println("<form>");
        writer.println("<h1>Product Description: "+description+"</h1>");
        writer.println("<h1>List Price: "+listPrice+"</h1>");
        writer.println("<h1>Discount Percent: "+discountPercent+"</h1>");
        writer.println("<h1>Discount Amount: "+discountAmount+"</h1>");
        writer.println("<h1>Discount Price: "+discountPrice+"</h1>");
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
