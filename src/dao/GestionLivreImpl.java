package dao;
import dao.InterfaceGestionLivre;
import model.Livre;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query ;

public class GestionLivreImpl implements InterfaceGestionLivre{
	EntityManager em;

	public GestionLivreImpl () {
		EntityManagerFactory F = Persistence.createEntityManagerFactory("test1");
		em = F.createEntityManager();
	}

	@Override
	public Livre getLivreByID(int id) {
		 
		Query q = (Query) em.createQuery("select l from livre l where l.id=:id");
		q.setParameter("id", id);
		List<Livre> l = q.getResultList();
		return l.get(0);

	}

	@Override
	public List<Livre> getAllLivre() {
		Query q = (Query) em.createQuery("select l from l" ) ;
		List<Livre> l = q.getResultList() ;
		return l ;
	}

	@Override
	public void AjoutLivre(Livre l) {

	}

	@Override
	public void ModifieLivreById(int id, String description, int qte) {

	}
	 public void DeleteLivre( Livre l) {
		 
	 }
public static void main(String[] args )	{
	 InterfaceGestionLivre cc = new GestionLivreImpl() ;
	  List<Livre> l1 = new ArrayList<Livre>() ;
	 l1=cc.getAllLivre() ;
	 System.out.println(1) ;
}





}
