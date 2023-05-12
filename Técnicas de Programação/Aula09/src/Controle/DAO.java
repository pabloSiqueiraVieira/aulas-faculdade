/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controle;
import Model.Veterinario;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author autologon
 */
public class DAO {
    Veterinario vet = new Veterinario();
    Conexao conexao = null;
    PreparedStatement st = null;
    
    public void salvar(Veterinario veterinario) throws SQLException{
        conexao.getConnection();
        String sql = "Insert into veterinario (nome, crmv, formacao) values(?, ?, ?)";
        st = conexao.prepareStatement(sql);
        st.setString(1, veterinario.getNome());
        st.setString(2, veterinario.getCrmv());
        st.setString(3, veterinario.getFormacao());
        st.execute();
        

    }
    
    public void pesquisar (Veterinario veterinario) throws SQLException{
        conexao = (Conexao) new Conexao().getConnection();
        String sql = "SELECT * FROM veterinario WHERE crmv = ?";
        PreparedStatement st = conexao.prepareStatement(sql);
        
        st.setString(1, veterinario.getCrmv());
        
        ResultSet rs= st.executeQuery();
        while(rs.next()){
            veterinario.setNome(rs.getString(2));
            veterinario.setFomacao(rs.getString(4));
            
        }
    }
}
