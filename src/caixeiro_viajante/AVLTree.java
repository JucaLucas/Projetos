package caixeiro_viajante;

public class AVLTree {
	    private Node root;

	    private class Node {
	        int key;
	        int height;
	        Node left, right;

	        Node(int d) {
	            key = d;
	            height = 1;
	        }
	    }

	    // Retorna a altura de um nó
	    private int height(Node N) {
	        if (N == null)
	            return 0;
	        return N.height;
	    }

	    // Retorna o máximo de dois números inteiros
	    private int max(int a, int b) {
	        return (a > b) ? a : b;
	    }

	    // Rotaciona à direita subárvore enraizada em y
	    private Node rightRotate(Node y) {
	        Node x = y.left;
	        Node T2 = x.right;

	        // Realiza a rotação
	        x.right = y;
	        y.left = T2;

	        // Atualiza alturas
	        y.height = max(height(y.left), height(y.right)) + 1;
	        x.height = max(height(x.left), height(x.right)) + 1;

	        // Retorna novo nó raiz
	        return x;
	    }

	    // Rotaciona à esquerda subárvore enraizada em x
	    private Node leftRotate(Node x) {
	        Node y = x.right;
	        Node T2 = y.left;

	        // Realiza a rotação
	        y.left = x;
	        x.right = T2;

	        // Atualiza alturas
	        x.height = max(height(x.left), height(x.right)) + 1;
	        y.height = max(height(y.left), height(y.right)) + 1;

	        // Retorna novo nó raiz
	        return y;
	    }

	    // Retorna o fator de balanceamento do nó N
	    private int getBalance(Node N) {
	        if (N == null)
	            return 0;
	        return height(N.left) - height(N.right);
	    }

	    // Insere um novo nó com a chave d na subárvore enraizada no nó raiz y
	    private Node insert(Node node, int key) {
	        // Realiza a inserção normal de BST
	        if (node == null)
	            return (new Node(key));

	        if (key < node.key)
	            node.left = insert(node.left, key);
	        else if (key > node.key)
	            node.right = insert(node.right, key);
	        else // Duplicatas não são permitidas
	            return node;

	        // Atualiza a altura do nó pai
	        node.height = 1 + max(height(node.left), height(node.right));

	        // Obtém o fator de balanceamento deste nó para verificar se ele se tornou desequilibrado
	        int balance = getBalance(node);

	        // Caso de desequilíbrio à esquerda-esquerda
	        if (balance > 1 && key < node.left.key)
	            return rightRotate(node);

	        // Caso de desequilíbrio à direita-direita
	        if (balance < -1 && key > node.right.key)
	            return leftRotate(node);

	        // Caso de desequilíbrio à esquerda-direita
	        if (balance > 1 && key > node.left.key) {
	            node.left = leftRotate(node.left);
	            return rightRotate(node);
	        }

	        // Caso de desequilíbrio à direita-esquerda
	        if (balance < -1 && key < node.right.key) {
	            node.right = rightRotate(node.right);
	            return leftRotate(node);
	        }

	        // Nenhuma rotação foi necessária
	        return node;
	    }

	    // Método público para inserção
	    public void insert(int key) {
	        root = insert(root, key);
	    }

	    // Função auxiliar que retorna o nó com o valor mínimo encontrado na árvore
	    private Node minValueNode(Node node) {
	        Node current = node;

	        // Percorre a árvore para encontrar o nó mais à esquerda
	        while (current.left != null)
	            current = current.left;

	        return current;
	    }
	 // Busca um valor na árvore
	    public boolean search(int key) {
	        return search(root, key);
	    }

	    // Função auxiliar para realizar a busca
	    private boolean search(Node node, int key) {
	        if (node == null) {
	            
	    return false; // Valor não encontrado
	        }

	        if (key == node.key) {
	            return true; // Valor encontrado
	        } else if (key < node.key) {
	            return search(node.left, key);
	        } else {
	            return search(node.right, key);
	        }
	    }


	    // Deleta um nó com chave d da subárvore enraizada em y
	    private Node deleteNode(Node root, int key) {
	        // Realiza a exclusão normal de BST
	        if (root == null)
	            return root;

	        // Se a chave a ser excluída está menor que a raiz, então ela está na subárvore à esquerda
	        if (key < root.key)
	            root.left = deleteNode(root.left, key);

	        // Se a chave a ser excluída está maior que a raiz, então ela está na subárvore à direita
	        else if (key > root.key)
	            root.right = deleteNode(root.right, key);

	        // Se a chave a ser excluída é igual à raiz, então este é o nó a ser excluído
	        else {
	            // Nó com apenas um filho ou sem filho
	            if ((root.left == null) || (root.right == null)) {
	                Node temp = null;
	                if (temp == root.left)
	                    temp = root.right;
	                else
	                    temp = root.left;

	                // Caso sem filho
	                if (temp == null) {
	                    temp = root;
	                    root = null;
	                } else // Caso de um filho
	                    root = temp; // Copia os conteúdos do nó não nulo
	            } else {
	                // Nó com dois filhos: Obtém o sucessor em ordem (o menor à direita)
	                Node temp = minValueNode(root.right);

	                // Copia o sucessor em ordem para este nó
	                root.key = temp.key;

	                // Exclui o sucessor em ordem
	                root.right = deleteNode(root.right, temp.key);
	            }
	        }

	        // Se a árvore tinha apenas um nó, então retorna
	        if (root == null)
	            return root;

	        // Atualiza a altura do nó atual
	        root.height = max(height(root.left), height(root.right)) + 1;

	        // Obtém o fator de balanceamento deste nó para verificar se ele se tornou desequilibrado
	        int balance = getBalance(root);

	        // Caso de desequilíbrio à esquerda-esquerda
	        if (balance > 1 && getBalance(root.left) >= 0)
	            return rightRotate(root);

	        // Caso de desequilíbrio à esquerda-direita
	        if (balance > 1 && getBalance(root.left) < 0) {
	            root.left = leftRotate(root.left);
	            return rightRotate(root);
	        }

	        // Caso de desequilíbrio à direita-direita
	        if (balance < -1 && getBalance(root.right) <= 0)
	            return leftRotate(root);

	        // Caso de desequilíbrio à direita-esquerda
	        if (balance < -1 && getBalance(root.right) > 0) {
	            root.right = rightRotate(root.right);
	            return leftRotate(root);
	        }

	        return root;
	    }

	    // Método público para exclusão
	    public void delete(int key) {
	        root = deleteNode(root, key);
	    }

	    // Função auxiliar para percorrer a árvore em ordem
	    private void inorderTraversal(Node root) {
	        if (root != null) {
	            inorderTraversal(root.left);
	            System.out.print(root.key + " ");
	            inorderTraversal(root.right);
	        }
	    }

	    // Método público para percorrer a árvore em ordem
	    public void inorderTraversal() {
	        inorderTraversal(root);
	        
	        
	    }
	    
	
   }

	    


