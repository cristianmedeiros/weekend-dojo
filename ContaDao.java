import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ContaDao {
	private Connection cnn;

	public ContaDao() {
		try {
            //Class.forName("org.postgresql.Driver");
			this.cnn = DriverManager.getConnection("jdbc:postgresql://localhost/dojo?user=postgres");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void adiciona(Conta conta) {
		try {
			String sql = "insert into conta(agencia, conta, titular, saldo) values (?,?,?,?)";
			PreparedStatement ps = cnn.prepareStatement(sql);
            ps.setInt(1, conta.getAgencia());
            ps.setInt(2, conta.getConta());
            ps.setString(3, conta.getTitular());
            ps.setDouble(4, conta.saldo);
			
			
			ps.execute();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}