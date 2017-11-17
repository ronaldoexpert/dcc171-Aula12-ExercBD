package dcc171.aula16.exerciciobd;

import java.util.List;

public interface VisitanteDAO {
    public void criar(Visitante visit) throws Exception;
    public void saida(int id) throws Exception;
    public List<Visitante> listarTodos() throws Exception;    
}
