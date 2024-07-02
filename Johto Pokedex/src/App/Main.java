package App;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //PokemonService class Object to call it's methods
        PokeService ps = new PokeService();
        //For User Input
        Scanner sc = new Scanner(System.in);
        int ch;
        //Loop to display menu of pokedex
        do{
            System.out.println("ENTER A NUMBER TO USE THE POKEDEX");
            System.out.println("1. VIEW POKEMON");
            System.out.println("2. SEARCH NAME");
            System.out.println("3. SEARCH BY TYPE");
            System.out.println("4. ORDER POKEMON");
            System.out.println("5. FILTER POKEMON ATK");
            System.out.println("6. FILTER POKEMON DEF");
            System.out.println("7. FILTER POKEMON SPD");
            System.out.println("8. VIEW FAVORITES");
            System.out.println("9. INSERT INTO FAVORITES");
            System.out.println("10 DELETE FAVORITES");
            System.out.println("11. UPDATE FAVORITES");
            System.out.println("12. EXIT");
            ch = sc.nextInt();

            switch(ch){
                //List Pokemon In Pokedex
                case 1:
                    ps.listPokemon();
                    break;
                //Search For Pokemon In Pokedex
                case 2:
                    ps.searchName();
                    break;
                //Search For Pokemon By Type
                case 3:
                    ps.searchByType();
                    break;
                //Order Pokemon By ATK, DEF, OR SPD
                case 4:
                    ps.orderPoke();
                    break;
                //FILTER Pokemon in PokeDex By ATK
                case 5:
                    ps.filterPokeAtK();
                    break;
                //FILTER Pokemon in PokeDex By DEF
                case 6:
                    ps.filterPokeDef();
                    break;
                //FILTER Pokemon in PokeDex By SPD
                case 7:
                    ps.filterPokeSpd();
                    break;
                //VIEW FAVORITES
                case 8:
                    ps.viewFav();
                    break;
                //INSERT INTO FAVORITES
                case 9:
                    ps.insertFav();
                    break;
                //DELETE FROM FAVORITES
                case 10:
                    ps.deleteFav();
                    break;
                //UPDATE FAVORITES
                case 11:
                    ps.updateFav();
                    break;
                case 12:
                    System.out.println("EXIT");
                    break;
            }
        }while(ch != 12);
    }
}
