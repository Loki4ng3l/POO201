package data;

public class clienteDAO {
    private static final String SQL_SELECT ="SELECT * FROM cliente";
    private static final String SQL_INSERT="INSERT INTO cliente(nombre, apellidos, email, rfc, diasCredito, tipoPago, strtiPago) VALUES(?,?,?,?,?,?,?)";
    private static final String SQL_UPDATE="UPDATE cliente SET nombre = ?, apellidos = ?, email = ?, rfc = ?, diasCredito = ?, tipoPago = ?, strtiPago = ? WHERE id = ?";
    private static final String SQL_DELETE="DELETE FROM cliente WHERE id = ?";
}