package com.graph;

public class Graph {

    private int adjMatrix[][];
    private int vertices;

    public Graph(int numVertices)
    {
        this.vertices=numVertices;
        adjMatrix=new int[vertices][vertices];
    }

//    working with edge
//    Adding edge
    public void addEdge(int node, int connectedNode)
    {
        int i=node,j=connectedNode;
        adjMatrix[i][j]=1;
        adjMatrix[j][i]=1;
    }

//   Removing edge
public void removeEdge(int node, int connectedNode)
{
    int i=node,j=connectedNode;
    adjMatrix[i][j]=0;
    adjMatrix[j][i]=0;
}

public void displayGraph()
{
    int n=adjMatrix.length;
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            System.out.print(adjMatrix[i][j]+" ");
        }
        System.out.println();
    }
}

//addVertics
    public void addVertex()
    {
        int[][] newAdjMatrix=new int[vertices+1][vertices+1];
        int n=vertices+1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++) {
                newAdjMatrix[i][j] = adjMatrix[i][j];
            }
        }
        adjMatrix=newAdjMatrix;
        vertices++;
    }

    //removeVertics
    public void removeVertex(int v)
    {
        int[][] newAdjMatrix=new int[vertices-1][vertices-1];
        int newI = 0;
        for (int i = 0; i < vertices-1; i++) {
            if (i == v) continue;  // skip the row to be removed

            int newJ = 0;
            for (int j = 0; j < vertices-1; j++) {
                if (j == v) continue;  // skip the column to be removed

                newAdjMatrix[newI][newJ] = adjMatrix[i][j];
                newJ++;
            }
            newI++;
        }
        adjMatrix = newAdjMatrix;
        vertices--;
    }

}
