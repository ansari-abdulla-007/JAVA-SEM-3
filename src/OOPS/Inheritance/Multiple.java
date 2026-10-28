package OOPS.Inheritance;

public class Multiple {
    public static void main(String[] args){
        SmartPhone s=new SmartPhone();
        s.takePhoto();
        s.playMusic();
    }
}
interface Camera{
    void takePhoto();
}
interface MusicPlayer{
    void playMusic();
}
class SmartPhone implements Camera,MusicPlayer{
    public void takePhoto(){
        System.out.println("Taking Photo");
    }
    public void playMusic(){
        System.out.println("Playing Music");
    }
}