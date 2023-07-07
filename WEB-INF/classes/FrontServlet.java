package etu1797.framework.servlet;

import java.io.IOException;
import java.util.HashMap;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import etu1797.framework.Mapping;
import java.util.Map;

public class FrontServlet extends HttpServlet {
    private HashMap<String, Mapping> mappingUrls;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    public HashMap<String, Mapping> getMappingUrls() {
        return mappingUrls;
    }
}
