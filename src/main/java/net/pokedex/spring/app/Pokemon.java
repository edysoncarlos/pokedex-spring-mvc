package net.pokedex.spring.app;

public class Pokemon {
     
    private String name;
    private String url;
    private String img;
     
    public Pokemon(String name, String url, String img) {
		super();
		this.name = name;
		this.url = url;
		this.img = img;
	}

	public String getName()
    {
        return name;
    }
     
    public void setName(String name)
    {
        this.name = name;
    }
     
    public String getUrl()
    {
        return url;
    }
     
    public void setUrl(String url)
    {
        this.url = url;
    }

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}
      
}