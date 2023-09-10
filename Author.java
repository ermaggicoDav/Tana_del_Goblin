package objects;
import java.util.Date;

public class Author {
    private String name;
    private String surname;
    private Date birthDate;
    private String biography;
    private int awards;
    
 // getters and setters
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public String getBiography() {
		return biography;
	}
	public void setBiography(String biography) {
		this.biography = biography;
	}
	public int getAwards() {
		return awards;
	}
	public void setAwards(int awards) {
		this.awards = awards;
	}

    
}
