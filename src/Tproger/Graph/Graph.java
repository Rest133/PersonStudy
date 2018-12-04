package Tproger.Graph;

import java.util.*;
import java.util.concurrent.DelayQueue;

public class Graph {
    private final int MAX_VERTS = 20;
    private Vertex vertexList[];
    private int adjMat[][];
    private int nVerts;

    public Graph() {
        vertexList = new Vertex[MAX_VERTS];
        adjMat = new int[MAX_VERTS][MAX_VERTS];
        nVerts = 0;
        for (int j = 0; j < MAX_VERTS; j++) {
            for (int k = 0; k < MAX_VERTS; k++) {
                adjMat[j][k] = 0;
            }
        }
    }

    public void addVertex(char lab) {
        vertexList[nVerts++] = new Vertex(lab);
    }

    public void addEdge(int start, int end) {
        adjMat[start][end] = 1;
        adjMat[end][start] = 1;
    }

    public void displayVertex(int v) {
        System.out.println(vertexList[v].label);
    }

    public int getAdjUnvisitedVertex(int v) {
        for (int j = 0; j < nVerts; j++) {
            if (adjMat[v][j] == 1 && vertexList[j].wasVisited == false) {
                return j;
            }
        }
        return -1;//смежных вершин не осталось или их просто нет
    }

    public void dfs() {
        vertexList[0].wasVisited = true;//Пометка
        displayVertex(0);
        Stack theStack = new Stack();
        theStack.push(0);

        while (!theStack.isEmpty()) {
            int v = getAdjUnvisitedVertex((int) theStack.peek());
            if (v == -1) theStack.pop();
            else {
                vertexList[v].wasVisited = true;
                displayVertex(v);
                theStack.push(v);
            }
        }
        for (int j = 0; j < nVerts; j++) {
            vertexList[j].wasVisited = false;
        }
    }

    public void bfs() // Обход в ширину
    { // Алгоритм начинает с вершины 0
        vertexList[0].wasVisited = true; // Пометка
        displayVertex(0); // Вывод
        Queue theQueue = new Queue();
        theQueue.insert(0); // Вставка в конец очереди
        int v2;
        while (!theQueue.isEmpty()) // Пока очередь не опустеет
        {
            int v1 = theQueue.remove(); // Извлечение вершины в начале очереди
// Пока остаются непосещенные соседи
            while ((v2 = getAdjUnvisitedVertex(v1)) != -1) { // Получение вершины
                vertexList[v2].wasVisited = true; // Пометка
                displayVertex(v2); // Вывод
                theQueue.insert(v2); // Вставка
            }
        }
// Очередь пуста, обход закончен
        for (int j = 0; j < nVerts; j++) // Сброс флагов
            vertexList[j].wasVisited = false;
    }


}