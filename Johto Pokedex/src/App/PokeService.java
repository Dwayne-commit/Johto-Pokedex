package App;

import java.util.Scanner;

public class PokeService {

    POKEDAO pd = new POKEDAO(DBConnection.getConnection());

    Scanner sc;

    public PokeService(){
        sc = new Scanner(System.in);
    }

    public void listPokemon(){
        pd.display();
    }

    public void searchName(){
        System.out.println("ENTER THE NAME OF THE POKEMON YOU WOULD LIKE TO SEARCH FOR: ");
        String name = sc.nextLine();
        pd.searchName(name);
    }

    public void searchByType(){
        System.out.println("ENTER THE TYPE 1 OF THE POKEMON: ");
        String type = sc.nextLine();
        sc.nextLine();
        System.out.println("ENTER THE TYPE 2 OF THE POKEMON: ");
        String type2 = sc.nextLine();
        pd.searchType(type,type2);
    }

    public void orderPoke(){
        System.out.println("ENTER A NUMBER TO ORDER POKEMON BY 1)ATK, 2)DEF, OR 3)SPD");
        int inp = sc.nextInt();
        if(inp == 1){
            System.out.println("ENTER 1 FOR ASC AND 2 FOR DESC");
            int inpp = sc.nextInt();
            pd.groupPokeAtk(inpp);
        } else if(inp == 2){
            System.out.println("ENTER 1 FOR ASC AND 2 FOR DESC");
            int inpp = sc.nextInt();
            pd.groupPokeDef(inpp);
        } else if(inp == 3){
            System.out.println("ENTER 1 FOR ASC AND 2 FOR DESC");
            int inpp = sc.nextInt();
            pd.groupPokeSpd(inpp);
        }
    }

    public void filterPokeAtK(){
        System.out.println("ENTER THE NUMBER OF ATK STAT THE POKEMON HAS");
        int inp = sc.nextInt();
        pd.filterPokeAtk(inp);
    }

    public void filterPokeDef(){
        System.out.println("ENTER THE NUMBER OF DEF STAT THE POKEMON HAS");
        int inp = sc.nextInt();
        pd.filterPokeDef(inp);
    }

    public void filterPokeSpd(){
        System.out.println("ENTER THE NUMBER OF SPD STAT THE POKEMON HAS");
        int inp = sc.nextInt();
        pd.filterPokeSpd(inp);
    }

    public void insertFav(){
        System.out.println("ENTER THE NAME OF THE POKEMON YOU ARE ADDING TO FAVORITES");
        String nam = sc.nextLine();
        pd.insertPoke(nam);
    }

    public void viewFav(){
        pd.viewPoke();
    }

    public void deleteFav(){
        System.out.println("ENTER THE NAME OF THE POKEMON YOU ARE DELETING FROM FAVORITES");
        String nam = sc.nextLine();
        pd.deletePoke(nam);
    }

    public void updateFav(){
        System.out.println("ENTER THE NAME OF THE POKEMON");
        String nam = sc.nextLine();
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER THE NAME OF THE GAME WHERE YOU CAUGHT THIS POKEMON");
        String gam = scan.nextLine();
        pd.updateFav(nam,gam);
    }
}
