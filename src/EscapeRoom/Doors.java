package EscapeRoom;

public class Doors {

    private boolean open;

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }


    @Override
    public String toString() {
        return "Doors{" +
                "open=" + open +
                '}';
    }
}
