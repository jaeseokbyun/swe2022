package kr.co.jaeseok;

public class TodoTheme {
     enum TodoThemeColor {BLUE, RED, PURPLE, GREEN, SKYBLUE}
     enum TodoThemeImage {MOUNTAIN,  BUSSTATION, HOUSE, AIRPLANE, TOWER, NOTHING}

    private TodoThemeImage themeImage=TodoThemeImage.MOUNTAIN;
    private TodoThemeColor themeColor=TodoThemeColor.BLUE;

     void settingThemeColor(TodoThemeColor color){
        this.themeColor = color;
    }

     void settingThemeImage(TodoThemeImage image){
        this.themeImage = image;

    }
    public String toString() {
        return "themecolor: "+themeColor.toString()+"themeimage: "+themeImage.toString();
    }
    public TodoThemeColor getThemeColor() {return this.themeColor;}
    public TodoThemeImage getThemeImage() {return this. themeImage; }
}