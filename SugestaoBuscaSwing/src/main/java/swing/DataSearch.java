package swing;

public class DataSearch {
    
    public String texto;
    public boolean story;

    public DataSearch() {
    }

    public DataSearch(String texto, boolean story) {
        this.texto = texto;
        this.story = story;
    }
    
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public boolean isStory() {
        return story;
    }

    public void setStory(boolean story) {
        this.story = story;
    }
    
}
