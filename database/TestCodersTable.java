package tech.codingclub.database;

import tech.codingclub.entity.Coders;
import java.sql.*;
import org.jooq.*;
import org.jooq.impl.DSL;
//import static

public class TestCodersTable {

    public static void main(String[] args) {

        Coders coder = new Coders("Tanay", 22L );

        //Insert this object into DB !

//           < ENTITY CLASS>
//        new GenericDB<Coders>().addRow(tech.codingclub.tables.Coders.CODERS, akshat);
        new GenericDB<Coders>().addRow(tech.codingclub.tables.CODERS,coder);
    }
}
