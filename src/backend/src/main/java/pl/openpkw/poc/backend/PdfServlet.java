package pl.openpkw.poc.backend;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pl.openpkw.poc.backend.domain.Formularz;
import pl.openpkw.poc.backend.pdf.StamperPdfGenerator;

@Deprecated
public class PdfServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Inject
    private StamperPdfGenerator stamperPdfGenerator;

    @Inject
    private FormDataMapper formDataMapper;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        handle(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        handle(request, response);
    }

    private void handle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Formularz form = formDataMapper.getFormData(request);

        byte[] pdfFile = stamperPdfGenerator.generate(form);

        response.setContentType("application/pdf");
        response.setContentLength(pdfFile.length);
        response.getOutputStream().write(pdfFile);
    }
}