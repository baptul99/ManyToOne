package ManyToOne;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SaveUserManyToOne 
{
public static void main(String[] args) {
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
			System.out.println(factory);
}
}
