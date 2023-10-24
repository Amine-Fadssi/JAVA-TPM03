package tp03;

import java.util.ArrayList;
import java.util.List;

public class MetierProduitImpl implements IMetier<Produit> {
    List<Produit> listProduits = new ArrayList<>();
    @Override
    public void add(Produit o) {
        listProduits.add(o);
    }

    @Override
    public List<Produit> getAll() {
        return listProduits;
    }

    @Override
    public Produit findById(int id) {
        for (Produit produit:listProduits) {
            if (produit.getId() == id)
                return produit;
        }
        return null;
    }

    @Override
    public void delete(int id) {
        Produit deleteProduit = null;
        for (Produit produit:listProduits) {
            if (produit.getId() == id)
                deleteProduit = produit;
        }
        listProduits.remove(deleteProduit);
    }
}
