package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Cliente;
import utils.Conexao;

public class ClienteDAO {
	private Connection connection = Conexao.getConexao();

    public void save(Cliente cliente) {
        try {
            PreparedStatement ps = connection.prepareStatement("INSERT INTO dados (nome, email, sangue, telefone, imagem) VALUES (?,?,?,?,?)");
            ps.setString(1, "nome");
            ps.setString(2, "email");
            ps.setString(3, "sangue");
            ps.setString(4, "telefone");
            ps.setString(5, "imagem");
            ps.execute();
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void update(Cliente cliente) {
        try {
            PreparedStatement ps = connection.prepareStatement("UPDATE dados SET  nome=?, email=?, sangue=?, telefone=? WHERE id=?");
            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getEmail());
            ps.setString(3, cliente.getSangue());
            ps.setString(4, cliente.getTelefone());
            ps.setString(5, cliente.getTelefone());
            ps.setInt(6, cliente.getId());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Cliente atualizado com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void saveOrUpdate(Cliente cliente) {
        if (cliente.getId() == 0) {
            save(cliente);
        } else {
            update(cliente);
        }
    }

    public void delete(Cliente cliente) {
        try {
            PreparedStatement ps = connection.prepareStatement("DELETE FROM dados WHERE id=?");
            ps.setInt(1, cliente.getId());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Cliente deletado com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Cliente> getAll() {
        List<Cliente> clientes = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM dados");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setId(rs.getInt("id"));
                cliente.setNome(rs.getString("nome"));
                cliente.setEmail(rs.getString("email"));
                cliente.setSangue(rs.getString("sangue"));
                cliente.setTelefone(rs.getString("telefone"));
                cliente.setImagem(rs.getString("imagem"));
                clientes.add(cliente);
            }
            return clientes;
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
