package principal;
import java.sql.*;
public class ModuloConexao {
    //metodo responsavel por estabelcer a conexão com o banco
    public static Connection conector(){        
        java.sql.Connection conexao = null;
        //cjam o drive
        String driver = "com.mysql.cj.jdbc.Driver";
        //Informação referente ao banco
        String url = "jdbc:mysql://localhost:3306/consultorio";
        String user = "root";
        String senha = "mh1234";
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url,user,senha);
            return conexao;
        } catch (Exception e) {
            //System.out.println(e);
            //linha de apoio para exclarecer erro
            
            return null;
        }
    }// metodo conector
}//moduloConexao
