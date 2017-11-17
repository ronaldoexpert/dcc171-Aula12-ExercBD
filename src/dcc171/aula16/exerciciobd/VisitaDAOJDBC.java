package dcc171.aula16.exerciciobd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class VisitaDAOJDBC implements VisitanteDAO{
    private Connection conexao;
    private PreparedStatement operacaoInsere;
    private PreparedStatement operacaoListar;
    private PreparedStatement operacaoSaida;

    public VisitaDAOJDBC() throws Exception {
        conexao = ConexaoBD.getConnection();
        operacaoInsere = conexao.prepareStatement("INSERT INTO visitante(nome, idade, entrada) VALUES(?,?, current_timestamp)");
        operacaoListar = conexao.prepareStatement("SELECT nome, idade, entrada, saida FROM visitante ORDER BY entrada");
        operacaoSaida = conexao.prepareStatement("Update VISITANTE set saida = current_timestamp where id = ?");
    }  
    
    public void criar(Visitante visit) throws Exception {
        operacaoInsere.clearParameters();
        operacaoInsere.setString(1, visit.getNome());
        operacaoInsere.setInt(2, visit.getIdade());
        operacaoInsere.executeUpdate();
    }
    
    public void saida(int id) throws Exception {
        operacaoSaida.clearParameters();
        operacaoInsere.setInt(id, 1);
        operacaoSaida.executeUpdate();        
    }

    public List<Visitante> listarTodos() throws Exception {
        List<Visitante> visitante = new ArrayList<>();
        ResultSet resultado = operacaoListar.executeQuery();
        while (resultado.next()) {
            Visitante v = new Visitante();
            v.setNome(resultado.getString(1));
            v.setIdade(resultado.getInt(2));
            v.setEntrada(resultado.getDate(3));
            v.setSaida(resultado.getDate(4));
            visitante.add(v);
        }
        return visitante;
    }
}
