/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bingoserver.models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author valmir.massoni
 */
public class Room implements Cloneable {

    public void setState(RoomState state) {
        this.state = state;
    }

    public BingoCard getCard(User user) {
        for (UserCard uc : userCards) {
            if (uc.getUser().equals(user)) {
                return uc.getCard();
            }
        }

        return null;
    }

    public enum RoomState {
        initialized,
        prestarted,
        interval,
        sorting,
        finalInterval,
    }

    private int id;
    private ArrayList<Integer> sortedNumbers = new ArrayList<>();
    private ArrayList<UserCard> userCards = new ArrayList<>();
    private RoomState state;
    private int time;

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public RoomState getState() {
        return state;
    }

    public int getId() {
        return this.id;
    }

    public void addSortedNumber(int number) {
        this.sortedNumbers.add(number);
    }

    public void addUserCard(UserCard userCard) {
        this.userCards.add(userCard);
    }

    public boolean removeUserCard(UserCard userCard) {
        return this.userCards.remove(userCard);
    }

    public boolean removeUserCardByUser(User u) {
        for (UserCard us : this.userCards) {
            if (u.equals(us.getUser())) {
                this.userCards.remove(us);
                return true;
            }
        }
        return false;
    }

    public User getRoomOwner() {
        for (UserCard uc : this.userCards) {
            if (uc.isRoomOwner()) {
                return uc.getUser();
            }
        }

        return null;
    }

    public List<User> getUsers() {
        List<User> users = new ArrayList<>();

        for (UserCard userCard : userCards) {
            users.add(userCard.getUser());
        }

        return users;
    }

    public List<Integer> getCardsIds() {
        List<Integer> ids = new ArrayList<>();

        for (UserCard userCard : userCards) {
            ids.add(userCard.getCard().getIdCard());
        }

        return ids;
    }

    public Room(int id, UserCard userCard) {
        this.id = id;
        this.userCards.add(userCard);
        this.state = RoomState.initialized;
    }

    public Room(int id) {
        this.id = id;
        this.state = RoomState.initialized;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Room)) {
            return false;
        }

        Room other = (Room) obj;
        if (this.id != other.id) {
            return false;
        }

        if (this.state != other.state) {
            return false;
        }

        if (!(this.sortedNumbers.equals(other.sortedNumbers))) {
            return false;
        }

        if (!(this.userCards.equals(other.sortedNumbers))) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        String str = "Sala " + this.id + "\n\n";
        str += "Numeros Sorteados: \n";
        for (int nr : this.sortedNumbers) {
            str += nr + ", ";
        }

        str += "Usuários / Cartela\n";
        for (UserCard uc : this.userCards) {
            str += uc.toString();
        }

        return str;
    }

    @Override
    public int hashCode() {
        int r = super.hashCode();
        r = r * 7 + Integer.hashCode(this.id);
        r = r * 7 + this.state.hashCode();
        r = r * 7 + this.sortedNumbers.hashCode();
        r = r * 7 + this.userCards.hashCode();

        return r;
    }

    public Room(Room other) throws Exception {
        if (other == null) {
            throw new Exception("Object cannot be null");
        }

        this.id = other.id;
        this.state = other.state;
        this.sortedNumbers = (ArrayList<Integer>) other.sortedNumbers.clone();
        this.userCards = (ArrayList<UserCard>) other.userCards.clone();
    }

    @Override
    public Object clone() {
        Room other = null;
        try {
            other = new Room(this);
        } catch (Exception e) {
        }

        return other;
    }

    public List<Integer> getSortedNumbers() {
        return (List<Integer>) sortedNumbers.clone();
    }
}
