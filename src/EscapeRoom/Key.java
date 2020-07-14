package EscapeRoom;

public class Key {

    private boolean doIHaveKey;

    public boolean isDoIHaveKey() {
        return doIHaveKey;
    }

    public void getKey(){
        doIHaveKey=true;
        System.out.println("You get a key, now you can open doors");
    }


    @Override
    public String toString() {
        return "Key{" +
                "doIHaveKey=" + doIHaveKey +
                '}';
    }
}
