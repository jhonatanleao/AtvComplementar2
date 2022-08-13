package dao;

import conexaoBanco.SqliteConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author jhonatan
 */
public class ContaCorrenteDAO {

    public void create(ContaCorrente conta){
        Connection con = SqliteConnection.getConnection();
        PreparedStatement stmt = null;

        try{
            stmt = con.prepareStatement("INSERT INTO pessoaFisica (idResponsavel, naturalidade, cpf) VALUES(?,?,?)");
            stmt.setInt(1, pessoaFisica.getIdResponsavel());
            stmt.setString(2, pessoaFisica.getNaturalidade());
            stmt.setString(3, pessoaFisica.getCpf());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao criar: " + ex);
        } finally {
            SqliteConnection.closeConnection(con, stmt);
        }
    }
    
}
