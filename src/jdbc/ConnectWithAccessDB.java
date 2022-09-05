package jdbc;

import java.sql.*;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class ConnectWithAccessDB {

    public static List<String> eventRecord() {
        // TODO Auto-generated method stub

        String user="";
        String pass="";
        String databaseURL = "jdbc:ucanaccess://C:/Program Files (x86)/ZKTime5.0/att2000.mdb";



        List<String> eventRecordList=new LinkedList<>();
        try  {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection connection= DriverManager.getConnection(databaseURL,user,pass);

            LocalDate date= LocalDate.now();
            LocalDate prevDate=date.minusDays(1);
            LocalDate prevDate2=date.minusDays(2);

            //String  sql = "SELECT * FROM checkinout"; checkinout.checktime,userinfo.Badgenumber
            String  sql = "SELECT * FROM checkinout,userinfo where userinfo.userid=checkinout.userid and DateValue([checktime])<='"+date+"'"+"and DateValue([checktime])>='"+prevDate2+"'";

            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);

            while (result.next()) {



                if(result.getDate("checktime").toString().equals(date.toString()) ||
                        result.getDate("checktime").toString().equals(prevDate.toString())||
                        result.getDate("checktime").toString().equals(prevDate2.toString()))
                {
                    Time ariseTime= result.getTime("checktime");
                    Date ariseDate= result.getDate("checktime");
                    Long eventType=  11L;
                    Long card=  result.getLong("Badgenumber");
                    Long empId=  12L;
                    String code= result.getString("Badgenumber");

                    HashMap<String, String> eventRecord=new HashMap<>();
                    eventRecord.put("ariseTime", ariseTime.toString());
                    eventRecord.put("ariseDate", ariseDate.toString());
                    eventRecord.put("eventType", eventType.toString());
                    eventRecord.put("card", card.toString());
                    eventRecord.put("empId", empId.toString());
                    eventRecord.put("code", code);

                    eventRecordList.add(eventRecord.toString());


                }



            }
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();

        }
        return eventRecordList;

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ant();
    }

    public  static  void  ant(){
        // variables
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        // Step 1: Loading or registering Oracle JDBC driver class
        try {

            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        }
        catch(ClassNotFoundException cnfex) {

            System.out.println("Problem in loading or "
                    + "registering MS Access JDBC driver");
            cnfex.printStackTrace();
        }

        // Step 2: Opening database connection
        try {

            String msAccDB = "jdbc:ucanaccess://C:/Program Files (x86)/ZKTime5.0/att2000.mdb";
            String dbURL = "jdbc:ucanaccess://C:/Program Files (x86)/ZKTime5.0/att2000.mdb";

            // Step 2.A: Create and get connection using DriverManager class
            connection = DriverManager.getConnection(dbURL);

            // Step 2.B: Creating JDBC Statement
            statement = connection.createStatement();

            // Step 2.C: Executing SQL & retrieve data into ResultSet
            resultSet = statement.executeQuery("SELECT * FROM PLAYER");

            System.out.println("ID\tName\t\t\tAge\tMatches");
            System.out.println("==\t================\t===\t=======");

            // processing returned data and printing into console
            while(resultSet.next()) {
                System.out.println(resultSet.getInt(1) + "\t" +
                        resultSet.getString(2) + "\t" +
                        resultSet.getString(3) + "\t" +
                        resultSet.getString(4));
            }
        }
        catch(SQLException sqlex){
            sqlex.printStackTrace();
        }
        finally {

            // Step 3: Closing database connection
            try {
                if(null != connection) {

                    // cleanup resources, once after processing
                    resultSet.close();
                    statement.close();

                    // and then finally close connection
                    connection.close();
                }
            }
            catch (SQLException sqlex) {
                sqlex.printStackTrace();
            }
        }
    }

}
