package profundidade;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class BuscaProfundidade {

	private int numV;
	private List<List<Integer>> listaAdjacencia;

	public BuscaProfundidade(int numV) {

		this.numV = numV;
		this.listaAdjacencia = new ArrayList<>(numV);

		for (int i = 0; i < numV; i++) {

			listaAdjacencia.add(new ArrayList<>());

		}
	}

	// método para inserir um novo vértice (nó) no grafo

	public void addAresta(int origem, int destino) {

		listaAdjacencia.get(origem).add(destino);
		listaAdjacencia.get(destino).add(origem);

	}

	// método para realizar a busca em profundidade

	public void profundidade(int verticeInicial) {

		boolean[] visitado = new boolean[numV];
		Stack<Integer> pilha = new Stack<>();

		visitado[verticeInicial] = true;
		pilha.push(verticeInicial);

		while (!pilha.isEmpty()) {

			int verticeVisitado = pilha.pop();

			System.out.print(verticeVisitado + " ");
			List<Integer> vizinhanca = listaAdjacencia.get(verticeVisitado);

			for (int v : vizinhanca) {

				if (!visitado[v]) {

					visitado[v] = true;

					pilha.push(v);

				}

			}

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BuscaProfundidade bf = new BuscaProfundidade(6);

		bf.addAresta(0, 1);
		bf.addAresta(0, 2);
		bf.addAresta(1, 3);
		bf.addAresta(2, 3);
		bf.addAresta(2, 4);
		bf.addAresta(3, 5);
		bf.addAresta(4, 5);

		bf.profundidade(0);

	}

}
