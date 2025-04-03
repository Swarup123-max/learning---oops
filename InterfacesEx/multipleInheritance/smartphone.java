package InterfacesEx.multipleInheritance;

public class smartphone implements MusicPlayer , Phone {



    @Override
    public void endcall() {
        
        
    }

    @Override
    public void playMusic() {
        
        
    }

    @Override
    public void stopmusic() {
        
        
    }

    @Override
    public void makeCall(int num) {
        
        throw new UnsupportedOperationException("Unimplemented method 'makeCall'");
    }

}
