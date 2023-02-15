package model;

import java.util.ArrayList;
import java.util.List;

public class ListPlayer {
    public static int count;
    public static String name;
    public static List<Player> playerList = new ArrayList<>();
    public static List<Player> getListPlayer() {
        return playerList;
    }
    public static void addPlayer(Player player){
        playerList.add(player);
    }

    public static void setName(String name) {
        ListPlayer.name = name;
    }

    public static String getName() {
        return name;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        ListPlayer.count = count;
    }

    public static List<Player> getPlayerList() {
        return playerList;
    }

    public static void setPlayerList(List<Player> playerList) {
        ListPlayer.playerList = playerList;
    }

}
