
package com.algaworks.comercial.relatorio;

import com.algaworks.comercial.model.Dao.Login;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletResponse;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
import org.jboss.logging.Logger;

/**
 *
 * @author Helio
 */
public class Relatorios {
    
    private HttpServletResponse response;
    private FacesContext context;
    private InputStream stream; 
    private ByteArrayOutputStream baos;
    private Connection con;


public Relatorios(){
 this.context = FacesContext.getCurrentInstance();
 this.response = (HttpServletResponse) context.getExternalContext().getResponse();

  }

public void getRelatorios(List <Login> lista){
stream = this.getClass().getResourceAsStream("/report/reportHemodinamica.jasper");
Map<String, Object> params = new HashMap<String, Object>();
baos = new ByteArrayOutputStream();

        try {
            
            JasperReport report = (JasperReport) JRLoader.loadObject(stream);
            JasperPrint print = JasperFillManager.fillReport(report, params, getConexao());
            JasperExportManager.exportReportToPdfStream(print, baos);
             
            response.reset();
            response.setContentType("Apliccation/pdf");
            response.setContentLength(baos.size());
            response.setHeader("Content-disposition",    "attacament;   filename-relatorios.pdf");
            response.getOutputStream().write(baos.toByteArray());
            response.getOutputStream().flush();
            response.getOutputStream().close();
            
            
            context.responseComplete();
            
        } catch (JRException ex) {
            
            java.util.logging.Logger.getLogger(Relatorios.class.getName()).log(Level.SEVERE, null, ex);
            
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(Relatorios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

 public Connection getConexao(){
     
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Relatorios.class.getName()).log(Level.SEVERE, null, ex);
        }
     
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/conferenciaenfermagem", "root", "helio");
                    
                    } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Relatorios.class.getName()).log(Level.SEVERE, null, ex);
        }
 return con;
 }  
}