import java.util.ArrayList;
import java.util.List;

/**
 * Armazem
 * Autor: Gabriel Sousa
 * RA: 1997432
 */
public final class Armazem {

    private List<MountainBike> vetMBikes;
    private List<EBike> vetEBikes;

    Armazem() {
        this.vetMBikes = new ArrayList<MountainBike>();
        this.vetEBikes = new ArrayList<EBike>();
    }

    // MOUNTAIN BIKE
    public List<MountainBike> getBDMBikes() {
        return vetMBikes;
    }

    public MountainBike consultar(MountainBike mBike) {
        // Percorre o vetor pelo codigo atraves do objeto e retorna um objeto
        int i = 0;
        while (i < vetMBikes.size()) {
            if (vetMBikes.get(i).getFabricacao().getCodFab() == mBike.getFabricacao().getCodFab()) {
                return vetMBikes.get(i);
            }
            i++;
        }

        return null;
    }

    public int consultar(MountainBike mBike, int index) {
        // Percorre o vetor pelo codigo atraves do objeto
        // e retorna o index (posicao no vetor) do objeto encontrado
        index = -1;
        int i = 0;
        while (i < vetMBikes.size()) {
            if (vetMBikes.get(i).getFabricacao().getCodFab() == mBike.getFabricacao().getCodFab()) {
                return i;
            }
            i++;
        }

        return index;
    }

    public MountainBike consultarMB(int index) {
        // Complexidade de tempo: O(1); retorna o objeto da posicao x do vetor
        return vetMBikes.get(index);
    }

    public boolean inserir(MountainBike mBike) {
        // Recebe um objeto, consulta para ver se ja existe um com o mesmo codigo
        // senao, add no vetor e retorna verdadeiro
        if (consultar(mBike) == null) {
            vetMBikes.add(mBike);
            return true;
        }

        return false;
    }

    public void alterar(int index, MountainBike mBike) {
        vetMBikes.set(index, mBike);
    }

    public void excluir(MountainBike mBike, int index) {
        vetMBikes.remove(index);
    }

    // E-BIKE
    public List<EBike> getVetEBikes() {
        return vetEBikes;
    }

    public EBike consultar(EBike eBike) {
        // Percorre o vetor pelo codigo atraves do objeto e retorna um objeto
        int i = 0;
        while (i < vetEBikes.size()) {
            if (vetEBikes.get(i).getFabricacao().getCodFab() == eBike.getFabricacao().getCodFab()) {
                return vetEBikes.get(i);
            }
            i++;
        }

        return null;
    }

    public int consultar(EBike eBike, int index) {
        // Percorre o vetor pelo codigo atraves do objeto
        // e retorna o index (posicao no vetor) do objeto encontrado
        index = -1;
        int i = 0;
        while (i < vetEBikes.size()) {
            if (vetEBikes.get(i).getFabricacao().getCodFab() == eBike.getFabricacao().getCodFab()) {
                return i;
            }
            i++;
        }

        return index;
    }

    public EBike consultarEB(int index) {
        // Complexidade de tempo: O(n); retorna o objeto da posicao x do vetor
        return vetEBikes.get(index);
    }

    public boolean inserir(EBike eBike) {
        // Recebe um objeto, consulta para ver se ja existe um com o mesmo codigo
        // senao, add no vetor e retorna verdadeiro
        if (consultar(eBike) == null) {
            vetEBikes.add(eBike);
            return true;
        }

        return false;
    }

    public void alterar(int index, EBike eBike) {
        vetEBikes.set(index, eBike);
    }

    public void excluir(EBike eBike, int index) {
        vetEBikes.remove(index);
    }
}