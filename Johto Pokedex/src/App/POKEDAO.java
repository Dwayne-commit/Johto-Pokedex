package App;

import com.mysql.cj.protocol.Resultset;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class POKEDAO {

    private Connection connection;

    private PreparedStatement ps;

    Scanner sc;

    public POKEDAO(Connection connection){
        this.connection = connection;
        sc = new Scanner(System.in);
    }

    //METHOD TO VIEW DE TABLE
    public void display(){
        try{
            ps = connection.prepareStatement("select * from dex");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
              System.out.println("POKEDEX NUMBER: " + rs.getInt(1));
              System.out.println("NAME: " + rs.getString(2));
              System.out.println("SPECIES: " + rs.getString(3));
              System.out.println("TYPE 1: " + rs.getString(4));
              System.out.println("TYPE 2: " + rs.getString(5));
              System.out.println("ATTACK: " + rs.getInt(6));
              System.out.println("DEFENSE: " + rs.getInt(7));
              System.out.println("SPEED: " + rs.getInt(8));
              System.out.println("FAVORITE: " + rs.getString(9));
              System.out.println("-----------------------------------");
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    //METHOD TO SEARCH DE TABLE BY NAME
    public void searchName(String name){
        try {
            ps = connection.prepareStatement("select * from dex where name like '%"+name+"%'");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                System.out.println("POKEDEX NUMBER: " + rs.getInt(1));
                System.out.println("NAME: " + rs.getString(2));
                System.out.println("SPECIES: " + rs.getString(3));
                System.out.println("TYPE 1: " + rs.getString(4));
                System.out.println("TYPE 2: " + rs.getString(5));
                System.out.println("ATTACK: " + rs.getInt(6));
                System.out.println("DEFENSE: " + rs.getInt(7));
                System.out.println("SPEED: " + rs.getInt(8));
                System.out.println("FAVORITE: " + rs.getString(9));
                System.out.println("-----------------------------------");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //METHOD TO SEARCH DEX TABLE BY TYPE
    public void searchType(String type, String type1){
        try{
            if(type1.equals("") || type1 == null) {
                ps = connection.prepareStatement("select * from dex where name like '%" + type + "%'");
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    System.out.println("POKEDEX NUMBER: " + rs.getInt(1));
                    System.out.println("NAME: " + rs.getString(2));
                    System.out.println("SPECIES: " + rs.getString(3));
                    System.out.println("TYPE 1: " + rs.getString(4));
                    System.out.println("TYPE 2: " + rs.getString(5));
                    System.out.println("ATTACK: " + rs.getInt(6));
                    System.out.println("DEFENSE: " + rs.getInt(7));
                    System.out.println("SPEED: " + rs.getInt(8));
                    System.out.println("FAVORITE: " + rs.getString(9));
                    System.out.println("-----------------------------------");
                }
            } else {
                ps = connection.prepareStatement("select * from dex where type like '%" + type + "%' and type2 like '%"+type1+"%'");
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    System.out.println("POKEDEX NUMBER: " + rs.getInt(1));
                    System.out.println("NAME: " + rs.getString(2));
                    System.out.println("SPECIES: " + rs.getString(3));
                    System.out.println("TYPE 1: " + rs.getString(4));
                    System.out.println("TYPE 2: " + rs.getString(5));
                    System.out.println("ATTACK: " + rs.getInt(6));
                    System.out.println("DEFENSE: " + rs.getInt(7));
                    System.out.println("SPEED: " + rs.getInt(8));
                    System.out.println("FAVORITE: " + rs.getString(9));
                    System.out.println("-----------------------------------");
                }
            }
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    //METHOD TO GROUP DEX TABLE BY ATH
    public void groupPokeAtk(int cho){
        try {
            if(cho == 1){
                ps = connection.prepareStatement("select * from dex order by atk");
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    System.out.println("POKEDEX NUMBER: " + rs.getInt(1));
                    System.out.println("NAME: " + rs.getString(2));
                    System.out.println("SPECIES: " + rs.getString(3));
                    System.out.println("TYPE 1: " + rs.getString(4));
                    System.out.println("TYPE 2: " + rs.getString(5));
                    System.out.println("ATTACK: " + rs.getInt(6));
                    System.out.println("DEFENSE: " + rs.getInt(7));
                    System.out.println("SPEED: " + rs.getInt(8));
                    System.out.println("FAVORITE: " + rs.getString(9));
                    System.out.println("-----------------------------------");
            } if(cho == 2){
                    ps = connection.prepareStatement("select * from dex order by atk desc");
                    ResultSet rt = ps.executeQuery();
                    while (rt.next()) {
                        System.out.println("POKEDEX NUMBER: " + rt.getInt(1));
                        System.out.println("NAME: " + rt.getString(2));
                        System.out.println("SPECIES: " + rt.getString(3));
                        System.out.println("TYPE 1: " + rt.getString(4));
                        System.out.println("TYPE 2: " + rt.getString(5));
                        System.out.println("ATTACK: " + rt.getInt(6));
                        System.out.println("DEFENSE: " + rt.getInt(7));
                        System.out.println("SPEED: " + rt.getInt(8));
                        System.out.println("FAVORITE: " + rt.getString(9));
                        System.out.println("-----------------------------------");
            }
            } else{
                    System.out.println("WRONG INPUT");
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //METHOD TO GROUP DEX TABLE BY DEF
    public void groupPokeDef(int cho){
        try {
            if(cho == 1){
                ps = connection.prepareStatement("select * from dex order by def");
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    System.out.println("POKEDEX NUMBER: " + rs.getInt(1));
                    System.out.println("NAME: " + rs.getString(2));
                    System.out.println("SPECIES: " + rs.getString(3));
                    System.out.println("TYPE 1: " + rs.getString(4));
                    System.out.println("TYPE 2: " + rs.getString(5));
                    System.out.println("ATTACK: " + rs.getInt(6));
                    System.out.println("DEFENSE: " + rs.getInt(7));
                    System.out.println("SPEED: " + rs.getInt(8));
                    System.out.println("FAVORITE: " + rs.getString(9));
                    System.out.println("-----------------------------------");
                } if(cho == 2){
                    ps = connection.prepareStatement("select * from dex order by def desc");
                    ResultSet rt = ps.executeQuery();
                    while (rt.next()) {
                        System.out.println("POKEDEX NUMBER: " + rt.getInt(1));
                        System.out.println("NAME: " + rt.getString(2));
                        System.out.println("SPECIES: " + rt.getString(3));
                        System.out.println("TYPE 1: " + rt.getString(4));
                        System.out.println("TYPE 2: " + rt.getString(5));
                        System.out.println("ATTACK: " + rt.getInt(6));
                        System.out.println("DEFENSE: " + rt.getInt(7));
                        System.out.println("SPEED: " + rt.getInt(8));
                        System.out.println("FAVORITE: " + rt.getString(9));
                        System.out.println("-----------------------------------");
                    }
                } else{
                    System.out.println("WRONG INPUT");
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //METHOD TO GROUP DEX TABLE BY SPD
    public void groupPokeSpd(int cho){
        try {
            if(cho == 1){
                ps = connection.prepareStatement("select * from dex order by spd");
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    System.out.println("POKEDEX NUMBER: " + rs.getInt(1));
                    System.out.println("NAME: " + rs.getString(2));
                    System.out.println("SPECIES: " + rs.getString(3));
                    System.out.println("TYPE 1: " + rs.getString(4));
                    System.out.println("TYPE 2: " + rs.getString(5));
                    System.out.println("ATTACK: " + rs.getInt(6));
                    System.out.println("DEFENSE: " + rs.getInt(7));
                    System.out.println("SPEED: " + rs.getInt(8));
                    System.out.println("FAVORITE: " + rs.getString(9));
                    System.out.println("-----------------------------------");
                } if(cho == 2){
                    ps = connection.prepareStatement("select * from dex order by spd desc");
                    ResultSet rt = ps.executeQuery();
                    while (rt.next()) {
                        System.out.println("POKEDEX NUMBER: " + rt.getInt(1));
                        System.out.println("NAME: " + rt.getString(2));
                        System.out.println("SPECIES: " + rt.getString(3));
                        System.out.println("TYPE 1: " + rt.getString(4));
                        System.out.println("TYPE 2: " + rt.getString(5));
                        System.out.println("ATTACK: " + rt.getInt(6));
                        System.out.println("DEFENSE: " + rt.getInt(7));
                        System.out.println("SPEED: " + rt.getInt(8));
                        System.out.println("FAVORITE: " + rt.getString(9));
                        System.out.println("-----------------------------------");
                    }
                } else{
                    System.out.println("WRONG INPUT");
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //METHOD TO FILTER DE TABLE BY ATK
    public void filterPokeAtk(int inp){
        try{
            ps = connection.prepareStatement("select * from dex where atk >= '"+inp+"'");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                System.out.println("POKEDEX NUMBER: " + rs.getInt(1));
                System.out.println("NAME: " + rs.getString(2));
                System.out.println("SPECIES: " + rs.getString(3));
                System.out.println("TYPE 1: " + rs.getString(4));
                System.out.println("TYPE 2: " + rs.getString(5));
                System.out.println("ATTACK: " + rs.getInt(6));
                System.out.println("DEFENSE: " + rs.getInt(7));
                System.out.println("SPEED: " + rs.getInt(8));
                System.out.println("FAVORITE: " + rs.getString(9));
                System.out.println("-----------------------------------");
            }
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    //METHOD TO FILTER DEX TABLE BY DEF
    public void filterPokeDef(int inp){
        try{
            ps = connection.prepareStatement("select * from dex where def >= '"+inp+"'");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                System.out.println("POKEDEX NUMBER: " + rs.getInt(1));
                System.out.println("NAME: " + rs.getString(2));
                System.out.println("SPECIES: " + rs.getString(3));
                System.out.println("TYPE 1: " + rs.getString(4));
                System.out.println("TYPE 2: " + rs.getString(5));
                System.out.println("ATTACK: " + rs.getInt(6));
                System.out.println("DEFENSE: " + rs.getInt(7));
                System.out.println("SPEED: " + rs.getInt(8));
                System.out.println("FAVORITE: " + rs.getString(9));
                System.out.println("-----------------------------------");
            }
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    //METHOD TO FILTER DEX TABLE BY SPD
    public void filterPokeSpd(int inp){
        try{
            ps = connection.prepareStatement("select * from dex where spd >= '"+inp+"'");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                System.out.println("POKEDEX NUMBER: " + rs.getInt(1));
                System.out.println("NAME: " + rs.getString(2));
                System.out.println("SPECIES: " + rs.getString(3));
                System.out.println("TYPE 1: " + rs.getString(4));
                System.out.println("TYPE 2: " + rs.getString(5));
                System.out.println("ATTACK: " + rs.getInt(6));
                System.out.println("DEFENSE: " + rs.getInt(7));
                System.out.println("SPEED: " + rs.getInt(8));
                System.out.println("FAVORITE: " + rs.getString(9));
                System.out.println("-----------------------------------");
            }
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    //Method to insert into favorite table
    public void insertPoke(String name){
        try{
            PreparedStatement ps = connection.prepareStatement("select * from dex where name like '%"+name+"%'");
            System.out.println("ENTER THE NAME OF THE GAME WHERE YOU CAUGHT THIS POKEMON SAVE FILE ");
            String gam = sc.nextLine();
            ResultSet rs = ps.executeQuery();
            ps = connection.prepareStatement("insert into fav(num, name, species, type, type2, atk, def, spd, fav, save) values(?,?,?,?,?,?,?,?,?,?)");
            while(rs.next()){
                int num = rs.getInt(1);
                String namee = rs.getString(2);
                String species = rs.getString(3);
                String type = rs.getString(4);
                String type2 = rs.getString(5);
                int atk = rs.getInt(6);
                int def = rs.getInt(7);
                int spd = rs.getInt(8);
                String fav = rs.getString(9);
                ps.setInt(1,num);
                ps.setString(2,namee);
                ps.setString(3,species);
                ps.setString(4,type);
                ps.setString(5,type2);
                ps.setInt(6,atk);
                ps.setInt(7,def);
                ps.setInt(8,spd);
                ps.setString(9,"YES");
                ps.setString(10,gam);
                ps.addBatch();
                int res = ps.executeUpdate();
                if(res > 0){ System.out.println("INSERT SUCCESS");}
            }
            ps.executeBatch();
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    //Method to View favorite table
    public void viewPoke(){
        try{
            ps = connection.prepareStatement("select * from fav");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                System.out.println("POKEDEX NUMBER: " + rs.getInt(1));
                System.out.println("NAME: " + rs.getString(2));
                System.out.println("SPECIES: " + rs.getString(3));
                System.out.println("TYPE 1: " + rs.getString(4));
                System.out.println("TYPE 2: " + rs.getString(5));
                System.out.println("ATTACK: " + rs.getInt(6));
                System.out.println("DEFENSE: " + rs.getInt(7));
                System.out.println("SPEED: " + rs.getInt(8));
                System.out.println("FAVORITE: " + rs.getString(9));
                System.out.println("SAVE FILE: " + rs.getString(10));
                System.out.println("-----------------------------------");
            }
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    //Method to delete from the fav table
    public void deletePoke(String name){
        try{
            ps = connection.prepareStatement("delete from fav where name like '%"+name+"%'");
            ps.executeUpdate();
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    //Method with a query to update the fav table
    public void updateFav(String name, String gam){
        try{
            ps = connection.prepareStatement("update fav set save = '"+gam+"' where name like '%"+name+"%'");
            ps.executeUpdate();
            ps = connection.prepareStatement("select * from fav");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                System.out.println("POKEDEX NUMBER: " + rs.getInt(1));
                System.out.println("NAME: " + rs.getString(2));
                System.out.println("SPECIES: " + rs.getString(3));
                System.out.println("TYPE 1: " + rs.getString(4));
                System.out.println("TYPE 2: " + rs.getString(5));
                System.out.println("ATTACK: " + rs.getInt(6));
                System.out.println("DEFENSE: " + rs.getInt(7));
                System.out.println("SPEED: " + rs.getInt(8));
                System.out.println("FAVORITE: " + rs.getString(9));
                System.out.println("SAVE FILE: " + rs.getString(10));
                System.out.println("-----------------------------------");
            }
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
}
