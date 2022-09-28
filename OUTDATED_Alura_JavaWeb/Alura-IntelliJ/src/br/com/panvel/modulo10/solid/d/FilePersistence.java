package br.com.panvel.modulo10.solid.d;

public class FilePersistence {
    private MySQLConnection dbConnection;
    FilePersistence(MySQLConnection dbConnection){
        this.dbConnection = dbConnection;
    }

    public void save(File file){
        dbConnection.connect();
        /* Envia arquivo para DB */
    }


}

class File{}

interface DBConnectionInterface{
    void connect();
}

class MySQLConnection implements DBConnectionInterface{
    public void connect()
    {/* faz alguma coisa */}
}

class OracleConnection implements DBConnectionInterface{
    public void connect()
    {/* faz alguma coisa */}
}

class SQLServer implements DBConnectionInterface{
    public void connect()
    {/* faz alguma coisa */}
}


