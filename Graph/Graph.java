package finalodevi2;

class Vertex {

    public char vertex;
    public boolean wasVisited;

    public Vertex(char vertex) {
        this.vertex = vertex;
        wasVisited = false;
    }
}

public class Graph {

    private final int MAX_VERTEX_NUM = 6;
    public Vertex vertexList[];
    public int adjMat[][];
    protected int vertexSayisi;

    public Graph() {
        vertexList = new Vertex[MAX_VERTEX_NUM];
        adjMat = new int[MAX_VERTEX_NUM][MAX_VERTEX_NUM];
        vertexSayisi = 0;
        for (int i = 0; i < MAX_VERTEX_NUM; i++) {
            for (int j = 0; j < MAX_VERTEX_NUM; j++) {
                adjMat[i][j] = 0;
            }
        }

    }

    public boolean doluMu() {
        return MAX_VERTEX_NUM == vertexSayisi;
    }

    public void vertexEkle(char vertex) {
        // vertex ekleyen metot
        if (!doluMu()) {
            vertexList[vertexSayisi++] = new Vertex(vertex);
        }
    }

    public void kenarEkle(int baslangic, int bitis, int agirlik) {
        // kenar ve kenar ağırlığını ekleyen metot
        adjMat[baslangic][bitis] = agirlik;
        adjMat[bitis][baslangic] = agirlik;
    }

    public boolean varMi(char vertex) {
        // Arayüzden ekelenen vertex önceden eklenmiş mi diye kontrol eden metot
        for (int i = 0; i < vertexSayisi; i++) {
            if (vertexList[i].vertex == vertex) {
                return true;
            }
        }
        return false;
    }

    public int getIndex(char x) {
        // vertex'in vertex listesindeki indisini geri göderen metot
        for (int i = 0; i < vertexSayisi; i++) {
            if (vertexList[i].vertex == x) {
                return i;
            }
        }
        return -1;
    }

    public boolean bagliMi(int i, int j) {

        return adjMat[i][j] != 0;
    }

    void printGraph() {
        // komşuluk matrisini ekrana yazdıran metot
        for (int i = 0; i < MAX_VERTEX_NUM; i++) {
            for (int j = 0; j < MAX_VERTEX_NUM; j++) {
                System.out.print(adjMat[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("-------------------------------------");
    }

}
