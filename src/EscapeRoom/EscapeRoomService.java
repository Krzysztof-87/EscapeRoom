package EscapeRoom;

import java.util.LinkedList;
import java.util.List;

public class EscapeRoomService {

    private List<Room> roomList = new LinkedList<>();
    private Room room;


    public EscapeRoomService(Room room) {
        this.room = room;
        roomList.add(room);
    }

    public void useWindow(){
        for (Room room : roomList) {
            room.getWindow().useWindow();

        }
    }

    public void getAKey(){
        for (Room room : roomList) {
            room.getKey().getKey();
        }
    }

    public void openDoors(){
        for (Room room : roomList) {
            if (room.getKey().isDoIHaveKey()){
                room.getDoors().setOpen(true);
                System.out.println("Well done, doors has been open!");
                return;
            }else
                System.out.println("You need to have a key in order to open this doors");
        }
    }

    @Override
    public String toString() {
        return "EscapeRoomService{" +
                "roomList=" + roomList +
                '}';
    }
}
